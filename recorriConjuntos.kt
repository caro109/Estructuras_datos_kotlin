fun main(){
    val conjunto = setOf("a", "b", "c")

    //forEach
    /*conjunto.forEach { elemento ->
        println("Elemento: $elemento")
    }*/

    //iterador
    /*val iterador = conjunto.iterator()

    while (iterador.hasNext()) {
        val elemento = iterador.next()
        println("Elemento: $elemento")
    }*/

    //for-in loop
    for (elemento in conjunto) {
        println("Elemento: $elemento")
    }
}