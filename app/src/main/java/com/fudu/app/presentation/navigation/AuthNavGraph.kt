package com.fudu.app.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.fudu.app.presentation.screens.LoginScreen
import com.fudu.app.presentation.screens.RegisterScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = ScreenRoute.Login.route,
        route = ScreenRoute.AuthNav.route
    ) {
        composable(route = ScreenRoute.Login.route) {
            LoginScreen(navController)
        }
        composable(route = ScreenRoute.Register.route) {
            RegisterScreen(navController)
        }
    }
}