package org.example.shared.core.extension

fun Any.call(
    name: String,
    vararg args: Any?
) {
    val clazz = this::class.java

    clazz.getDeclaredMethod(name).also {
        it.isAccessible = true
        it.invoke(this, *args)
    }
}