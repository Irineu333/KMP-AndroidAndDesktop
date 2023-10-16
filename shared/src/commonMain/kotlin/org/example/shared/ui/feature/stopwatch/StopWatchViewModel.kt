package org.example.shared.ui.feature.stopwatch

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import  org.example.shared.core.viewmodel.SharedViewModel
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

class StopWatchViewModel : SharedViewModel() {

    private val _formattedTime = MutableStateFlow(formatTime(0L))
    val formattedTime = _formattedTime.asStateFlow()

    private var job: Job? = null

    private var timeMillis = 0L
    private var lastTimestamp = 0L

    fun start() {

        if (job?.isActive == true) return

        job = viewModelScope.launch {
            lastTimestamp = System.currentTimeMillis()

            while (true) {
                delay(10L)
                timeMillis += System.currentTimeMillis() - lastTimestamp

                lastTimestamp = System.currentTimeMillis()

                _formattedTime.value = formatTime(timeMillis)
            }
        }
    }

    fun pause() {
        job?.cancel()
    }

    fun reset() {
        job?.cancel()
        timeMillis = 0L
        lastTimestamp = 0L
        _formattedTime.value = formatTime(0L)
    }

    private fun formatTime(timeMillis: Long): String {

        val localDateTime = LocalDateTime.ofInstant(
            Instant.ofEpochMilli(timeMillis),
            ZoneId.systemDefault()
        )
        val formatter = DateTimeFormatter.ofPattern(
            "mm:ss:SS",
            Locale.getDefault()
        )

        return localDateTime.format(formatter)
    }
}