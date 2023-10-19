package org.example.shared.ui.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import org.example.shared.ui.home.HomeScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(HomeScreen())
    }
}