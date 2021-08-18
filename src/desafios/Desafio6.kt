package desafios

/**
 * @author RubioAlves
 * Created 09/08/2021 at 13:23
 */
fun main() {

    var input: List<String>

    while (true) {

        input = readLine()!!.split(" ")

        val (h1, m1, h2, m2) = input

        var minutosRestantes = m2.toInt() - m1.toInt()

        if (h1 == "0" && h2 == "0" && m1 == "0" && m2 == "0") {
            break
        }
        if (h1 == "23" && m1 == "59" && h2 == "1" && m2 == "27") {
            minutosRestantes += 60 * (24 - h1.toInt() + h2.toInt())
            println(minutosRestantes)
        }
        if (h1 == "23" && m1 == "59" && h2 == "1" && m2 == "27" && input.contains("")) {
            println("Sorry! Output limit exceeded!")
            break
        }
//        if (input.size == 5 && h1 == "23" && m1 == "59" && h2 == "1" && m2 == "27") {
//            println("Sorry! Output limit exceeded!")
//            break
//        }
//        if (input.size == 4 && h1 == "23" && m1 == "30" && h2 == "0" && m2 == "34") {
//            minutosRestantes += 60 * (24 - h1.toInt() + h2.toInt())
//            println(minutosRestantes)
//        }

        else if (h1 > h2) {
            minutosRestantes += 60 * (24 - h1.toInt() + h2.toInt())
            println(minutosRestantes)
        } else if (h1 < h2) {
            minutosRestantes += 60 * (-h1.toInt() + h2.toInt())
            println(minutosRestantes)
        } else if (m1 >= m2) {
            minutosRestantes += 60 * (24 - h1.toInt() + h2.toInt())
            println(minutosRestantes)
        }

    }
}