package com.example.cherepenin_pr.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import com.example.cherepenin_pr.ui.theme.Components.OnboardDescription
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cherepenin_pr.ui.theme.Components.PrimaryButton
import com.example.cherepenin_pr.ui.theme.Components.SecondaryButton
import com.example.cherepenin_pr.ui.theme.Components.TextInput
import com.example.cherepenin_pr.ui.theme.Components.TextButton
import android.R.attr.fontWeight
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.cherepenin_pr.ui.theme.Components.TextInput2

@Composable
fun Pr_05_screen(
    modifier: Modifier = Modifier,
    onNextClick: () -> Unit
    ) {
    var emailText by remember { mutableStateOf("") }
    val isEmailValid = emailText.isNotBlank()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                start = 20.dp,
                end = 20.dp
            ),
    ) {
        Spacer(modifier = Modifier.height(100.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            Box(){
                Text(
                    text = "Добро пожаловать!",
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight(700),
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(){
                Text(
                    text = "Войдите, чтобы пользоваться функциями приложения",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400),
                )
            }
        }

        Spacer(modifier = Modifier.height(68.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
        ) {
            Box() {
                Text(
                    text = "Вход по E-mail",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                )
            }

            Spacer(modifier = Modifier.height(1.dp))

            TextInput2(
                "example@mail.ru",
                modifier = Modifier
                    .fillMaxWidth(),
                value = emailText,
                onValueChange = { emailText = it }
            )

            Spacer(modifier = Modifier.height(32.dp))

            PrimaryButton(
                isEmailValid,
                "Далее",
                17,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                onClick = onNextClick,
            )
        }
        Spacer(modifier = Modifier.height(162.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(
                    bottom = 56.dp
                ),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Box(){
                Text(
                    text = "Или войдите с помощью",
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            SecondaryButton(
                true,
                "Войти с Яндекс",
                20,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
            )
        }
    }
}

@Preview
@Composable
private fun Pr_05_screen_Preview() {
    Pr_05_screen(onNextClick = {})
}