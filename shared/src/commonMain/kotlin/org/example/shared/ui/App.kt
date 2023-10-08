package org.example.shared.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.twotone.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import org.example.shared.core.getPlatform

@Composable
fun App() = MaterialTheme {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        val mustShowDialog = remember { mutableStateOf(false) }

        Button(
            onClick = {
                mustShowDialog.value = true
            }
        ) {
            Text("click me")
        }

        if (mustShowDialog.value) {
            SharedDialog(
                icon = rememberVectorPainter(Icons.TwoTone.Home),
                title = "Presentation",
                onCloseRequest = {
                    mustShowDialog.value = false
                }
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("Hello, ${getPlatform()}")
                }
            }
        }
    }
}