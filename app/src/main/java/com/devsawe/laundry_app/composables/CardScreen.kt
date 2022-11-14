package com.devsawe.laundry_app.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.devsawe.laundry_app.ui.theme.Purple200

@Composable
fun MainContent(){
    Scaffold(
        content = { MyContent()}
    )
}

@Composable
fun MyContent(){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Card( elevation = 10.dp){ //here border = BorderStroke(2.dp, color = Purple200),
            Column(Modifier.padding(10.dp)) {
                Text("Get 50% on Ironing", fontWeight = FontWeight.W700)
                Text("CODE: E2900")
            }
        }
    }
}

