import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoardBase() {
    Canvas(
        modifier= Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            //.padding(5.dp)
    ){

        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*1/9,y=0f),
            end= Offset(x=size.width*1/9,y=size.height)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*2/9,y=0f),
            end= Offset(x=size.width*2/9,y=size.height)
        )

        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*4/9,y=0f),
            end= Offset(x=size.width*4/9,y=size.height)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*5/9,y=0f),
            end= Offset(x=size.width*5/9,y=size.height)
        )

        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*7/9,y=0f),
            end= Offset(x=size.width*7/9,y=size.height)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*8/9,y=0f),
            end= Offset(x=size.width*8/9,y=size.height)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width,y=0f),
            end= Offset(x=size.width,y=size.height)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=0f),
            end= Offset(x=size.width,y=0f)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*1/9),
            end= Offset(x=size.width,y=size.height*1/9)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*2/9),
            end= Offset(x=size.width,y=size.height*2/9)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*3/9),
            end= Offset(x=size.width,y=size.height*3/9)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*4/9),
            end= Offset(x=size.width,y=size.height*4/9)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*5/9),
            end= Offset(x=size.width,y=size.height*5/9)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*6/9),
            end= Offset(x=size.width,y=size.height*6/9)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*7/9),
            end= Offset(x=size.width,y=size.height*7/9)
        )
        drawLine(
            color= Color.Gray,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height*8/9),
            end= Offset(x=size.width,y=size.height*8/9)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=size.height),
            end= Offset(x=size.width,y=size.height)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=0f,y=0f),
            end= Offset(x=0f,y=size.height)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*3/9,y=0f),
            end= Offset(x=size.width*3/9,y=size.height)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width*6/9,y=0f),
            end= Offset(x=size.width*6/9,y=size.height)
        )
        drawLine(
            color= Color.Black,
            strokeWidth = 5f,
            cap= StrokeCap.Round,
            start= Offset(x=size.width,y=0f),
            end= Offset(x=size.width,y=size.height)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoardBasePreview() {
    BoardBase()
}