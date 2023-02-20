fun main(){
    val mapa = mutableMapOf(
    "a" to 1,
    "b" to 2,
    "c" to 3
    )
    println(mapa)

    val mapa2 = mapOf(
    1 to "uno",
    2 to "dos"
    )
    println(mapa2)

    val mapa3 = emptyMap<String, Int>()
    println(mapa3)
}