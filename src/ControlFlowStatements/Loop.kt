package ControlFlowStatements
fun main(){
    // print number to a range
    println("Enter any number")
    val n= readln().toInt()
    for (n in 1..n){
        println("hello")
    }
    // to check a character is vowel or constant
println("Enter any char value:")
    val c= readln().toUpperCase()

when(c){
"A"-> println("vowel")
    "E"-> println("vowel")
    "I"-> println("vowel")
    "O"-> println("vowel")
    "U"-> println("vowel")
    else-> println("constant")
}
}

