package org.example.shared.core.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope as androidViewModelScope

actual abstract class SharedViewModel : ViewModel() {

    actual val viewModelScope = androidViewModelScope

    public actual override fun onCleared() {
        super.onCleared()
    }

    actual fun clear() {
        // TODO: clear mCloseables and mBagOfTags
    }
}