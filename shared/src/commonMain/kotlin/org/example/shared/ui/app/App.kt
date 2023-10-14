package org.example.shared.ui.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import org.example.shared.core.getPlatform
import org.example.shared.components.SharedDialog
import org.example.shared.core.viewmodel.sharedViewModel

@Composable
fun App(
    viewModel: AppViewModel = sharedViewModel()
) = MaterialTheme {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Button(
            onClick = {
                viewModel.showDialog()
            }
        ) {
            Text("click me")
        }

        val mustShowDialog = viewModel.mustShowDialog.collectAsState()

        if (mustShowDialog.value) {
            SharedDialog(
                icon = rememberVectorPainter(Icons.TwoTone.Home),
                title = "Presentation",
                onCloseRequest = {
                    viewModel.hideDialog()
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