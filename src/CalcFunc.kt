fun main (args: Array<String>) {
    var num1: Double = 0.0
    var num2: Double = 0.010
    var opt: String
    print("Enter number 1: ")
    num1 = readLine()!!.toDouble()
    print("Enter number 2: ")
    num2 = readLine()!!.toDouble()
    print("Enter some operation + - * / ")
    opt = readLine()!!

    var result = if(opt == "+") sum(num1, num2) else if(opt == "-") sub(num1,num2) else if(opt == "*") mult(num1, num2) else if(opt == "/") div(num1, num2) else 0
    print("$num1 $opt $num2 = $result")
}

fun sum(num1: Double, num2: Double) : Double{
    return num1 + num2
}

fun sub(num1: Double, num2: Double): Double {
    return num1 - num2
}

fun mult(num1: Double, num2: Double) : Double{
    return num1 * num2
}

fun div(num1: Double, num2: Double) : Double{
    return num1 / num2
}