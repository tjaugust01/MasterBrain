package de.tjaugust01.masterbrain.model

enum class Farbe (val value: Int, val symbol: String){
    ROT(1, "🔴"),
    GRUEN(2, "🟢"),
    BLAU(3, "🔵"),
    GELB(4, "🟡"),
    LILA(5, "🟣"),
    ORANGE(6, "🟠");
    companion object{
        fun getColor(value: Int): Farbe?{
            return entries.find {it.value==value}
        }
    }
}