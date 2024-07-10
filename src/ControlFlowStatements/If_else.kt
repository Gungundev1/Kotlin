package ControlFlowStatements
fun main(){
    println("Enter any number")
    // take input
    val num = readln().toInt()
    if (num>0)
        println("No. is positive")
    else
        println("NO. is negative")
}