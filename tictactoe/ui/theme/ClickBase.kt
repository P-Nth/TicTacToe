package com.example.tictactoe.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Canvas
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ClickBase() {
    Canvas(
        modifier = Modifier
            .size(300.dp)
            .padding(10.dp)
    ) {
        drawLine(
            color = Dark_Blue,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*1/3, y = 0f),
            end = Offset(x = size.width*1/3, y = size.height)
        )
        drawLine(
            color = Dark_Blue,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = size.width*2/3, y = 0f),
            end = Offset(x = size.width*2/3, y = size.height)
        )
        drawLine(
            color = Dark_Blue,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*1/3),
            end = Offset(x = size.width, y = size.height*1/3)
        )
        drawLine(
            color = Dark_Blue,
            strokeWidth = 5f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*2/3),
            end = Offset(x = size.width, y = size.height*2/3)
        )
    }
}

@Composable
fun Cross(){
    Canvas(modifier = Modifier.size(60.dp).padding(5.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.width, y = size.height)
        )
        drawLine(
            color = Red200,
            strokeWidth = 20f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }
}

@Composable
fun Circle(){
    Canvas(modifier = Modifier.size(60.dp).padding(5.dp)) {
        drawCircle(
            color = Green200,
            style = Stroke(20f),
        )
    }
}

@Composable
fun WinHorLn1(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*1/6),
            end = Offset(x = size.width, y = size.height*1/6)
        )
    }
}

@Composable
fun WinHorLn2(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*3/6),
            end = Offset(x = size.width, y = size.height*3/6)
        )
    }
}

@Composable
fun WinHorLn3(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height*5/6),
            end = Offset(x = size.width, y = size.height*5/6)
        )
    }
}

@Composable
fun WinVerLn1(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.height*1/6, y = 0f),
            end = Offset(x = size.height*1/6, y = size.height)
        )
    }
}

@Composable
fun WinVerLn2(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.height*3/6, y = 0f),
            end = Offset(x = size.height*3/6, y = size.height)
        )
    }
}

@Composable
fun WinVerLn3(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = size.height*5/6, y = 0f),
            end = Offset(x = size.height*5/6, y = size.height)
        )
    }
}

@Composable
fun WinDiaLn1(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = 0f),
            end = Offset(x = size.height, y = size.height)
        )
    }
}

@Composable
fun WinDiaLn2(){
    Canvas(modifier = Modifier.size(300.dp)) {
        drawLine(
            color = Red200,
            strokeWidth = 10f,
            cap = StrokeCap.Round,
            start = Offset(x = 0f, y = size.height),
            end = Offset(x = size.width, y = 0f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun  Previews() {
    Cross()
    Circle()
//    WinHorLn1()
//    WinHorLn2()
//    WinHorLn3()
//    WinVerLn1()
//    WinVerLn2()
//    WinVerLn3()
//    WinDiaLn1()
//    WinDiaLn2()
    ClickBase()
}