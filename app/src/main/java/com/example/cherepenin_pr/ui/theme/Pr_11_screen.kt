package com.example.cherepenin_pr.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cherepenin_pr.R
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.NavigationBar
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBarItem
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Icon
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.ui.Alignment
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import com.example.cherepenin_pr.ui.theme.Components.Card
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import com.example.cherepenin_pr.ui.theme.Components.PailButton

@Composable
fun Pr_11_screen(
    modifier: Modifier = Modifier
) {
    var selectedItem by remember { mutableStateOf<BottomNavItem>(BottomNavItem.Analysis) }

    val items = listOf(
        BottomNavItem.Analysis,
        BottomNavItem.Results,
        BottomNavItem.Support,
        BottomNavItem.Profile
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF4F4F4)),
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    top = 24.dp
                )
                .padding(
                    top = 10.dp
                ),
            contentAlignment = Alignment.Center
        ) {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ){
                item{
                    PailButton(true,
                        "Популярный",
                        17,
                        modifier = Modifier)
                }
                item{
                    PailButton(true,
                        "Covid",
                        17,
                        modifier = Modifier)

                }
                item{
                    PailButton(true,
                        "Комплексные",
                        17,
                        modifier = Modifier)
                }
                item{
                    PailButton(true,
                        "Популярный",
                        17,
                        modifier = Modifier)
                }
                item{
                    PailButton(true,
                        "Covid",
                        17,
                        modifier = Modifier)

                }
                item{
                    PailButton(true,
                        "Комплексные",
                        17,
                        modifier = Modifier)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                ),
            contentAlignment = Alignment.Center
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                item{
                    Card(text1 = "ПЦР-тест на определение РНК коронавируса стандартный", text2 = "2 дня", text3 = "1 800 ₽",text4 = "Добавить")
                }
                item{
                    Card(text1 = "Клинический анализ крови с лейкоцитарной формулой", text2 = "1 день", text3 = "690 ₽",text4 = "Добавить")
                }
                item{
                    Card(text1 = "Биохимический анализ крови, базовый", text2 = "1 день", text3 = "2440 ₽",text4 = "Добавить")
                }
                item{
                    Card(text1 = "СОЭ (венозная кровь)", text2 = "1 день", text3 = "240 ₽",text4 = "Добавить")
                }
                item{
                    Card(text1 = "ПЦР-тест на определение РНК коронавируса стандартный", text2 = "2 дня", text3 = "1 800 ₽",text4 = "Добавить")
                }
                item{
                    Card(text1 = "Клинический анализ крови с лейкоцитарной формулой", text2 = "1 день", text3 = "690 ₽",text4 = "Добавить")
                }
                item{
                    Card(text1 = "Биохимический анализ крови, базовый", text2 = "1 день", text3 = "2440 ₽",text4 = "Добавить")
                }
                item{
                    Card(text1 = "СОЭ (венозная кровь)", text2 = "1 день", text3 = "240 ₽",text4 = "Добавить")
                }
            }
        }

        NavigationBar(
            modifier = Modifier.fillMaxWidth(),
            containerColor = Color.White,
            tonalElevation = 8.dp
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                items.forEach { item ->
                    NavigationBarItem(
                        selected = selectedItem == item,
                        onClick = { selectedItem = item },
                        icon = {
                            Icon(
                                painter = painterResource(id = item.iconId),
                                contentDescription = item.title,
                                modifier = Modifier.size(24.dp)
                            )
                        },
                        label = {
                            Text(
                                text = item.title,
                                fontSize = 12.sp
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = ButtonColor1,
                            unselectedIconColor = Color.Gray,
                            selectedTextColor = ButtonColor1,
                            unselectedTextColor = Color.Gray,
                            indicatorColor = Color.Transparent
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun ButtomNavigationPreview() {
    Pr_11_screen()
}