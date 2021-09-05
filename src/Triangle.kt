package base
import kotlin.math.*


open class Triangle(_name:String) : Shape(_name) {

    var a:Double=0.0
    var b:Double=0.0
    var c:Double=0.0
    private val pS:Double=0.5


    fun setDimensions(side1:Double, side2:Double, side3:Double) {

        this.a = side1
        this.b = side2
        this.c = side3

    }

    override fun printDimensions() {

        println("First Side: ${a}, Second Side: ${b}, Third Side: ${c}, and Perimeter S: ${pS}")
    }

    override fun getArea (): Double {


        val new_pS:Double = (a+b+c)/(2)
        return sqrt((new_pS*(new_pS-a)*(new_pS-b)*(new_pS-c)))

    }


}