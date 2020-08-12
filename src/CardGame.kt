fun main() {
    println("Welcome to the best card game ever")
    val deck = Deck()
    deck.shuffleCards()

    val playerOne = Player("Daniel")
    playerOne.addCardToHand(deck.drawCard())
    playerOne.addCardToHand(deck.drawCard())

    println("Players hand is: ")
    playerOne.showPlayerCards()
}