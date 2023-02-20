fun main() {
    val conjunto = setOf("a", "b", "c")

    //Contains
    /*if (conjunto.contains("b")) {
        println("El conjunto contiene el elemento 'b'")
    }*/

    //Foreach
    /*conjunto.forEach { elemento ->
        println("Elemento: $elemento")
    }*/

    //iterador
    /*val iterador = conjunto.iterator()

    while (iterador.hasNext()) {
        val elemento = iterador.next()
        println("Elemento: $elemento")
    }*/

    //elementAt
    val iterador = conjunto.iterator()

    while (iterador.hasNext()) {
        val elemento = iterador.next()
        println("Elemento: $elemento")
    }
}