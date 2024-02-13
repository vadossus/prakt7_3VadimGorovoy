fun main(){
    try
    {
        println("Введите X: ")
        var x = readLine()!!.toInt()
        println("Введите Y: ")
        var y = readLine()!!.toInt()

        when(x >=-3 && x<=1 && y>=-1 && y <= 1)
        {
            true -> println("Точки ($x,$y) принадлежат рисунку А")
            false -> println("Точки ($x,$y) не принадлежат рисунку А")
        }
        when(x >=-1 && x<=1 && y>=-2 && y <= 2)
        {
            true -> println("Точки ($x,$y) принадлежат рисунку Б")
            false -> println("Точки ($x,$y) не принадлежат рисунку Б")
        }
        when(x >=-1 && x<=1 && y>=-1 && y <= 2)
        {
            true -> println("Точки ($x,$y) принадлежат рисунку В")
            false -> println("Точки ($x,$y) не принадлежат рисунку В")
        }
        when(x >=-2 && x<=1 && y>=-2 && y <= 1)
        {
            true -> println("Точки ($x,$y) принадлежат рисунку Г")
            false -> println("Точки ($x,$y) не принадлежат рисунку Г")
        }



    }
    catch (ex:Exception)
    {
        println("Ошибка")
    }
}