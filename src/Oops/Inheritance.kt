package Oops
 open class flower{
  open  var smell:String="Good"
  open  var colour:String="white"
open  fun  colour(){
      println(" colour is $colour")
    }
}
class rose:flower(){
    override var smell:String="so good"
  override  var colour:String="red"
    override fun colour(){
        super.colour()
//        println("colour is $colour")
    }
}
fun main(){
     var rose=rose()
   var flower =flower()
   println(rose.smell)
    rose.colour()
    flower.colour()
    println(flower.smell)
}
