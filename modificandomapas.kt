fun main(){
    val mapa = mutableMapOf(
    "a" to 1,
    "b" to 2,
    "c" to 3
)

    //modificar
    /*mapa.put("d", 4)
    mapa.put("b", 5)
    println(mapa)*/

    //Eliminar
    mapa.remove("b")
    println(mapa)
}