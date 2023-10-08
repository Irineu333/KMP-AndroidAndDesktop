package org.example.shared.core

import kotlinx.coroutines.MainScope

actual open class SharedViewModel actual constructor() {

    actual val scope = MainScope()

}