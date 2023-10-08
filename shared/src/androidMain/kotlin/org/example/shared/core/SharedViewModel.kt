package org.example.shared.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

actual open class SharedViewModel actual constructor(): ViewModel() {

    actual val scope = viewModelScope

}