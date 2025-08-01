class Area(var radius:Int)
{
    val pi=3.142
    fun area(): Double
    {
        return pi*radius*radius
    }
}
fun main()
{
    val a1=Area(5)
    val a2=Area(7)
    println("Area of circle is :  ${a1.area()}")
    println("Area of Circle is :  ${a2.area()}")


}