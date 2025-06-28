package de.tjaugust01.masterbrain.model
/**
 * Repräsentiert das Ergebnis eines Rateversuchs.
 *
 * @property schwarze Die Anzahl der Stifte mit korrekter Farbe an der korrekten Position.
 * @property weisse Die Anzahl der Stifte mit korrekter Farbe an der falschen Position.
 */
data class Ergebnis(
    val schwarze: Int,
    val weisse: Int
)