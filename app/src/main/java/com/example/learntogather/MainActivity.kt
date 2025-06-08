package com.example.learntogather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogather.ui.theme.LearnTogatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogatherTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    GreetingImage("JetPack Compose Tutorial", "Jetpack Compose is a modern toolkit for building native Android UI.Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs", "In this tutorial, you'll build a simple UI component with declarative functions. You won't be editing any XML layouts or using the Layout Editor.Instead, you will call composable functions to define what elements you want, and the Compose compiler will do the rest. Compose is built around composable functions.nThese functions let you define your apps UI programmatically by describing how it should look and providing data dependencies, rather than focusing on the process of the UI's construction (initializing an element, attaching it to a parent, etc.).To create a composable function, just add the @Composable annotation to the function name\")")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(title: String, description: String, content: String) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column {
        Image(
            painter = image,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(16.dp))
        GreetingText(
            title = title,
            description = description,
            content = content,
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun GreetingText(title: String, description: String, content: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = description,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(
                start=16.dp,
                end=16.dp
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = content,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogatherTheme {
        GreetingImage("JetPack Compose Tutorial", "Jetpack Compose is a modern toolkit for building native Android UI.Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs", "In this tutorial, you'll build a simple UI component with declarative functions. You won't be editing any XML layouts or using the Layout Editor.Instead, you will call composable functions to define what elements you want, and the Compose compiler will do the rest. Compose is built around composable functions.nThese functions let you define your apps UI programmatically by describing how it should look and providing data dependencies, rather than focusing on the process of the UI's construction (initializing an element, attaching it to a parent, etc.).To create a composable function, just add the @Composable annotation to the function name")
    }
}
