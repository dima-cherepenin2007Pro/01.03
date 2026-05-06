package com.example.cherepenin_pr.ui.theme.Components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cherepenin_pr.ui.theme.ButtonColor1
import com.example.cherepenin_pr.ui.theme.DisButtonColor1
import com.example.cherepenin_pr.ui.theme.pailColor

@Composable
fun PailButton(ifable: Boolean,
               text: String,
               text_size: Int,
               modifier: Modifier = Modifier,
               onClick: () -> Unit = {},
               ) {
    Button(
        onClick = onClick,
        enabled = ifable,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFF5F5F9),
            contentColor = Color(0xFFF5F5F9),
            disabledContainerColor = Color(0xFFF5F5F9),
            disabledContentColor = Color(0xFFF5F5F9)
        ),
        modifier = modifier
    ){
        Text(
            text = text,
            fontSize = text_size.sp,
            color = pailColor,
        )
    }
}

@Preview
@Composable
private fun PailButtonPreview() {
    PailButton(
        true,
        "Кнопка",
        17,
        modifier = Modifier)
}