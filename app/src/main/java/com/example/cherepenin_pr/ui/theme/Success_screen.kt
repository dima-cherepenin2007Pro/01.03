package com.example.cherepenin_pr.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cherepenin_pr.R
import com.example.cherepenin_pr.ui.theme.AnalizyCol
import com.example.cherepenin_pr.ui.theme.Components.PrimaryButton
import com.example.cherepenin_pr.ui.theme.Components.SecondaryButton

@Composable
fun Success_screen(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(
                start = 20.dp,
                top = 16.dp,
                end = 26.dp
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
            ){
                Text(
                    text = "Оплата",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(700),
                )
            }
        }

        Spacer(modifier = Modifier.height(64.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box() {
                Image(
                    painter = painterResource(R.drawable.shape2),
                    contentDescription = ""
                )
            }
            Spacer(modifier = Modifier.height(30.dp))

            Box(){
                Text(
                    text = "Ваш заказ успешно оплачен!",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                    color = AnalizyCol,
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(){
                Text(
                    text = "Вам осталось дождаться приезда медсестры и сдать анализы. До скорой встречи!",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(){
                Text(
                    text = "Не забудьте ознакомиться с правилами подготовки к сдаче анализов",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.height(97.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            SecondaryButton(
                true,
                "Чек покупки",
                17,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            PrimaryButton(
                true,
                "На главную",
                17,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                onBackClick,
            )
        }
    }
}

@Preview
@Composable
private fun Success_screenPreview() {
    Success_screen(onBackClick = {})
}