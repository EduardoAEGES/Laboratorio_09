package com.miempresa.laboratorio_09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstScreen()
        }
    }
}
@Composable
fun FirstScreen(){
    var dato by remember {
        mutableStateOf(0)
    }
    Box(contentAlignment = Alignment.Center, modifier = Modifier
        .fillMaxSize()
        .background(brush = Brush.linearGradient(listOf(Color.Cyan, Color.Yellow)))
        .padding(horizontal = 40.dp)
    ){
        Column(
            modifier = Modifier
                .background(Color.White)
                .height(400.dp)
                .width(250.dp)
        ) {
            Text(
                text = "ESTO ES UN BOTÓN:",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(81, 15, 37, 255),
                fontStyle = FontStyle.Normal,
                fontFamily = FontFamily.Monospace)
            Button(
                onClick = {dato++},
                colors = ButtonDefaults.buttonColors(Color.Magenta)) {
                Text(text = "PRESIONE", fontSize = 30.sp)
            }
            Text(text = "Se ha presionado $dato veces", fontSize = 30.sp)

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Previo(){
    FirstScreen()
}