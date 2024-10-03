package com.fudu.app.presentation.navigation

enum class RouteConstant {
    SPLASH,
    LOGIN,
    REGISTER,
    MAIN,
    HOME,
    MESSAGE,
    PROFILE,
    AUTH_NAV_GRAPH,
    HOME_NAV_GRAPH
}

sealed class ScreenRoute(val route: String) {
    //Routes
    data object Splash : ScreenRoute(RouteConstant.SPLASH.name)
    data object Login : ScreenRoute(RouteConstant.LOGIN.name)
    data object Register : ScreenRoute(RouteConstant.REGISTER.name)
    data object Home : ScreenRoute(RouteConstant.HOME.name)
    data object Message : ScreenRoute(RouteConstant.MESSAGE.name)
    data object Profile : ScreenRoute(RouteConstant.PROFILE.name)

    //Graph
    data object AuthNav : ScreenRoute(RouteConstant.AUTH_NAV_GRAPH.name)
    data object HomeNav : ScreenRoute(RouteConstant.HOME_NAV_GRAPH.name)

}