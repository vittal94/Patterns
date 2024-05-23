package org.example.kotlinCode.chainOfResponsibility.technicalSupport





abstract class AbstractSupportCenterHandler(private val requestType: RequestType) {
    enum class RequestType {
        TECHNICAL, BILL, CUSTOMER_SATISFACTION, UNKNOWN
    }

    open var nextHandler: AbstractSupportCenterHandler? = null

    open fun nextHandler(handler: AbstractSupportCenterHandler) {
        this.nextHandler = handler
    }

    open fun receiveRequest(requestType: RequestType, message: String): String {
        when(this.requestType == requestType) {
            true -> return handleRequest(message)
            else -> return nextHandler?.receiveRequest(requestType, message)
                ?: return "No next handler for this request"
        }
    }

    protected abstract fun handleRequest(message: String): String
}

class TechnicalSupportCenter(requestType: RequestType) : AbstractSupportCenterHandler(requestType) {
    override var nextHandler: AbstractSupportCenterHandler? =
        BillSupportCenter(RequestType.BILL)

    override fun handleRequest(message: String): String {
        return "Handler: TechnicalSupportHandler - request: $message"
    }
}

class BillSupportCenter(requestType: RequestType) : AbstractSupportCenterHandler(requestType) {
    override var nextHandler: AbstractSupportCenterHandler? =
        CustomerSatisfactionSupportCenter(RequestType.CUSTOMER_SATISFACTION)

    override fun handleRequest(message: String): String {
        return "Handler: BillSupportHandler - request: $message"
    }
}

class CustomerSatisfactionSupportCenter(
    requestType: RequestType
) : AbstractSupportCenterHandler(requestType) {
    override var nextHandler: AbstractSupportCenterHandler? = null
    override fun handleRequest(message: String): String {
        return "Handler: CustomerSatisfactionSupportCenter  - request: $message"
    }
}

object SupportCenterClient {
    val technicalHandler =
        TechnicalSupportCenter(AbstractSupportCenterHandler.RequestType.TECHNICAL)
}

fun test() {
     SupportCenterClient.technicalHandler
        .receiveRequest(
            AbstractSupportCenterHandler.RequestType.BILL,
            "technical issue."
        ).run(::println)

}

fun main() {
test()
}