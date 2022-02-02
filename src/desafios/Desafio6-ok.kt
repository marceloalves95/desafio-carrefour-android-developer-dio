import java.util.*

//implemente aqui sua solução para este desafio
import java.util.concurrent.TimeUnit

fun main(args: Array<String>){
  val tempo = readLine()!!.toInt()
  
  val horas = (tempo /3600)
  val minutos = (tempo %3600)/60
  val segundos = (tempo % 3600)%60
  
  println("$horas:$minutos:$segundos")
}
