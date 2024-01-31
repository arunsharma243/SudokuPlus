package com.example.sudokuplus.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sudokuplus.ui.theme.BlueCustom

@Preview
@Composable
fun HomeScreen() {

    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement= Arrangement.Center
    ) {
//        Spacer(modifier = Modifier
//            .height(150.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "SUDOKU",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = BlueCustom,
                textAlign = TextAlign.Center
            )
        }
//        Spacer(modifier = Modifier
//            .height(100.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f)){
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
                    .align(Alignment.Center),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = BlueCustom,
                    contentColor = Color.White
                )

            ) {
                Text(
                    text = "Play a Game",
                    modifier = Modifier,
                    style = MaterialTheme.typography.titleLarge,

                    )
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = BlueCustom,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Solve a Sudoku",
                    style = MaterialTheme.typography.titleLarge

                )
            }
        }
    }
}