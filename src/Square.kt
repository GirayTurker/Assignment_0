package base

class Square ( _name:String) : Shape(_name){

    var a :Double = 0.0

   fun setDimensions(a:Double) {

       this.a =a

     }

   override fun printDimensions() {

        println("One Side Length of the Square: ${a}")
    }

    override fun getArea (): Double {

        return a*a


    }

}