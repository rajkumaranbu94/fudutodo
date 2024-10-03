package com.fudu.app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fudu.app.presentation.screens.MainScreen

@Composable
fun RootNav() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreenRoute.AuthNav.route
    ) {
        authNavGraph(navController = navController)
        composable(route = ScreenRoute.HomeNav.route) {
            MainScreen(logout = {
                navController.navigate(ScreenRoute.AuthNav.route) {
                    popUpTo(0)
                }
            })
        }
    }
}