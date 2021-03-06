package desafios

import kotlin.math.pow

/**
 * @author RubioAlves
 * Created 09/08/2021 at 13:22
 */
fun main() {
    val n = 1..(readLine() ?: return).toInt()
    n.forEach {n1->
        val n2 = (n1.toDouble().pow(2)).toInt()
        val n3 = (n1.toDouble().pow(3)).toInt()
        println("$n1 $n2 $n3")
        println("$n1 ${n2+1} ${n3+1}")
    }
}