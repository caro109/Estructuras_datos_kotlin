fun main() {
    // Crear una lista de enteros con los números del 1 al 20
    val listaNumeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    // Calcular el promedio de los números de la lista
    val promedio = listaNumeros.average()

    // Almacenar el resultado en una variable
    val resultado = promedio
    println("El promedio de los números es: $resultado")
}