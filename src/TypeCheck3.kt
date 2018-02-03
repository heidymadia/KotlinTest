package my.demo.basic

fun getStringLength3(obj: Any): Int? {
    // `obj` is automatically cas to `String` on the right-hand side of `&&`
    if(obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

fun main(args: Array<String>) {
    fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLength3(obj) ?: "... err, is empty or not a string at all"} ")
    }
    printLength("Incomprehensibilities")
    printLength("")
    printLength(1000)
}