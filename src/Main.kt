/**
 * A little guessing game in Kotlin
 */


fun main() {
    println("---------------------------")
    println("  Guessing Game 5 Million")
    println("---------------------------")
    println()

    val numToGuess = (1..100).random()

    println("I'm thinking of a number from 1 to 100")
    println("Can you guess it?")

    // Main loop
    while (true) {
        // Ask the user for a guess
        val guess = readln().toIntOrNull()

        // Did the user enter a non-number?
        if (guess == null) {
            println("Enter a number!")
            continue  // Start loop again
        }

        // Must be a number, so let's check it

        // Check if it's correct
        if (guess == numToGuess) {
            println("Well done!")
            break   // Correct, so leave the loop
        }

        // Otherwise give high/lower feedback
        if (guess > numToGuess) {
            println("You guessed too HIGH!")
        }
        else {
            println("You guessed too LOW!")
        }
    }

    // Show final feedback
}