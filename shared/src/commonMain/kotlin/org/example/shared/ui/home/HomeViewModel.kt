package org.example.shared.ui.home

import cafe.adriel.voyager.core.model.ScreenModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ScreenModel {

    private val _mustShowDialog = MutableStateFlow(false)
    val mustShowDialog = _mustShowDialog.asStateFlow()

    fun showDialog() {
        _mustShowDialog.value = true
    }

    fun hideDialog() {
        _mustShowDialog.value = false
    }
}