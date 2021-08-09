package desafios

import kotlin.math.pow

/**
 * @author RubioAlves
 * Created 09/08/2021 at 13:22
 */
fun main() {
    val n = 1..(readLine() ?: return).toInt()
    n.forEach {
        println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")
        println(            )
    }
}