fun main(){
    val mapa = mapOf(
    "a" to 1,
    "b" to 2,
    "c" to 3
)

    //funcion get
    val valor = mapa.get("a")
    println(valor)

    // o bien
    val valor2 = mapa["a"]
    println(valor2)

    //getOrDefault
    val valor3 = mapa.getOrDefault("d", 0)
    println(valor3)
}