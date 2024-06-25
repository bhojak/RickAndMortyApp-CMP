import androidx.compose.ui.window.ComposeUIViewController
import com.bhojak.ricky.cmp.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
