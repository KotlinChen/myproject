package com.chen

fun main() {
    val h = Human(weight = 50f,height = 1.7f)
    println("Kotlin BMI:"+h.bmi())
    h.hello()


}
class Human(var weight : Float,var height : Float){
    init{
        println("Test Kotlin $weight")
    }
//    constructor(name : String,weight: Float,height: Float) : this(weight,height)
    fun bmi() : Float{
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello(){
    println("Test Kotlin 108-12-21")
    }
}
