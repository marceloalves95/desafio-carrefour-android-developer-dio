package desafios

/**
 * @author RubioAlves
 * Created 09/08/2021 at 13:23
 */
import java.util.Scanner

// máximo divisor comum (chamada recursiva)
fun maximoDivisorComum(n1:Int, n2:Int) :Int{

    var primeiroValor = n1
    var segundoValor = n2
    var resto: Int
    while(segundoValor != 0){
        resto = primeiroValor%segundoValor
        primeiroValor = segundoValor
        segundoValor = resto
    }
    return n1

}
fun main() {
    val lista = mutableListOf<String>()
    val scan = Scanner(System.`in`)
    var n1: Int
    var d1: Int
    var n2: Int
    var d2: Int
    var nf = 0
    var df = 0
    var ns: Int
    var ds: Int
    var aux: String
    var mdc:Int
    val n: Int = scan.nextInt()
    for (i in 1..n) {
        n1 = scan.nextInt()
        scan.next()
        d1 = scan.nextInt()
        aux = scan.next()
        n2 = scan.nextInt()
        scan.next()
        d2 = scan.nextInt()
        when (aux) {
            "+" -> {
                nf = (n1*d2)+(n2*d1)
                df = d1*d2
            }
            "-" -> {
                nf = (n1*d2)-(n2*d1)
                df = d1*d2
            }
            "*" -> {
                nf = n1*n2
                df = d1*d2
            }
            "/" -> {
                nf = n1*d2
                df = d1*n2
            }
        }

        mdc = maximoDivisorComum(nf,df)
        if (mdc < 0){
            mdc *= -1
        }
        if (mdc == 0){
            mdc = df
        }

        ns = nf/mdc
        ds = df/mdc

        lista.add("$nf/$df = $ns/$ds")

    }

    lista.forEach {
        println(it)
    }


}

