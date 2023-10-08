package org.example.shared.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

@Composable
expect fun SharedDialog(
    title: String,
    icon: Painter? = null,
    size: DpSize = DpSize(200.dp, 150.dp),
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit
)