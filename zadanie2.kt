import kotlin.math.sin
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.max
import kotlin.math.min


fun main(){
    try
    {
        println("Введите K,M,M,X: ")
        var k = readLine()!!.toInt()
        var m = readLine()!!.toInt()
        var n  = readLine()!!.toInt()
        var x = readLine()!!.toDouble()

        var yX = 0.0
        when {
            (m == max(k,n)) -> yX = sin(abs(x)) / x.pow(2)
            (m == min(k,n)) -> yX = sin(abs(x)) / (x.pow(2) + 1)
            else -> yX = -1.0
        }
        println(yX)
    }
    catch (ex:Exception)
    {
        println("Ошибка")
    }
}