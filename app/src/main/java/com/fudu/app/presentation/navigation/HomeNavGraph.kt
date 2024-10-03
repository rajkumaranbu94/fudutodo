package com.fudu.app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fudu.app.presentation.screens.HomeScreen
import com.fudu.app.presentation.screens.MessageScreen
import com.fudu.app.presentation.screens.ProfileScreen

@Composable
fun HomeNavGraph(
    navController: NavHostController,
    logout: () -> Unit
) {
    NavHost(
        navController = navController,
        route = ScreenRoute.HomeNav.route,
        startDestination = ScreenRoute.Home.route
    ) {
        composable(route = ScreenRoute.Home.route) {
            HomeScreen(navController)
        }
        composable(route = ScreenRoute.Message.route) {
            MessageScreen(navController)
        }
        composable(route = ScreenRoute.Profile.route) {
            ProfileScreen(navController, logout)
        }
    }
}