package desafios

/**
 * @author RubioAlves
 * Created 09/08/2021 at 13:23
 */
fun main() {

    var input : List<Int>
    var x:Int
    var y:Int

    while (true) {

        input = readLine()!!.split(" ").map { it.toInt() }
        val (h1, m1, h2, m2) = input

        if (h1==0 && h2==0 && m1==0 && m2==0) { break }

        x = (h1 * 60) + m1
        y = (h2 * 60) + m2

        if (x < y) {
            println(y-x)
        } else {
            println(1440+(y-x))
        }

    }
}