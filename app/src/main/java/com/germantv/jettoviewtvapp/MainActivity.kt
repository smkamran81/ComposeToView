package com.germantv.jettoviewtvapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.germantv.jettoviewtvapp.ui.theme.JetToViewTVAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetToViewTVAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Hello, World!", onClick = {
                        val intent = Intent(this@MainActivity, ViewActivity::class.java)
                        intent.putExtra("EXTRA_MESSAGE", it)
                        startActivity(intent)
                    })
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String, onClick: (String) -> Unit) {
    Column {
        Text(text = message)
        Button(onClick = { onClick("testing") }) {
            Text(text = "Go to View Activity")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetToViewTVAppTheme {
        //Greeting("Android")
    }
}