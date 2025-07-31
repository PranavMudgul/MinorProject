
fun main() {
    val marks = 100
    if (marks > 90) {
        println("Grade A")
    } else if (marks > 80 && marks <= 90) {
        println("Grade B")
    } else if (marks > 70 && marks <= 80) {
        println("Grade C")
    } else if (marks > 60 && marks <= 70) {
        println("Grade D")
    } else {
        println("FAIL")
    }
}
