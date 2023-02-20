fun main() {
    // Crear un arreglo de Strings
    val amigos = arrayOf("Ana", "Carlos", "Diego", "Fernanda", "Luisa")

    // Ordenar los nombres en orden alfabético
    val nombresOrdenados = amigos.sorted()

    // Imprimir los nombres ordenados
    nombresOrdenados.forEach { nombre ->
        println(nombre)
    }
}