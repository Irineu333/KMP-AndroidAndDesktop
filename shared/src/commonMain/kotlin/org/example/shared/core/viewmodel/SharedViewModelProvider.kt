package org.example.shared.core.viewmodel

import kotlin.reflect.KClass

class SharedViewModelProvider(
    private val store: SharedViewModelStore
) {
    constructor(
        owner: SharedViewModelStoreOwner
    ) : this(owner.viewModelStore)

    @Suppress("UNCHECKED_CAST")
    fun <T : SharedViewModel> provide(clazz: KClass<T>): T {

        val key = clazz.qualifiedName ?: throw IllegalArgumentException("Invalid class name")

        val cached = store[key]

        if (clazz.isInstance(cached)) {
            return cached as T
        }

        // TODO: implement factory
        store.put(key, clazz.java.getDeclaredConstructor().newInstance())

        return store[key] as T
    }
}