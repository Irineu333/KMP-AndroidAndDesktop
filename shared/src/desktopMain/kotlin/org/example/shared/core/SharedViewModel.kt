package org.example.shared.core

import kotlinx.coroutines.MainScope

actual abstract class SharedViewModel {
    actual val scope = MainScope()
}