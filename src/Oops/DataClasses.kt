package Oops

data class DataClasses(var name:String, var age: Int) {

}

fun main() {
    var Data = DataClasses("Gungun",18)
    println(Data.name)
    println(Data.age)
    var Data1=Data.copy()
    println(Data1.name)
    println(Data1.age)
    Data1.name="Tanisha"
    Data1.age=19
    println(Data1.name)
    println(Data1.age)
    println("______________________")
    println(Data)
    println(Data1)

}