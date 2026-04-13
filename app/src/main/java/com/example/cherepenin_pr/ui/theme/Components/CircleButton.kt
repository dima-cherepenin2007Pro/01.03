package com.example.cherepenin_pr.ui.theme.Components

import android.widget.Button
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.size
@Composable
fun CircleButton(
    ifselected: Boolean,
    size: Int,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (ifselected) Color.Blue else Color.White,
            contentColor = Color.White
        ),
        border = BorderStroke(
            width = 2.dp,
            color = Color.Blue
        ),
        modifier = modifier
            .size(size.dp),
    ) {

    }
}

@Preview
@Composable
private fun CircleButtonPreview() {
    CircleButton(
        false,
        40,
        onClick = {}
    )
}