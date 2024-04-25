package org.example.kotlinCode.AbstructFactory.gameState




fun testGameState()
{
    val notation = listOf("qa1","pc2")
    val gameState = notation.map { Piece.fromNotation(it) }
    gameState.forEach(::println)


}

sealed class Piece(val position: String)
{
    override fun toString(): String {
        return "position: $position"
    }
    companion object
    {
        fun fromNotation(piece: String): Piece
        {
            val pieceType = piece[0]
            val position = piece.drop(1)
            return when(pieceType)
            {
                'p' -> Pawn(position)
                'q' -> Queen(position)
                else -> error("Unknown piece")
            }
        }
    }
}

class Pawn(position: String) : Piece(position)
class Queen(position: String) : Piece(position)
