fun main(){
    var name: String?="yuqi"
    println(name?.length)
    name = null
    println(name?.length)
    name = "yuqi"
    println(name!!.length)
    var hello: String? = null
    // println(hello!!.length) 打印报错
    val text = name ?: "wang" //如果name是null 把wang给text
    println(sumVararg(1,1,2,3,6,48,8))
}
fun sumVararg(vararg numbers: Int): Int{
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}