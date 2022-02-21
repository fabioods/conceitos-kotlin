fun main(array: Array<String>){
  val arr= intArrayOf(1,2,3,4,5,6,7,8,9,10)

    for (item in arr) {
        println(item)
    }

    val map = mutableMapOf<Int,Any>()
    map.put(1,"Fabio")
    map[2]="Engenheiro de Software"
    map += 3 to "Meli"
    for (item in map){
        println(item.key)
        println(item.value)
        println(item)
    }

}