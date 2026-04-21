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
import androidx.compose.foundation.layout.Box
import com.example.cherepenin_pr.R
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import com.example.cherepenin_pr.ui.theme.Components.OnboardHeader
import com.example.cherepenin_pr.ui.theme.Components.CircleButton
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
@Composable
fun Pr_06_screen(modifier: Modifier = Modifier) {
    var selectedImageIndex by remember { mutableStateOf(0) }

    val images = listOf(
        R.drawable.shape2,
        R.drawable.shape3,
        R.drawable.shape4
    )

    var text1 by remember { mutableStateOf("Далее") }
    var text2 by remember { mutableStateOf("Анализы") }
    var text3 by remember { mutableStateOf("Экспресс сбор и получение проб") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 49.dp,
                    start = 30.dp,
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Box() {
                Text(
                    text = text1,
                    color = DaleeCol,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                )
            }

            Box() {
                Image(
                    painter = painterResource(R.drawable.shape),
                    contentDescription = ""
                )
            }
        }
        Spacer(modifier = Modifier.height(60.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 50.dp,
                    start = 30.dp,
                    end = 30.dp
                ),
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ){
                Box(
                ) {
                    Text(
                        text = text2,
                        color = AnalizyCol,
                        fontSize = 20.sp,
                        fontWeight = FontWeight(400),
                    )
                }

                Spacer(modifier = Modifier.height(29.dp))

                Box(
                ) {
                    Text(
                        text = text3,
                        color = Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                    )
                }

                Spacer(modifier = Modifier.height(60.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ){
                    CircleButton(
                        ifselected = (selectedImageIndex == 0),
                        20,
                        onClick = {selectedImageIndex = 0;
                            text1 = "Далее";
                            text2 = "Анализы";
                            text3 = "Экспресс сбор и получение проб"}
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    CircleButton(
                        ifselected = (selectedImageIndex == 1),
                        20,
                        onClick = {selectedImageIndex = 1;
                            text1 = "Далее";
                            text2 = "Уведомления";
                            text3 = "Вы быстро узнаете о результатах"}
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    CircleButton(
                        ifselected = (selectedImageIndex == 2),
                        20,
                        onClick = {selectedImageIndex = 2;
                            text1 = "Завершить";
                            text2 = "Мониторинг";
                            text3 = "Наши врачи всегда наблюдают \n" +
                                    "за вашими показателями здоровья"}
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
    }

@Preview
@Composable
private fun Pr_06_screenPreview() {
    Pr_06_screen()
}