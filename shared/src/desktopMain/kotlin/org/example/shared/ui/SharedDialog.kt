package org.example.shared.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogState
import androidx.compose.ui.window.rememberDialogState

@Composable
actual fun SharedDialog(
    title: String,
    icon: Painter?,
    size: DpSize,
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit
) = Dialog(
    title = title,
    icon = icon,
    state = rememberDialogState(
        width = size.width,
        height = size.height
    ),
    onCloseRequest = onCloseRequest
) {
    content()
}