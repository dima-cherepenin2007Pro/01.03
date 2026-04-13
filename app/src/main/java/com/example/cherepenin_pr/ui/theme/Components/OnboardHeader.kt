package com.example.cherepenin_pr.ui.theme.Components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.cherepenin_pr.ui.theme.AccentColor

@Composable
fun OnboardHeader(
    text: String,
    size: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        color = AccentColor,
        fontSize = size.sp,
    )
}


@Preview
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader("Заголовок", 20)
}