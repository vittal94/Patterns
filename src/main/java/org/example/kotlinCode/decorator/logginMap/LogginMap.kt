package org.example.kotlinCode.decorator.logginMap

abstract class BaseLoggedOperationMap<K,V>(
    protected val map: MutableMap<K,V> = mutableMapOf()
) : MutableMap<K,V> by map {
    protected abstract val logger:(s: String) -> Unit

    override fun put(key: K, value: V): V? {
        key?.let { logger("Log $it") }
        return map.put(key, value).apply {
            this?.let { logger("Change the value to $it") }
        }
    }
}
class LoggedOperationMap<K,V>(
     map: MutableMap<K,V> = mutableMapOf()
) : BaseLoggedOperationMap<K,V>(map) {
    override val logger: (s: String) -> Unit
        get() = {s -> println("LoggedOperationMap message $s") }
}

class CentralizedLoggedOperationMap<K,V>(
     map: MutableMap<K,V> = mutableMapOf()
) : BaseLoggedOperationMap<K,V>(map) {
    override val logger: (s: String) -> Unit
        get() = {s -> println("CentralizedLoggerMessage: $s") }

}

fun testLoggedOperationMap() {
    val logger  = CentralizedLoggedOperationMap<String,String>(LoggedOperationMap())
    logger["aaa"] = "bbb"
    logger["aaa"] = "ass"
}