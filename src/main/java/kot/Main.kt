package kot

fun main() {
    println("Hello world!")
    var name: String = "Ivan"
    println(name)

    var str1: String? = "gdfgdf"
    var str2: String? = null
    var str3: String? = null

    println((str1?.length ?: 0) + (str2?.length ?: 0) + (str3?.length ?: 0))

}