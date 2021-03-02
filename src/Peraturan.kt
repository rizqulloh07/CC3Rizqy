class Peraturan(private val keluar: Callback) {
    fun aturan(player1: String, player2: String) {
        when {
            player1 == player2 -> {
                keluar.keluarin("DRAW!")
            }
            player1 == "gunting" && player2 == "kertas" || player1 == "batu" && player2 == "gunting" || player1 == "kertas" && player2 == "batu" -> {
                keluar.keluarin("Pemain 1 Menang!")
            }
            else -> {
                keluar.keluarin("Pemain 2 Menang!")
            }
        }
    }
}

