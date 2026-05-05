package com.example.cherepenin_pr.ui.theme.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.draw.clip

@Composable
fun Card(
    modifier: Modifier = Modifier,
    text1: String,
    text2: String,
    text3: String
    ) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Green)
    ){
        Column(modifier = Modifier
            .padding(
                start = 10.dp,
                top = 5.dp,
                end = 10.dp,
                bottom = 5.dp
            )){
            Box(){
                Text(text1)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
                Column(){
                    Box(){
                        Text(text2)
                    }
                    Box(){
                        Text(text3)
                    }
                }
                PrimaryButton(true,
                    "Кнопка",
                    17,
                    onClick = {}
                )
            }
        }
    }
}
@Preview
@Composable
private fun CardPreview() {
    Card(text1 = "Илюха", text2 = "Мэд",text3 = "База")
}