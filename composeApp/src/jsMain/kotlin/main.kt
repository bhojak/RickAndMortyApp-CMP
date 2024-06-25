import com.bhojak.ricky.cmp.App
import com.bhojak.ricky.cmp.di.initKoin
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    initKoin {}
    onWasmReady {
        BrowserViewportWindow("Rick N Morty KMM") {
            App()
        }
    }
}
