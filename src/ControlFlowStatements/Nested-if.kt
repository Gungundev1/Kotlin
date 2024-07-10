package ControlFlowStatements



fun main(){
    // Program to take grade
    println("Enter your marks:")
    val marks= readln().toInt()
    if (marks>=60)
        println("Your grade is A")
    else if (marks in 45..60){
        println("Your grade is B")
    }
        else if (marks>=33 && marks<45)
            println("your grade is C")
    else
        println("you are fail")

}