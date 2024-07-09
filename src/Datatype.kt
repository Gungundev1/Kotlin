class user(
    val uname: String,
    val userid: Int,
    val address: String
){
    fun display(){
        println(uname)
        println(userid)
        println(address)
}
}
val user1:user=user(userid = 1234, uname = "Gungun", address = "up@1")


fun main(){
    var n:Int=24// integer type
    var name:String="Tanisha" // String type
    var number:Double=34.5 // double type
    println("value of n: $n")
    println("Name is: $name")
    println("Value of number is: $number")

    user1.display()
    val fruits :Array<String> = arrayOf("Apple","Blackberry","Mango","Litchi")// Array
    println(fruits[1])// print element at index
}