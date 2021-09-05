package base

class Circle ( _name:String) : Shape(_name)  {

    var r :Double =0.0
    private var pi:Double = 3.14



    fun setDimensions(r:Double) {

        this.r =r

    }

    override fun printDimensions() {

        println("Radius: ${r} and Pi: ${pi}")
    }

    override fun getArea (): Double {

        return (r*r)*pi

    }
}