interface IDeck {
//    val cards = mutableListOf<Card>()
    fun show ()
    fun shuffleCards()
    fun drawCard(): Card
}