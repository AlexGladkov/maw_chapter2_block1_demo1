package tech.mobiledeveloper.block1example1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tech.mobiledeveloper.block1example1.ui.theme.Block1Example1Theme
import tech.mobiledeveloper.cart_impl.CartRepositoryImpl
import tech.mobiledeveloper.core.Injector
import tech.mobiledeveloper.user_impl.UserRepositoryImpl

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Injector.putDependency(Injector.cart, CartRepositoryImpl())
        Injector.putDependency(Injector.user, UserRepositoryImpl())

        setContent {
            Block1Example1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Block1Example1Theme {
        Greeting("Android")
    }
}