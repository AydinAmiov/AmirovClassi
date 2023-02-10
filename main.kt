fun main()
{
    try
    {
        val nasekomi1:Nasekomie=Nasekomie("Муравей",  3, "Коричневые", "Сок растений", "Везде" )
        nasekomi1.GetJourney()
        nasekomi1.PrintJourney()

        val nasekomi2:Nasekomie=Nasekomie( "Жук-Носорог", 5, "Черные", "ясень", "Везде")
        nasekomi2.GetJourney()
        nasekomi2.PrintJourney()
    }
    catch (e:Exception){
        println("Данные введены неверно")
    }
}