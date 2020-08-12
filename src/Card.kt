data class Card(val rank: Int, val suit: Int) {
    override fun toString(): String {
        val rankName = when(rank) {
            1 -> "Ace"
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            else -> rank.toString()
        }
        val suitName = when(suit) {
            1 -> "Clubs"
            2 -> "Hearts"
            3 -> "Spades"
            4 -> "Diamonds"
            else -> ""
        }
        return "$rankName of $suitName"
    }
}