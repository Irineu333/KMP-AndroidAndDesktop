package org.example.shared.ui.feature.app

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material.icons.twotone.LockClock
import androidx.compose.material.icons.twotone.Watch
import androidx.compose.material.icons.twotone.WatchLater
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import org.example.shared.core.getPlatform
import org.example.shared.components.SharedDialog
import org.example.shared.core.viewmodel.sharedViewModel
import org.example.shared.ui.feature.stopwatch.StopWatchScreen

@Composable
fun App(
    viewModel: AppViewModel = sharedViewModel()
) {

    val mustShowDialog = viewModel.mustShowDialog.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Text("Hello, ${getPlatform()}")

        Spacer(Modifier.height(8.dp))

        Button(
            onClick = {
                viewModel.showDialog()
            }
        ) {
            Text("open StopWatch")
        }
    }

    if (mustShowDialog.value) {
        SharedDialog(
            icon = rememberVectorPainter(Icons.TwoTone.WatchLater),
            title = "Stop Watch",
            onCloseRequest = {
                viewModel.hideDialog()
            }
        ) {
            StopWatchScreen(Modifier.padding(16.dp))
        }
    }
}