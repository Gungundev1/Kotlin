package Oops

class User{
    var id:Int =0
        get(){
            println("Default value")
       return    field}
        set(value){

           if (value<=0){
               println("Invalid id")
           }
            else
               println("Setting values  $value")
            field=value
        }
}

fun main() {
    var id=User()
    println(id.id)
    println("Enter id")
    id.id= readln().toInt()
}