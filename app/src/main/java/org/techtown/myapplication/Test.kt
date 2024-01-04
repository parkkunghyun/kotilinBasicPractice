package org.techtown.myapplication

const val data = 20
lateinit var str1: String

fun main() {
    val data4: Int by lazy {
        println("in lazy...")
        10
    }
    val data2: Any = 10

    println(data)
    println("in main....")
    println(data4 + 10)
    some()
    array1()

    println(some2(10, "h"))
    condition()
    forEach()
}
fun some(): Unit {
    println(10 + 20)
}
fun some2(data1: Int, data2: String = "hello"): String {
    return data2 + data1
}
fun array1(): Unit {
    val data1: Array<Int> = Array(3) { 0 }
    //data1 = Array(4){0}

    data1[0] = 0
    data1[1] = 1
    data1[2] = 2

    data1[2] = 3

    println("""
        array size: ${data1.size}
        array data: ${data1[0]} ${data1.get(1)}}
    """.trimIndent())
}

fun collection1(): Unit {
    var list = listOf<Int>(10, 20, 30)
    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(4, 40)
    mutableList.add(400)
    mutableList[0] = -4

    var map = mutableMapOf<String, String>(Pair("one", "two"), "two" to "world")
    println(map["one"])
    map["hell"] = "w"

}
fun condition(): Unit {
    val data: Int = 30
    var result = if (data > 30) {
        println("data > 30")
        false
    } else {
        println("data < 40")
        true
    }
    println(result)

    when(data) {
        10 -> println("data is 10")
        30 -> println("data is 30")
        else -> {
            println("data is not Integer")
        }
    }
}

// i in 1 until 10 -> 10미포함
// i in 1..10 step 2 -> 2씩 증가
// i in 10 downTo 1 -> 10부터 1까지 감소
// indices는 컬렉션 타입의 인덱스값을 의미함
fun forEach(): Unit {
    var data = 0
    for (i in 1..10) {
        data += i
    }
    println(data)

    var data5 = intArrayOf(10,20,30)

    for (i in data5.indices) {
        print(data5[i])
        if (i != data5.size - 1) print(", ")
    }

}

