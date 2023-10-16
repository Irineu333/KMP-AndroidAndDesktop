package org.example.shared.core.extension

fun Any.callPrivateMethod(
    clazz: Class<*> = this::class.java,
    name: String,
    vararg args: Any?
) {
    clazz.getDeclaredMethod(name).also {
        it.isAccessible = true
        it.invoke(this, *args)
    }
}