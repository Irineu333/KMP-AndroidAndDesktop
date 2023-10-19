package org.example.shared.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import org.example.shared.core.getPlatform
import org.example.shared.components.SharedDialog

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        HomeContent(
            viewModel = rememberScreenModel {
                HomeViewModel()
            },
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun HomeContent(
    viewModel: HomeViewModel,
    modifier: Modifier = Modifier
) = Box(
    contentAlignment = Alignment.Center,
    modifier = modifier
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