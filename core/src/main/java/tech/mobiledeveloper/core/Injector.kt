@file:Suppress("UNCHECKED_CAST")

package tech.mobiledeveloper.core

object Injector {
    private val dependencies = mutableMapOf<String, Any>()

    fun <T: Any> putDependency(key: String, value: T) {
        dependencies[key] = value
    }

    fun <T: Any> getDependency(key: String) : T {
        return dependencies[key] as T
    }

    const val cart = "CartRepository"
    const val user = "UserRepository"
}