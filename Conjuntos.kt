fun main() {
    // Crear un conjunto inmutable de números
    val conjuntoNumeros = setOf(1, 2, 3, 4, 5)
    println(conjuntoNumeros)

    // Crear un conjunto mutable de nombres
    val conjuntoNombres = mutableSetOf("Juan", "Ana", "Pedro", "Sofía")
    println(conjuntoNombres)

    // Crear un conjunto inmutable vacío
    val conjuntoVacio = setOf<String>()
    println(conjuntoVacio)
}