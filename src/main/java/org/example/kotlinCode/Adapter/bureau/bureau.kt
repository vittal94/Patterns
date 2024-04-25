package org.example.kotlinCode.Adapter.bureau

interface UsCentralBank {
    fun pushHistories(histories: List<String>)
}

class DefaultCentralBank : UsCentralBank {
    override fun pushHistories(histories: List<String>) {
        println("sending histories: $histories to US Central Bank.")
    }
}

fun UsCentralBank.toCommonCreditHistory(): CommonCreditHistory {
    return object : CommonCreditHistory {
        override fun sendHistories(histories: Set<String>) {
            DefaultCentralBank().pushHistories(histories.toList())
        }

    }
}

fun perform(commonCreditHistory: CommonCreditHistory){
    val histories = setOf("First history","second history")
    commonCreditHistory.sendHistories(histories)
}

fun testBureau() {
    val usCentralBankAdaptToCommon = DefaultCentralBank().toCommonCreditHistory()
    perform(usCentralBankAdaptToCommon)
}

fun interface L {
    fun toSome()
}