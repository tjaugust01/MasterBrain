package de.tjaugust01.masterbrain.ui

import de.tjaugust01.masterbrain.model.Code
import de.tjaugust01.masterbrain.model.Farbe

/**
 * Objekt welche die ganzen Ein- und Ausgaben übernimmt
 */
object Konsole {

    fun welcome(){
        println("--- Willkommen bei Master Brain! ---")
        println("Errate den geheimen Code aus 4 Farben.")
        println("Die möglichen Farben sind 1-6: 1=🔴, 2=🟢, 3=🔵, 4=🟡, 5=🟣, 6=🟠")
        println("Du erhältst für jeden Versuch eine Auswertung:")
        println("  - 'Schwarz' bedeutet: Richtige Farbe an der richtigen Position.")
        println("  - 'Weiss' bedeutet: Richtige Farbe an der falschen Position.")
        println("------------------------------------")
    }
    /**
     * Fragt den Spieler so lange nach einem Tipp, bis eine gültige Eingabe erfolgt.
     * Eine gültige Eingabe ist eine 4-stellige Zahl mit Ziffern von 1-6.
     * @return Das vom Spieler eingegebene, validierte Code-Objekt.
     */
    fun requestGuess(): Code {
        while (true) {
            println("Gib deinen 4-stelligen Tipp ein (z.B. 1425):")
            val input = readlnOrNull()
            if (input != null && input.length == 4) {
                val color = mutableListOf<Farbe>()
                var validGuess = true
                for (zeichen in input) {
                    val zahl = zeichen.digitToIntOrNull()
                    if (zahl == null) {
                        validGuess = false
                        break
                    }
                    val farbe = Farbe.getColor(zahl)
                    if (farbe == null) {
                        validGuess = false
                        break
                    }
                    color.add(farbe)
                }
                if (validGuess) {
                    return Code(color)
                }
            }
            println(">> Ungültige Eingabe. Bitte gib genau 4 Ziffern von 1 bis 6 ein. <<")
        }
    }
}