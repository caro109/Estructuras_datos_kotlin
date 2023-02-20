fun main(){
    //creación del conjunto con numeros enteros
    val conjuntoA = setOf(1, 2, 3, 4, 5)
    val conjuntoB = setOf(4, 5, 6, 7, 8)

    //union de los conjuntos
    val union = conjuntoA.union(conjuntoB)
    println("Unión: $union")

    //intersección de los conjuntos
    val interseccion = conjuntoA.intersect(conjuntoB)
    println("Intersección: $interseccion")

    //Diferencia de los conjuntos
    val diferencia = conjuntoA.subtract(conjuntoB)
    println("Diferencia: $diferencia")
}