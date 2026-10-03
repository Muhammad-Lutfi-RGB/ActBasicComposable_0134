package com.example.pertemuan3

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun loginScreen () {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.mosque),
            contentDescription = "Backqround",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column() {
            Text(text = "Login",
                color = Color.Blue,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold)
            Text(text = "Ini adalah halaman login",
                color = Color.White,
                fontSize = 15.sp)
        }
    }
}