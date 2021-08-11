package com.dheeraj.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dheeraj.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Compose", "Welcome to Android!"))
        }
    }

    data class Message(val name: String, val message: String)

    @Composable
    fun MessageCard(message: Message) {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_jetpack_compose),
                contentDescription = "Sample Image",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(width = 10.dp))
            
            Column {
                Text(text = "Hello, ${message.name}!")
                Spacer(modifier = Modifier.height(height = 5.dp))
                Text(text = message.message)
            }
        }

    }

    @Preview
    @Composable
    fun DefaultPreview() {
        ComposeTutorialTheme {
            MessageCard(Message("Compose", "Welcome to Android!"))
        }
    }
}