package com.example.cherepenin_pr.ui.theme.Components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
@Composable
fun TextInput(
    label: String,
    modifier: Modifier = Modifier
){
    var text by remember {mutableStateOf("")}

    OutlinedTextField(
        modifier = modifier,
        value = text,
        onValueChange = {text = it},
        label = { Text(label) },
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = Color.White,
            unfocusedTextColor = Color.White,
        )
    )
}

@Preview
@Composable
private fun TextInputPreview() {
    TextInput(
        "Текст для ввода с подсказкой",
        modifier = Modifier
            .size(width = 335.dp, height = 48.dp)
    )
}