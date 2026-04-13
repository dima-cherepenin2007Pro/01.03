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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.cherepenin_pr.ui.theme.Components.PrimaryButton
import com.example.cherepenin_pr.ui.theme.Components.SecondaryButton
import com.example.cherepenin_pr.ui.theme.Components.TextInput
import com.example.cherepenin_pr.ui.theme.Components.TextButton

@Composable
fun Pr_05_screen(
    modifier: Modifier = Modifier
    ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 50.dp,
                start = 15.dp,
                end = 15.dp
            ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            OnboardDescription(
                "Добро Пожаловать!",
                28,
            )

            Spacer(modifier = Modifier.height(16.dp))

            OnboardDescription(
                "Войдите, чтобы пользоваться функциями приложения!",
                19,
            )
        }

        Spacer(modifier = Modifier.height(200.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start,
        ){
            OnboardDescription(
                "Вход по E-mail",
                13
            )

            Spacer(modifier = Modifier.height(1.dp))

            TextInput(
                "example@mail.ru",
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(40.dp))

            PrimaryButton(
                true,
                "Далее",
                17,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
            )

            Spacer(modifier = Modifier.height(200.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                OnboardDescription(
                    "Или войдите с помощью",
                    14
                )

                Spacer(modifier = Modifier.height(20.dp))

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
}

@Preview
@Composable
private fun Pr_05_screen_Preview() {
    Pr_05_screen()
}