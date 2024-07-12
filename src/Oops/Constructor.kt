package Oops

fun main() {
    println("Enter colour, model,price")
    val mobile=Mobile(readln(), readln(), readln().toInt())
    println("Enter colour, model")
    val mobile1=Mobile1(readln(), readln())
    println("Enter price, height")
    val mobile2=Mobile1(readln().toInt(), readln().toInt())
}
// Primary constructor
class Mobile(color:String,model:String, price:Int){
    init {
        println("Colour is $color")
        println("model is $model")
        println("price is $price")
    }
}
// second constructor
class Mobile1{
    constructor(color: String,model: String){
        println("Colour is $color")
        println("model is $model")
    }
    constructor(price: Int,height:Int){
        println("price is $price")
        println("height is $height")
    }
}
