package com.example.pertemuan3

import android.media.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun loginScreen () {
    Box(modifier = Modifier.fillMaxSize()) {
        Image (painter = painterResource(id = R.drawable.mosque),
            contentDescription = "Backqround",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize())
    }
}