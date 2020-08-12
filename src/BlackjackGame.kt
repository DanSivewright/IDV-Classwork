class BlackjackGame: Game() {
    val name = "BlackJack"
    private val deck: Deck = Deck()
    private val players = mutableListOf<Player>()
    val amountOfPlayers: Int = 0

    init {
        while (!gameOver) {
            // Add players
            val player = takeGameInput("How many players will be playing?")
            // setup game: add players and cards to hand

            // play():
        }
    }

    fun takeGameInput(message: String): String {
        println(message)
        val userInput = readLine().toString()
        var value = ""
        when {
            userInput in listOf("q", "quit", "exit") -> {
                println("Quitting Game")
                gameOver = true
            }
            userInput.isEmpty() -> {
                takeGameInput(message)
            }
            else -> {
                value = userInput
            }
        }
        return value
    }

    fun checkPlayerCount (count: String) {
        val playerCount = count.toIntOrNull() ?: return

        if(playerCount > 6) {
          takeGameInput("You cannot have than 6 players")
        } else if(playerCount <= 0) {
            takeGameInput("Please add more ")
        } else -> {
            value
        }
    }
}