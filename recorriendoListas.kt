fun main(){
    val lista = listOf("hola", "mundo", "en", "Kotlin")

    //ciclo for
    /*for (elemento in lista) {
        println(elemento)
    }*/

    //ciclo while
    /*var indice = 0
    while (indice < lista.size) {
        println(lista[indice])
        indice++
    }*/

    //reccorrido con un iterador
    /*val iterador = lista.iterator()
    while (iterador.hasNext()) {
     val elemento = iterador.next()
        println(elemento)
    }*/

    //Recorrido con funcion forEach
    lista.forEach {
        println(it)
    }
}
