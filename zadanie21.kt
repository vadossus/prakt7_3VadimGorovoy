fun main(){
    try
    {
        println("Введите k,b,r: ")
        var k = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        var r = readLine()!!.toDouble()

        var D = (b*b - r*r * (k+1))

        if (D > 0)
        {
            println("прямая и окружность имеет 2 точки пересечения")
        }
        else if (D == 0.0)
        {
            println("прямая и окружность имеет 1 точку пересечения")
        }
        else
        {
            println("прямая и окружность не имеет точки пересечения")
        }
    }
    catch (ex:Exception)
    {
        println("Ошибка")
    }
}