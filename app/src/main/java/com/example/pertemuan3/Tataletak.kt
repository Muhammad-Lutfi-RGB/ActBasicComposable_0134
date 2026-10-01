package com.example.pertemuan3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top =20.dp, start = 20.dp, end = 20.dp)) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(modifier= modifier.fillMaxWidth()) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
        Text("Komponen4")
    }
}
