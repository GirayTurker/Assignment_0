package base
import java.util.*

fun main(args:Array<String>){

    var myShape : Shape
    var reader = Scanner(System.`in`)

    println("")

    myShape = Square("Square")
    print("Enter Side Length of the Square: ")
    var length:Double = reader.nextDouble()
    myShape.setDimensions(length)
    myShape.printDimensions()
    println("Area of the Square is: ${myShape.getArea()}")

    println("")

    myShape = Circle("Circle")
    print("Enter Radius of the Circle: ")
    var radius :Double = reader.nextDouble()
    myShape.setDimensions(radius)
    myShape.printDimensions()
    println("Area of the Circle is: ${myShape.getArea()}")

    println("")

    myShape = Triangle("Triangle")
    print("Enter First side length of the Triangle: ")
    var side1:Double = reader.nextDouble()
    print("Enter Second side length of the Triangle: ")
    var side2:Double = reader.nextDouble()
    print("Enter Third side length of the Triangle: ")
    var side3:Double = reader.nextDouble()
    myShape.setDimensions(side1,side2,side3)
    if (side1.equals(side2)&&side2.equals(side3)){
        myShape = EquilateralTriangle("Equilateral Triangle")
        myShape.setDimensions(side1,side2,side3)
        myShape.printDimensions()
        println("Area of the Equilateral Triangle is: ${myShape.getArea()}")
    }
    else{
        myShape.printDimensions()
        println("Area of the Triangle is: ${myShape.getArea()}")
    }

}

