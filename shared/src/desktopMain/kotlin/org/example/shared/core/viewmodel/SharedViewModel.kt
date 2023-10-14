package org.example.shared.core.viewmodel

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

actual abstract class SharedViewModel {

    actual val viewModelScope = MainScope()

    actual fun onCleared() { viewModelScope.cancel() }
    
    actual fun clear() {
        // TODO: clear ViewModel
    }
}