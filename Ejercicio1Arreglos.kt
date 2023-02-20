fun main() {
    // Crear un arreglo de enteros del 1 al 20
    val numeros = IntArray(20) { it + 1 }

    // Imprimir los números del arreglo en orden ascendente
    numeros.forEach { numero ->
        println(numero)
    }
}