fun main(){
    val listadepares = listOf(Pair(2, 3), Pair(5, 4), Pair(1, 6))

    var resultado = 1
    listadepares.forEach { resultado *= it.first * it.second }

    println(resultado)
}