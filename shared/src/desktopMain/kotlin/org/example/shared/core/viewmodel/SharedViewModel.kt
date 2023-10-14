package org.example.shared.core.viewmodel

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

actual abstract class SharedViewModel {

    private var hasCleared = false

    actual val viewModelScope by lazy {
        val scope = MainScope()

        if (hasCleared) {
            scope.cancel()
        }

        scope
    }

    actual fun onCleared() { }

    actual fun clear() {
        hasCleared = true

        // TODO: clear ViewModel
    }
}