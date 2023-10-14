package org.example.shared.ui.app

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.example.shared.core.viewmodel.SharedViewModel

class AppViewModel : SharedViewModel() {

    private val _mustShowDialog = MutableStateFlow(false)
    val mustShowDialog = _mustShowDialog.asStateFlow()

    fun showDialog() {
        _mustShowDialog.value = true
    }

    fun hideDialog() {
        _mustShowDialog.value = false
    }
}