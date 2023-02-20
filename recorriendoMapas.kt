fun main(){
    val mapa = mapOf(
    "a" to 1,
    "b" to 2,
    "c" to 3
)

    //forEach
    /*mapa.forEach { clave, valor ->
        println("$clave -> $valor")
    }*/

    //for
    for (clave in mapa.keys) {
        val valor = mapa.get(clave)
        println("$clave -> $valor")
    }
    
    for (valor in mapa.values) {
        println("$valor")
    }
}