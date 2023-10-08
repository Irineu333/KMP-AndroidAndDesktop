package org.example.desktop

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.example.shared.ui.app.App
import org.example.shared.ui.app.AppViewModel

fun main() {

    val viewModel = AppViewModel()

    application {

        Window(
            onCloseRequest = ::exitApplication,
            title = "Compose for Desktop",
            state = rememberWindowState(width = 300.dp, height = 300.dp)
        ) {
            App(viewModel)
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {
    App(AppViewModel())
}