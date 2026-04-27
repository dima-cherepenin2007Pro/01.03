package com.example.cherepenin_pr

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
import com.example.cherepenin_pr.ui.theme.AppNavigation
import com.example.cherepenin_pr.ui.theme.Cherepenin_PrTheme
import com.example.cherepenin_pr.ui.theme.Pr_05_screen
import com.example.cherepenin_pr.ui.theme.Pr_06_screen
import com.example.cherepenin_pr.ui.theme.ButtomNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cherepenin_PrTheme {
                ButtomNavigation()
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
    AppNavigation()
}