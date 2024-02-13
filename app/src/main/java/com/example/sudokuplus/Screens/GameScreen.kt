import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sudokuplus.R
import com.example.sudokuplus.ui.theme.BlueCustom

@Composable
fun GameScreen( ) {
    Column(modifier=Modifier
        .fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.18f)
                .padding(15.dp,5.dp,25.dp,5.dp)
        ) {

            Image(
                imageVector = Icons.Filled.KeyboardArrowLeft,
                contentDescription = "Back",
                modifier = Modifier
                    .size(40.dp)
                    .align(Alignment.TopStart)
                    .clickable { }
            )
            Text(
                text = "Sudoku+",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.TopCenter)
            )
            Box (modifier=Modifier
                .align(Alignment.BottomEnd)
                .width(40.dp)
            ){
                Timer()
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.80f)
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
        ) {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
//                .shadow(
//                    elevation = 10.dp,
//                   shape= RoundedCornerShape(20.dp)
//                )
                    .background(Color.White),
                contentAlignment = Alignment.Center

            ) {
                BoardBase()
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1f)
                    .padding(vertical=10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.undo),
                        contentDescription = "Undo",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {  }

                    )
                    Text(
                        text = "Undo",
                        modifier = Modifier.padding(vertical = 4.dp)


                    )

                }
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.reset),
                        contentDescription = "Reset",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {  }

                    )
                    Text(
                        text = "Reset",
                        modifier = Modifier.padding(vertical = 4.dp)

                    )
                }
            }

        }
        Row(
            modifier= Modifier
                .fillMaxSize()
                .padding(horizontal=10.dp,vertical=20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) {
            Box(modifier = Modifier
                .fillMaxWidth(1/9f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "1",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth(1/8f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "2",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth(1/7f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "3",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth(1/6f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "4",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth(1/5f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "5",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth(1/4f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "6",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth(1/3f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "7",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth(1/2f)
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "8",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                    textAlign = TextAlign.Center
                )
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .clickable {  },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "9",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueCustom,
                   textAlign = TextAlign.Center
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    GameScreen()
}