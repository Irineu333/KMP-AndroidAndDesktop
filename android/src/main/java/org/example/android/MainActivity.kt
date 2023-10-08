package org.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.example.shared.ui.app.App
import org.example.shared.ui.app.AppViewModel

class MainActivity : ComponentActivity() {

    private val appViewModel by viewModels<AppViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(appViewModel)
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    App(AppViewModel())
}