package com.example.pesatrackpos

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Catalog : Screen("catalog")
    object Cart : Screen("cart")
    object SalesHistory : Screen("sales_history")
    object ManageProducts : Screen("manage_products")
}