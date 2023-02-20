fun main() {
    val lista = listOf(
        Pair("Juan", 25),
        Pair("Maria", 30),
        Pair("Pedro", 28)
    )
    lista.forEach { persona ->
        val nombre = persona.first
        val edad = persona.second
        println("$nombre tiene $edad años")
    }
}