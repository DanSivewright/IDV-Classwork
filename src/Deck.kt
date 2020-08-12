class Deck: IDeck {
    val cards = mutableListOf<Card>()

    init {
        for (rank in 1..13) {
            for (suit in 1..4){
                cards.add(Card(rank, suit))
            }
        }
    }
    override fun show() {
        for (card in cards) {
            println(card.toString())
        }
    }

    override fun shuffleCards() {
        cards.shuffle()
    }

    override fun drawCard() = cards.removeAt(cards.size -1)
}