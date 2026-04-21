package com.example.cherepenin_pr.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cherepenin_pr.ui.theme.Pr_05_screen
import com.example.cherepenin_pr.ui.theme.Pr_06_screen

sealed class Screen(val route: String) {
    object Auth : Screen("auth_screen")
    object Order : Screen("order_screen")
    object Success : Screen("success_screen")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Auth.route
    ) {
        composable(Screen.Auth.route) {
            Pr_05_screen(
                onNextClick = {
                    navController.navigate(Screen.Order.route)
                }
            )
        }

        composable(Screen.Order.route) {
            Order_screen(
                onNextClick = {
                    navController.navigate(Screen.Success.route)
                }
            )
        }

        composable(Screen.Success.route) {
            Success_screen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}