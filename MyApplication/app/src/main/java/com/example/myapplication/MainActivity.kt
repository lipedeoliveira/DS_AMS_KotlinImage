package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface( modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingImage (
                        message = getString(R.string.ds_text),
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,modifier: Modifier = Modifier) {

    Column (

        verticalArrangement = Arrangement.Center,
        modifier = modifier

    )
    {
        Text(
            text = message,
            fontSize = 40.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )

    }
}
@Composable
fun GreetingImage(message: String,  modifier: Modifier = Modifier) {

    Box(modifier) {
        Image (
            painter = painterResource(id = R.drawable.programing),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F
        )
        GreetingText (
            message = message,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)

        )
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {

        GreetingImage (
            message = stringResource(R.string.ds_text)
        )

    }
}
