package com.example.cherepenin_pr.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import com.example.cherepenin_pr.R
import com.example.cherepenin_pr.ui.theme.Components.PrimaryButton
import com.example.cherepenin_pr.ui.theme.Components.TextInput
import com.example.cherepenin_pr.ui.theme.Components.TextInput2

@Composable
fun Order_screen(
    modifier: Modifier = Modifier,
    onNextClick: () -> Unit)
{

    var addressText by remember { mutableStateOf("") }
    var telephoneText by remember { mutableStateOf("")}
    val isEmailValid = addressText.isNotBlank() && telephoneText.isNotBlank()

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(
                start = 20.dp,
                top = 16.dp,
                end = 26.dp
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Box() {
                Image(
                    painter = painterResource(R.drawable.shape),
                    contentDescription = ""
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box() {
                Text(
                    text = "Оформление заказа",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(700),
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Column() {
            Box() {
                Text(
                    text = "Адрес *",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            TextInput2(
                "Введите ваш адрес",
                modifier = Modifier
                    .fillMaxWidth(),
                value = addressText,
                onValueChange = { addressText = it }
            )

        }

        Spacer(modifier = Modifier.height(12.dp))

        Column() {
            Box() {
                Text(
                    text = "Телефон *",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            TextInput2(
                "Введите ваш номер телефона",
                modifier = Modifier
                    .fillMaxWidth(),
                value = telephoneText,
                onValueChange = {telephoneText = it}
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Box() {
                    Text(
                        text = "Комментарий",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                }
                Box(){
                    Image(
                        painter = painterResource(R.drawable.shape),
                        contentDescription = "",
                        modifier = Modifier
                            .size(width = 24.dp, height = 20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            TextInput(
                "Можете оставить свои пожелания",
                modifier = Modifier
                    .size(width = 345.dp, height = 152.dp)
            )
        }

        Spacer(modifier = Modifier.height(60.dp))

        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Box(){
                    Text(
                        text = "Промокод",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                }
                Box() {
                    Image(
                        painter = painterResource(R.drawable.shape),
                        contentDescription = "",
                        modifier = Modifier
                            .size(width = 24.dp, height = 20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(60.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){
                Box(){
                    Text(
                        text = "Промокод",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                }
                Box() {
                    Text(
                        text = "Промокод",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            PrimaryButton(
                isEmailValid,
                "Далее",
                17,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                onNextClick
            )
        }
    }
}

@Preview
@Composable
private fun Order_screenPreview() {
    Order_screen(onNextClick = {})
}