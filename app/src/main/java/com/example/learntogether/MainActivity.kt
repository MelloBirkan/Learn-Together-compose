package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      LearnTogetherTheme {
       Surface {
         Content()
       }
      }
    }
  }
}

@Composable
fun Content() {
  val headerImage = painterResource(R.drawable.bg_compose_background)

  Column {
    Image(headerImage, contentDescription = null, contentScale = ContentScale.Fit)

    Text(
      "Jetpack Compose tutorial",
      fontSize = 24.sp,
      modifier = Modifier
        .padding(16.dp)
      )

    BodyText(
      stringResource(R.string.main_text),
      Modifier
        .padding(horizontal = 16.dp)
      )

    BodyText(
      stringResource(R.string.description),
      Modifier
        .padding(16.dp)
    )
  }

}

@Composable
private fun BodyText(text: String, modifier: Modifier) {
  Text(
    text,
    modifier,
    textAlign = TextAlign.Justify,
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  LearnTogetherTheme {
    Content()
  }
}