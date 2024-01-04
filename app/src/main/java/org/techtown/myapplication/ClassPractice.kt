package org.techtown.myapplication

class User {
    init {
        println("init...")
    }
    private var name = "kkang"
    constructor(name: String) {
        println("constructor")
        this.name = name
    }
    fun someFun(): Unit {
        println("name: $name")
    }
    class SomeClass{}
}
class User2(name: String, count: Int) {
    init {
        println("init...")
    }
    fun someFun() {
        // println("name is $name" ) 이러면 오류!
    }
}
class User3(private val name: String, private var age: Int) {
    fun someFun() {
        println("name is $name, age is $age")
    }
}

fun main() {
    val user = User("kim")
    val user2 = User3("park", 10)
    user.someFun()
    user2.someFun()
    

}