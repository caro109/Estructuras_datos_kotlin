fun main(){
    val conjuntoMutable = mutableSetOf("a", "b", "c")

    //agrega elementos
    /*conjuntoMutable.add("d")
    conjuntoMutable += "e"

    println(conjuntoMutable) // Imprime [a, b, c, d, e]*/

    //elimina elementos
    conjuntoMutable.remove("b")
    conjuntoMutable -= "c"

    println(conjuntoMutable) // Imprime [a]
} 