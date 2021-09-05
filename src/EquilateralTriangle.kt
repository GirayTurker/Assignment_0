package base

import kotlin.math.sqrt

class EquilateralTriangle(_name:String):Triangle(_name) {

    var a3 :Double = 0.0

    fun setDimensions(allSides:Double){
                super.setDimensions(allSides,allSides,allSides)
                this.a3 = allSides



    }



}