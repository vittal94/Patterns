package org.example.kotlinCode.flyweight.gameRobot

import kotlin.random.Random

//RobotImages is flyweight object
object RobotImages {
     val directionImages = listOf(
        Image("up.png"),
        Image("down.png"),
        Image("left.png"),
        Image("right.png"),
    )
}
class GameRobot(private var direction: Direction = Direction.UNSPECIFIED) {

    //Each time you create a game robot instance, the  directionImages are loaded too
//    private val directionImages = listOf(
//        Image("up.png"),
//        Image("down.png"),
//        Image("left.png"),
//        Image("right.png"),
//    )

    //when you use a RobotImages it gives a reference to directionImages
    private val directionImages = RobotImages.directionImages
    fun getDirectionImage() {
        when(direction) {
            Direction.DOWN -> directionImages[1]
            Direction.UP -> directionImages[0]
            Direction.LEFT -> directionImages[2]
            Direction.RIGHT -> directionImages[3]
            Direction.UNSPECIFIED -> throw IllegalArgumentException("Direction is unspecified!!!")
        }
    }

    fun setDirection(directionToSet: Direction) {
        direction = directionToSet
    }

    override fun toString(): String {
        return " Game robot, direction: $direction"
    }
}

enum class Direction {
    UP, DOWN, LEFT, RIGHT, UNSPECIFIED
}

class Image(private val path: String) {
    fun getImage(): String = "Image of path: $path"
    private val byteArray: Array<String> = Array(1000){"45654565456544"}
}

fun testGameRobot() {
    fun getRandomDirection(): Direction {
        val random = (0..3).random()
        return when(random) {
            0 -> Direction.UP
            1 -> Direction.DOWN
            2 -> Direction.LEFT
            3 -> Direction.RIGHT
            else -> Direction.UNSPECIFIED
        }
    }
    val robots = List(1000){GameRobot(getRandomDirection())}

    robots.forEach(::println)
    robots.onEach { it.getDirectionImage() }
}