# Master Brain

Ein klassisches Logik-Spiel (Mastermind), entwickelt in Kotlin.

## 1. Situation
Dieses Projekt entstand im Rahmen einer Herausforderung in meiner Klasse. Fünf Personen hatten sich vorgenommen, dasselbe Spiel in einer für sie jeweils neuen Programmiersprache zu entwickeln. Die Wahl der Sprachen fiel auf:
*   **Java/Kotlin** (meine Wahl)
*   Go
*   Rust
*   JavaScript

Trotz der ursprünglichen Planung haben am Ende nur zwei Personen das Projekt erfolgreich umgesetzt: Ich in Kotlin und ein weiterer Mitschüler in JavaScript.

## 2. Das Spiel: Master Brain
Master Brain ist eine Umsetzung des bekannten Brettspiels "Mastermind".

### Spielziel
Errate den geheimen, vierstelligen Farbcode, den der Computer zufällig generiert hat.

### Spielregeln
*   Es gibt insgesamt 6 Farben: 🔴 (1), 🟢 (2), 🔵 (3), 🟡 (4), 🟣 (5) und 🟠 (6).
*   Du hast maximal **10 Versuche**.
*   Nach jedem Tipp erhältst du ein Feedback:
    *   **Schwarz**: Eine Farbe ist korrekt und befindet sich an der richtigen Position.
    *   **Weiß**: Eine Farbe ist im Code enthalten, aber an der falschen Position.
*   Das Spiel ist gewonnen, wenn du 4 schwarze Punkte erhältst (alle Farben korrekt an der richtigen Stelle).

## 3. Code-Funktionsweise und Ausführung

### Projektstruktur
Das Projekt ist modular aufgebaut:
*   `Main.kt`: Der Startpunkt der Anwendung.
*   `Game.kt`: Steuert die Spielrunden und prüft die Siegbedingungen.
*   `model/`: Enthält die Logik für den Code (`Code.kt`), die Farben (`Farbe.kt`) und die Auswertung (`Ergebnis.kt`).
*   `ui/`: Behandelt die Ein- und Ausgaben über die Konsole (`Konsole.kt`).

### Ausführung
Um das Spiel zu starten, benötigst du eine installierte Java-Laufzeitumgebung (JRE) oder eine IDE wie IntelliJ IDEA.

1.  **In IntelliJ IDEA:**
    *   Öffne das Projektverzeichnis.
    *   Navigiere zu `src/de/tjaugust01/masterbrain/Main.kt`.
    *   Rechtsklick auf die Datei oder die `main`-Funktion und wähle **Run 'MainKt'**.

2.  **Über die Konsole (Kompilieren und Ausführen):**
    Wenn du das Kotlin Command-Line Interface installiert hast:
    ```bash
    # Kompilieren
    kotlinc src -include-runtime -d MasterBrain.jar
    # Ausführen
    java -jar MasterBrain.jar
    ```

Viel Erfolg beim Knacken des Codes! 🚀
