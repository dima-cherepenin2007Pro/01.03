package com.example.cherepenin_pr.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cherepenin_pr.ui.theme.Components.OnboardDescription
import androidx.compose.foundation.Image
import com.example.cherepenin_pr.R
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.mutableStateOf
import com.example.cherepenin_pr.ui.theme.Components.OnboardHeader
import com.example.cherepenin_pr.ui.theme.Components.CircleButton
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun Pr_06_screen(modifier: Modifier = Modifier) {
    var selectedImageIndex by remember { mutableStateOf(0) }

    val images = listOf(
        R.drawable.shape2,
        R.drawable.shape3,
        R.drawable.shape4
    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 50.dp,
                start = 15.dp,
                end = 15.dp
            ),
    ){
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center,

        ){
            OnboardDescription(
                "Далее",
                20,
                )

            Spacer(modifier = Modifier.width(160.dp))

            Image(
                painter = painterResource(R.drawable.shape),
                contentDescription = ""
            )
        }

        Spacer(modifier = Modifier.height(160.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        ){
            OnboardHeader(
                "Анализы",
                20
            )

            Spacer(modifier = Modifier.height(10.dp))

            OnboardDescription(
                "Экспресс сбор и получение проб",
                17
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ){
                CircleButton(
                    ifselected = (selectedImageIndex == 0),
                    20,
                    onClick = {selectedImageIndex = 0}
                )
                Spacer(modifier = Modifier.width(3.dp))
                CircleButton(
                    ifselected = (selectedImageIndex == 1),
                    20,
                    onClick = {selectedImageIndex = 1}
                )
                Spacer(modifier = Modifier.width(3.dp))
                CircleButton(
                    ifselected = (selectedImageIndex == 2),
                    20,
                    onClick = {selectedImageIndex = 2}
                )
            }

            Spacer(modifier = Modifier.height(100.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ){
            Image(
                painter = painterResource(images[selectedImageIndex]),
                contentDescription = "",
                modifier = Modifier
                    .width(5000.dp)
            )
            }
        }
    }
}

@Preview
@Composable
private fun Pr_06_screenPreview() {
    Pr_06_screen()
}