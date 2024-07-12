package Oops

fun main() {
    val st=Student()
    st.id= readln().toInt()
    st.name= readln()
    st.address= readln()
   st.print()
}
class Student{
    var id:Int=0
    var name:String=""
     var address:String=""
    fun print(){
        println("name is $name")
        println("Id is $id")
        println("Address is $address")
    }
}
