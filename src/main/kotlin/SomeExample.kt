import java.io.File

class SomeExample {
}
val list = listOf(1,2,3,4,5,6,7)
val listStr = listOf("a","b","c")

// map
var map = mapOf("a" to 1,"b" to 2,"c" to 3)
val onlyReadMap = mapOf('a' to "a",3 to "c",4 to 4)
fun main(){
    println(lazyProp)
    instanceAbstract()
    ifNotNull()
}
// if-not-null缩写
fun ifNotNull(){

    val files = File("Test").listFiles()
    println(files?.size)
}


// 实例化抽象类
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun otherSomeThing()
}
fun instanceAbstract(){
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {

            println("you can do some thing in this function")
        }

        override fun otherSomeThing() {
            // 将此处的todo 删除，否则会出现错误 提示还未实现
            println("you can do other thing in this function")
        }
    }
    myObject.doSomething()
}
// 创建单例
object Resource {
    val name = "yuqi"
}

// todo 扩展函数 暂时看不懂
fun String.spaceToCamelCase(){

}
// "Convert this to camelcase".spaceToCamelCase()

val name = "yuqi"
// 延迟属性
val lazyProp: String by lazy {
    listStr[0]+list[0] + name
}

fun mapDemo(){
    println(map["a"])
    println(onlyReadMap['a'])
    println(onlyReadMap[3])
    println(onlyReadMap[4])
}
fun forIter(){
    for ((key,value) in onlyReadMap){
        println("$key -> $value")
    }
    // 区间迭代
    for (i in 1..100) {
        print("$i ") //包含100
    }
    println()
    print("1 until 100 ")
    for (i in 1 until 100){
        print(i)
    }
    println()
    println("step 2")
    for (i in 2..10 step 2){
        print("$i ")
    }
    println()
    println("downTo")
    for (i in 10 downTo 0){
        print("$i ")
    }
    println()
    println("downTo Step 2")
    for (i in 10 downTo 1 step 2){
        print("$i ")
    }
    println()
    println("forEach")
    (1..5).forEach { print(it) }
}
// 类型判断
class Foo
class Bar
fun typeCheck(x: Any){
    when (x) {
        is String -> {}
        is Long -> {}
        is Foo -> {}
        is Bar -> {}
        else -> {}
    }
}

// 判断是否存在集合中
fun isInList(){
    if ("someText" in listStr) {}
    if ("someText" !in listStr) {}

}

// 更简洁的语法
val positive = list.filter { it > 0 }

//过滤list
val positives = list.filter { x -> x>0 }
// 函数默认参数
fun foo(a: Int = 0,b: String = ""){}

// 自动提供equals,hashcode,toString,copy等方法
data class Customer(val name: String,val email: String)

