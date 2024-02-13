
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Locale



@Composable
fun Timer() {
    var formattedTime by remember { mutableStateOf("00:00") }
    val isActive = true
    var timeMillis = 0L
    var lastTimeStamp = 0L


    LaunchedEffect(isActive) {
        lastTimeStamp = System.currentTimeMillis()
        while (isActive) {
            delay(10L)
            timeMillis += System.currentTimeMillis() - lastTimeStamp
            lastTimeStamp = System.currentTimeMillis()
            formattedTime = formatTime(timeMillis-1800000)

        }
    }
    Text(
        text = formattedTime
    )
}
fun formatTime(timeMillis: Long): String {
    val localDateTime=LocalDateTime.ofInstant(
        Instant.ofEpochMilli(timeMillis),
        ZoneId.systemDefault()
    )
    val formatter=DateTimeFormatter.ofPattern(
        "mm:ss",
        Locale.getDefault()
    )
    return localDateTime.format(formatter)
}




@Preview(showBackground = true)
@Composable
fun TimerPreview() {
    Timer()
}