open class BankAccount(
    public var accountHolder: String,
    internal var bankName: String,
    private var balance: Double
) {
    protected fun showBalance() {
        println("Balance: $balance")
    }
}

class SavingsAccount(accountHolder: String, bankName: String, balance: Double) :
    BankAccount(accountHolder, bankName, balance) {
    fun display() {
        showBalance()
    }
}

fun main() {
    val sa = SavingsAccount("Aditya", "SBI Bank", 5000.0)
    println("Account Holder: ${sa.accountHolder}")
    println("Bank Name: ${sa.bankName}")
    sa.display()
}