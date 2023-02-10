class Nasekomie (var name: String, var speed : Int, var okras : String, var eda : String, var sreda : String)
{
    fun GetJourney ()
    {
        println("Введите название насекомого")
        name = readLine()!!.toString()
        println("Введите его скорость")
        speed = readLine()!!.toInt()
        println("Введите его окрас")
        okras = readLine()!!.toString()
        println("Введите что он ест")
        eda = readLine()!!.toString()
        println("Введите его среду обитания")
        sreda = readLine()!!.toString()

    }

    fun PrintJourney()
    {
        println("Название насекомого: ${name}")
        println("Скорость: ${speed}")
        println("Окрас: ${okras}")
        println("Еда: ${eda}")
        println("Среда обитания: ${sreda}")
    }

    fun Recomendation(){
        println("Прочитайте про других насекомых тоже")
    }



}