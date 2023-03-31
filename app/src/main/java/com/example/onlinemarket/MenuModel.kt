package com.example.onlinemarket

sealed class MenuModel{

    data class Header(
        val menuTitle: String
    ) : MenuModel()

    data class MenuItems(
        val menuName: String,
        val menuDesc: String,
        val amount: String,
        val imageResource: Int
    ) : MenuModel()
}
