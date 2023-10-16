package org.example.shared.ui.feature.stopwatch

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.shared.core.viewmodel.sharedViewModel

@Composable
fun StopWatchScreen(
    modifier: Modifier = Modifier,
    viewModel: StopWatchViewModel = sharedViewModel()
) = Column(
    modifier = modifier,
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Text(
        text = viewModel.formattedTime.collectAsState().value,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        color = Color.Black,
    )

    Spacer(Modifier.height(16.dp))

    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(viewModel::start) {
            Text("Start")
        }

        Button(viewModel::pause) {
            Text("Pause")
        }
        Button(viewModel::reset) {
            Text("Reset")
        }
    }
}