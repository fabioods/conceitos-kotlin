fun main(args: Array<String>){
    print("Peso: ")
    val peso = readLine()!!.toDouble()
    print("Altura: ")
    val altura = readLine()!!.toDouble()
    checkImc(peso, altura)
}

fun checkImc(peso: Double, altura: Double){
    var result = peso / (altura*altura)
    if(result>25) println("Acima do peso")
    else println("Peso normal")
}