package Oops

open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}
class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle")
    }
}
class Square : Shape() {
    override fun draw() {
        println("Drawing a square")
    }
}
fun main(){
    var Sq = Square()
    Sq.draw()
    var c =Circle()
    c.draw()
    var sh=Shape()
    sh.draw()
}