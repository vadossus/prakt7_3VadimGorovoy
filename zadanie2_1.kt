import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    try
    {
        println("Введите H: ")
        var h = readLine()!!.toDouble()

        var g = 9.8

        var t = sqrt(2*h/g)
        println("${String.format("%,2f",((t)))}")


    }
    catch (ex:Exception)
    {
        println("Ошибка")
    }
}