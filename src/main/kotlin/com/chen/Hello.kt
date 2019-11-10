package com.chen

import javax.lang.model.element.NestingKind

fun main() {
    //println("Hello Kotlin!!!")
//    Human().hello()
    val h = Human(67.5f,1.7f)
    println("Kotlin BMI: " + h.bmi())
//    h.hello()
//    var age = 21
//    age = 22
//    println(age)
//    var long = 35.5
//    println(long)
//    val name = "Tom"
//    println(name)
//    val name2 = "Grete"
//    var name3 = "xxx"
//    name3 = "Joe"
//    println(name2)
//    println(name3)


}

class Human(var weight : Float,var height : Float ) {
     fun bmi() : Float{
         var bmi = weight / (height * height)
         return bmi
     }
     fun hello() {
         println(" Hello 物件 Kotlin")
     }
}