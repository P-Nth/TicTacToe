package com.example.tictactoe.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Blue100)
            .padding(horizontal = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(.4f)
                .fillMaxHeight(.5f)
                .aspectRatio(1f)
                .shadow(
                    elevation =.1.dp,
                    shape = RoundedCornerShape(200.dp)
                )
                .clip(RoundedCornerShape(15.dp))
                .background(Blue100),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(com.example.tictactoe.R.drawable.logo),
                contentDescription = "Logo",
                modifier = Modifier.width(200.dp).height(200.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(.1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Powered by Nth-Labs",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                color = Dark_Blue)
        }
    }
}

@Preview
@Composable
fun prev() {
    SplashScreen()
}