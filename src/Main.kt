/**
 * A little guessing game in Kotlin
 */


/**
 * Main program entry point
 */
fun main() {
    println("---------------------------")
    println("  Guessing Game 5 Million")
    println("---------------------------")
    println()

    val playerName = getString("Enter your name: ")
    println("Nice to meet you, $playerName")

    val numToGuess = (1..100).random()

    println("I'm thinking of a number from 1 to 100")
    println("Can you guess it?")
    println()

    var guesses = 0

    // Main loop
    while (true) {
        // Ask the user for a guess
        val guess = getInt("Enter your guess: ")

        // They've made a guess, so keep a count
        guesses++

        // Check the guess
        when {
            guess > numToGuess -> println("$guess is too HIGH!")
            guess < numToGuess -> println("$guess is too HIGH!")
            else -> {
                println("Well done! The number was $guess!")
                break   // Correct, so leave the loop
            }
        }
    }

    // Show final feedback
    println("You too $guesses guesses")
}


/**
 * Function to get a string from the user
 *
 * parameters:
 *   - prompt - Text to show the user
 * returns:
 *   - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String
    
    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}

/**
 * Function to get an Int from the user

 * parameters:
 *   - prompt - Text to show the user
 * returns:
 *   - Int that the user types
 */
fun getInt(prompt: String): Int {
    var intValue: Int?

    while(true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }

    return intValue!!
}