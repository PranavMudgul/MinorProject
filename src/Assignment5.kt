class Car(var make:String,var model:String,var year:Int,var mileage:Double)
{
    fun details()
    {
        println("Make :$make")
        println("Model :$model")
        println("Year :$year")
        println("Mileage :$mileage")
    }
    fun drive(miles:Double){
        mileage+=miles
        println("Driven miles :$miles")

    }
}
fun main()
{
    val c1=Car("XUE 300","XUE 700",2023,60000.0)
    println("Initial Details :")
    c1.details()
    c1.drive(150.0)
    println("Updated details :")
    c1.details()
}