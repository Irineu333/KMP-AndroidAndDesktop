package org.example.shared.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

@Composable
expect fun SharedDialog(
    title: String /* For desktop */,
    icon: Painter? = null,
    size: DpSize = DpSize(200.dp, 150.dp),
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit
)