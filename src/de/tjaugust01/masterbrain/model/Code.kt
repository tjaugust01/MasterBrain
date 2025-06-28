package de.tjaugust01.masterbrain.model

data class Code(val stifte: List<Farbe>) {

    init {
        require(stifte.size == 4) { "Ein Code muss aus genau 4 Stiften bestehen." }
    }

    /**
     * Vergleicht diesen Code (den Geheimcode) mit einem Rateversuch (tipp).
     * @param tipp Der geratene Code.
     * @return Ein Ergebnis-Objekt mit der Anzahl der schwarzen und weißen Stifte.
     */
    fun check(tipp: Code): Ergebnis {
        var blacks = 0
        var whites = 0

        val codeList = this.stifte.toMutableList()
        val guess = tipp.stifte.toMutableList()
        for (i in guess.indices.reversed()) {
            if (guess[i] == codeList[i]) {
                blacks++
                guess.removeAt(i)
                codeList.removeAt(i)
            }
        }
        for (color in guess) {
            if (codeList.contains(color)) {
                whites++
                codeList.remove(color)
            }
        }

        return Ergebnis(blacks, whites)
    }

    companion object {
        /**
         * Erstellt ein neues Code-Objekt mit 4 zufälligen Farben.
         */
        fun generiereZufallsCode(): Code {
            val zufallsStifte = List(4) { Farbe.entries.random() }
            return Code(zufallsStifte)
        }
    }
}