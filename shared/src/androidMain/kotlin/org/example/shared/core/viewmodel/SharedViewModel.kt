package org.example.shared.core.viewmodel

import androidx.lifecycle.ViewModel
import org.example.shared.core.extension.call
import androidx.lifecycle.viewModelScope as androidViewModelScope

actual abstract class SharedViewModel : ViewModel() {

    actual val viewModelScope get() = androidViewModelScope

    public actual override fun onCleared() {
        super.onCleared()
    }

    actual fun clear() {
        call("clear")
    }
}