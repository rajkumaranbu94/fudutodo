package com.fudu.app.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.fudu.app.presentation.navigation.ScreenRoute

sealed class BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
) {
    data object HomeItem : BottomNavItem(
        title = "Home",
        route = ScreenRoute.Home.route,
        selectedIcon = Icons.Filled.Home,
        unSelectedIcon = Icons.Outlined.Home,
        hasNews = false
    )

    data object MessageItem : BottomNavItem(
        title = "Message",
        route = ScreenRoute.Message.route,
        selectedIcon = Icons.Filled.Email,
        unSelectedIcon = Icons.Outlined.Email,
        hasNews = false,
        badgeCount = 5
    )

    data object ProfileItem : BottomNavItem(
        title = "Me",
        route = ScreenRoute.Profile.route,
        selectedIcon = Icons.Filled.Person,
        unSelectedIcon = Icons.Outlined.Person,
        hasNews = true
    )

}