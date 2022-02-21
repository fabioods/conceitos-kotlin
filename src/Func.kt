fun main(args: Array<String>){
    firstFunction("Fabio")
    val r = secondFunction()
    println(r)

    val list = listOf<Int>(1,2,6,9,0,10)
    val greaterThan5 = list.count({n -> n >5})
    println(greaterThan5)
}

fun firstFunction(name: String) {
    println("first Function $name")
}
fun secondFunction(): String{
    return "secondFunction"
}