import java.util.*

open class Shape { //kotlin中所有类默认为final，让一个类可以集成请将其标记为 open

}
fun main(){
    stringDemo()
    val rectangle = Rectangle(5.0,2.0)
    println("The perimter si ${rectangle.perimetr}")
    println("max of 9 an 8 is ${maxOf(9,8)}")
    println("max of 9 an 8 is ${maxOfSimple(9,8)}")
    loopFor()
    loopWhile()
    expRange()
    expRangeIter()
    listIter()
    expFilterMap()
    nullValueTest("6","2")
    printLengthOfString("helloJack")
    printLengthOfString(listOf(Any()))
    printLengthOfString(11111)
}
fun printLengthOfString(obj: Any){
    println("get the length of '${obj}' , Result : ${getStringLength(obj) ?: "Error: the object is not a string"} ")
}
fun getStringLength(obj: Any): Int?{
    if (obj is String) {
        return obj.length
    }
    return null
}
// 当可能用 null 值时，必须将引用显式标记为可空。可空类型名称以问号（?）结尾。
fun nullValueTest(arg1: String,arg2: String){

    return printProduct(arg1,arg2)
}
fun printProduct(agr1: String,agr2: String){
    val x = parseIntFromString(agr1)
    val y = parseIntFromString(agr2)

    if(x!= null && y!= null){
        println(x*y)
    } else {
        println("'${agr1}' or '${agr2}' is not a number")
    }
}
fun parseIntFromString(str: String): Int?{
    return str.toIntOrNull()
}

fun expFilterMap(){
    val items = setOf("apple", "banana", "kiwifruit")
    items.filter { it.startsWith("a") }
        .sortedBy { it  }
        .map { it.uppercase(Locale.getDefault()) }
        .forEach { println(it) }
}
fun isContainList(){
    val items = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is good also")
    }
}
fun listIter(){
    val items = listOf(1,2,3,4)
    for (i in items){
        println("list_iter is ${i}")
    }
}
fun expRangeIter(){
    for (x in 1..5){
        println("x is $x")
    }
    for (x in 1..10 step 2){
        println("x by step 2 is ${x}")
    }
}
fun expRange(){
    val x = 10
    val y = 9
    if (x in 1..y+1) { // 闭区间
        println("fits in range")
    }
    // 可以看出负数和数组的size都不在index中
    val list = listOf("a","b","c")
    if (-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if (list.size !in list.indices){
        println("list size is out of valid indices range, too")
    }
}
fun expWhenTest(){
    println(expWhen(1))
    println(expWhen("hello"))
    println(expWhen(1L))
    println(expWhen(2))
    println(expWhen(6))
}
fun expWhen(obj: Any): String = //: String 返回类型为字符串
        when (obj) {
            1 -> "one"
            "hello" -> "greetings"
            is Long -> "Long"
            !is String -> "not a string"
            else -> "unknown"
        }

fun loopWhile(){
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while(index < items.size) {
        println("loop_while item at ${index} is ${items[index]}")
        index++
    }
}
fun loopFor(){
    val items = listOf("a","b","c")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}
fun maxOfSimple(a: Int,b: Int) = if (a > b) a else b
fun maxOf(a: Int,b: Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
fun stringDemo(){
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s2)
}
class Rectangle(var height: Double,var length: Double) : Shape(){// : Shape()是kotlin中继承的写法
    var perimetr = (height + length) * 2
}