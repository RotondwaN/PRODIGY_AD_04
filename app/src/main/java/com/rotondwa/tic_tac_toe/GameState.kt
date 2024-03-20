package com.rotondwa.tic_tac_toe

data class GameState(
    val playerCircleCount: Int = 0,
    val playerCrossCount: Int = 0,
    val drawCount: Int = 0,
    val hintText: String = "Player 'O' turn",
    val currentTurn: BoardCellValue = BoardCellValue.CIRCLE,
    val victoryType: VictoryType = VictoryType.NONE,
    val hasWon: Boolean = false
) {
}

enum class BoardCellValue{
    CIRCLE,
    CROSS,
    NONE
}

enum class VictoryType {
    HORIZONTALLINE1,
    HORIZONTALLINE2,
    HORIZONTALLINE3,
    VERTICALLINE1,
    VERTICALLINE2,
    VERTICALLINE3,
    DIAGONALLINE1,
    DIAGONALLINE2,
    NONE
}