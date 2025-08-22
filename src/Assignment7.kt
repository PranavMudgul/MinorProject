fun main() {
    print("Enter exam score: ")
    val score = readLine()!!.toInt()

    // Using if...else if
    if (score > 90) {
        println("Excellent")
    } else if (score >= 75) {
        println("Good")
    } else if (score >= 50) {
        println("Pass")
    } else {
        println("Fail")
    }

    // Using if expression (ternary alternative in Kotlin)
    val result = if (score > 90) {
        "Excellent"
    } else if (score >= 75) {
        "Good"
    } else if (score >= 50) {
        "Pass"
    } else {
        "Fail"
    }

    println("Result (using if expression): $result")
}