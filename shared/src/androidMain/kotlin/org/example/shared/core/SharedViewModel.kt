package org.example.shared.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

actual abstract class SharedViewModel : ViewModel() {
    actual val scope = viewModelScope
}