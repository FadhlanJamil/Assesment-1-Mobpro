package org.d3if0084.laundryapp.navigation

sealed class Screen (val route: String) {
    data object Home: Screen("mainScreen")
    data object About: Screen("aboutScreen")
}