package com.example.ariketa2zoriontzekotxartela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ariketa2zoriontzekotxartela.ui.theme.Ariketa2ZoriontzekoTxartelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ariketa2ZoriontzekoTxartelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ZorionakTxartela(
                        mezuak = "Zorionak Mikel!",
                        sinadura = "Josebaren partez",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

    }
}

@Composable
fun ZorionakTxartela(mezuak: String, sinadura: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Irudikatu(modifier = Modifier.fillMaxSize())

        Text(
            text = mezuak,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF1493),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        )

        Text(
            text = sinadura,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Cyan,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp)
        )
    }
}

@Composable
fun Irudikatu(modifier: Modifier = Modifier){
    val irudia = painterResource(R.drawable.androidirudia)
    Image(
        painter = irudia,
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true)
@Composable
fun ZorionakTxartelaPreview() {
    Ariketa2ZoriontzekoTxartelaTheme {
        ZorionakTxartela(mezuak = "Zorionak Mikel!", sinadura = "Josebaren partez")
    }
}