package NasInfo
open class NasInfo(var count : Int, var Price: Double, var Class : String)
{
    open fun Price()
    {
     println("Стоимость ${Price}")
    }

    open fun count()
    {
        println("мяу ${count}")
    }

    open fun TrainClass()
    {
        println("Название насекомого ${Class}")
    }
}