//Use this for the first button
package com.example.sudokuplus.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sudokuplus.R

@Composable
fun DummyScreen1(/*navController:NavController*/) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF8DCDCD)), contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
        {
            Image(painter = painterResource(id = R.drawable.app_image), contentDescription = "App logo")
            CircularProgressIndicator(color = Color(0xFF2472B0), strokeWidth = 3.2.dp, modifier = Modifier.size(50.dp))
            Text(text = "DummyScreen1",
                modifier = Modifier,
                style = MaterialTheme.typography.titleLarge,)
        }
    }
}

