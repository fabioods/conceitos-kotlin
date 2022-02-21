fun main(args: Array<String>) {
    val num1 : Int = 31
    val num2 : Int = 20

    val max : Int = if (num1 > num2) num2 else num1

    println(max )

    if (num1 < num2){
        println("Número 1 é menor")
        num1
    } else {
        println("Numer 1 é maior")
    }

    when(num1){
        1 -> print(1)
        2 -> println("The result is 2")
        30 -> print("The result is 30")
        else -> {
            println("The result is not defined")
            print("dale")
        }
    }
}