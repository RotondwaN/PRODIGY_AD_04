package com.rotondwa.tic_tac_toe

sealed class UserActions {
    object  PlayAgainButtonClicked: UserActions()
    data class BoardTapped(val cellNo: Int): UserActions()
}