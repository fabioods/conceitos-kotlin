fun main (array: Array<String>) {
    var num1 : Double
    var num2 : Double
    val opt : String

    print("Enter number 1: ")
    num1 = readLine()!!.toDouble()
    print("Enter number 2: ")
    num2 = readLine()!!.toDouble()
    print("What do you need? (+ - / *) ")
    opt = readLine()!!
    when(opt) {
        "+" -> println("$num1 $opt $num2 = ${num1+num2}")
        "-" -> println("$num1 $opt $num2 = ${num1-num2}")
        "*" -> println("$num1 $opt $num2 = ${num1*num2}")
        "/" -> println("$num1 $opt $num2 = ${num1/num2}")
        else -> println("Operation not found")
    }
}