package de.tjaugust01.masterbrain

// Importiere alle notwendigen Klassen aus den anderen Paketen.
import de.tjaugust01.masterbrain.model.Code
import de.tjaugust01.masterbrain.ui.Konsole

/**
 * Die Game-Engine. Sie enthält die Haupt-Spiellogik und steuert den Ablauf.
 * @property maxRunden Die maximale Anzahl an Versuchen für den Spieler.
 */
class Game(private val maxRunden: Int = 10) {

    private val secretCode: Code = Code.generiereZufallsCode()

    /**
     * Startet und steuert den kompletten Spielablauf.
     */
    fun start() {
        Konsole.welcome()
        var win = false

        for (runde in 1..maxRunden) {
            println("\n--- Runde $runde von $maxRunden ---")

            val guess = Konsole.requestGuess()
            val result = secretCode.check(guess)
            println("Dein Tipp: ${guess.stifte.joinToString(" ") { it.symbol }}")
            println("Auswertung: ${result.schwarze} Schwarze, ${result.weisse} Weisse")
            if (result.schwarze == 4) {
                win = true
                break
            }
        }
        if (win) {
            println("\n🎉 Herzlichen Glückwunsch! Du hast den Code geknackt!")
        } else {
            println("\nLeider verloren! Du hast keine Versuche mehr.")
            println("Der geheime Code war: ${secretCode.stifte.joinToString(" ") { it.symbol }}")
        }
    }
}