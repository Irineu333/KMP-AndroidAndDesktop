package org.example.shared.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
actual fun SharedDialog(
    title: String,
    icon: Painter?,
    size: DpSize,
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit
) = Dialog(
    onDismissRequest = onCloseRequest,
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.size(size)
    ) {
        Column(Modifier.padding(8.dp)) {
            Row {
                if (icon != null) {
                    Icon(
                        painter = icon,
                        contentDescription = null /* Decorative */
                    )
                }

                Spacer(Modifier.width(8.dp))

                Text(
                    text = title,
                    fontSize = 16.sp
                )
            }

            Spacer(Modifier.height(4.dp))

            content()
        }
    }
}