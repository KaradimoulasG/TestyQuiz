package com.example.testyquiz

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.testyquiz.ui.theme.TestyQuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            TestyQuizTheme {
                TriviaApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppPreview() {
    TestyQuizTheme {
        TriviaApp()
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun AppPreviewNight() {
    TestyQuizTheme {
        TriviaApp()
    }
}