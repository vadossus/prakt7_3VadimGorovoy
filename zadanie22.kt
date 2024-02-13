import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    try
    {
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var c = readLine()!!.toDouble()

        if (a == 0.0) {
            if (b == 0.0) {
                if (c == 0.0)
                {
                    println("У уравнения бесконечно много корней")
                }
                else
                {
                    println("У уравнения нет решений")
                }
            }
            else
            {
                val x = -c / b
                println("Корень уравнения: x = $x")
            }
        }
        else
        {
            var d = b.pow(2)-4*a*c
            if (d > 0)
            {
                var x1 = (-b + sqrt(d)) / (2*a)
                var x2 = (-b - sqrt(d)) / (2*a)
                println("Корни уравнения: x1 = $x1, x2 = $x2")
            }
            else if (d == 0.0)
            {
                var x = -b / (2 * a)
                println("Уравнение имеет один корень: $x")
            }
            else
            {
                println("Уравнение не имеет действ.корней")
            }
        }
    }
    catch (ex:Exception)
    {
        println("Ошибка")
    }
}