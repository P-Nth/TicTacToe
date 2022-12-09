package com.example.tictactoe

sealed class UserAction {
    object PlayAgainBtn: UserAction()
    data class ClickBaseTapped(val cellNo: Int): UserAction()

}