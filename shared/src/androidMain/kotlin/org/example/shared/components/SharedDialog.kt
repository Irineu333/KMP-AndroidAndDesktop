package org.example.shared.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
) = Dialog(onCloseRequest) {

    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = if (size == DpSize.Unspecified) {
            Modifier
        } else {
            Modifier.size(size)
        }
    ) {
        Column {
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (icon != null) {
                    Icon(
                        painter = icon,
                        contentDescription = null, /* Decorative */
                        Modifier.size(18.dp)
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