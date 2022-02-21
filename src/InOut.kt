fun main(args : Array<String>){
    var name : String
    var age : Int
    print("Enter your name: ")
    name = readLine()!!
    print("How old are you? ")
    age = readLine()!!.toInt()
    println("Hello, $name so you have $age years old, your name has ${name.length} characters")
}