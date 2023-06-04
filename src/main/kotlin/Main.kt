fun main(){
    println("sum of 10 + 19 is ${sum(10, 19)}");
    print("sum of 10 and 18 is ${sum_simple(19,18)}")
    printSum(10,25)
    variable()
    println("Max int value is ${Int.MAX_VALUE}")
    println("Min int value is ${Int.MIN_VALUE}")
    println("size_bytes int value is ${Int.SIZE_BYTES}")
}


fun variable(){
    // 声明只读局部常量的三种方式
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    println("a = $a, b = $b, c = $c")
    // 可变变量
    var d = 10;
    d += 1
    print("d = $d")

}
fun printSum(a: Int,b: Int) {
    println("sum of $a and $b is ${a + b}")
}
fun sum_simple(a: Int,b: Int) = a + b
fun sum(a:Int,b:Int): Int {
    return a + b
}
fun string(){
    var name = "yuqi"
    println("Hello,${name}")

    name = "Jack"
    println("Hello,$name")

    val age  = 24

    println("your age is $age")

}