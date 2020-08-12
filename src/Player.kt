class Player(val name: String) {
    // Make val private
    var hand = mutableListOf<Card>()
    var cash = 1000000f
    var firstBet = 0f
    var totalBet = 0f

    fun addCardToHand(card: Card): List<Card> {
        hand.add(card)
        return hand
    }

    fun showPlayerCards(): String{
        return hand.joinToString("\n")
    }


}