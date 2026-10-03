package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun loginScreen(modifier: Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.mosque),
            contentDescription = "Backqround",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(modifier = Modifier.fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top) {

            Text(text = "Login",
                color = Color.Green,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold)

            Text(text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 15.sp)

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(160.dp),
                contentScale = ContentScale.Fit
                )

            Spacer(modifier = Modifier.height(50.dp))

            Text(text = "Nama",
                color = Color.Red,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
                )

            Text(text = "Muhammad Lutfi Sirajul Huda",
                color = Color.Green,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
                )

            Text(text = "20240140134",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
                )

            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = painterResource(id = R.drawable.kaaba),
                contentDescription = "Gambar Ka'bah di Lingkaran",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(300.dp)
                    .clip(CircleShape)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape)
            )
        }
    }
}