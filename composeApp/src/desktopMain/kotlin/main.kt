import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.bhojak.ricky.cmp.App
import com.bhojak.ricky.cmp.di.initKoin

fun main() = application {
    initKoin {}
    Window(
        title = "Rick N Morty KMM",
        state = rememberWindowState(width = 400.dp, height = 800.dp),
        onCloseRequest = ::exitApplication,
    ) { App() }
}