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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sudokuplus.ScreenHolder
import com.example.sudokuplus.ui.theme.BlueCustom

@Composable
fun HomeScreen(navController: NavController) {
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
                text = "SUDOKU\r\nPLUS",
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
                onClick = {
                          navController.navigate(route=ScreenHolder.GameScreen.route)
                },
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
                    text = "New Game",
                    modifier = Modifier,
                    style = MaterialTheme.typography.titleLarge,
                    )
            }
            Button(
                onClick = {
                        navController.navigate(route=ScreenHolder.Dummy2.route)
                },
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
                    text = "Get your Sudoku solved",
                    style = MaterialTheme.typography.titleLarge
                )
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() 
{
    HomeScreen(navController = rememberNavController())
}
