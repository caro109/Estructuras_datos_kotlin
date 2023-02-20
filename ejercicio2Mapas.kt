fun main(){
    val poblaciones = mapOf("Madrid" to 3207247, "Barcelona" to 1620343, "Valencia" to 791413, "Sevilla" to 688711)

    println("Escribe el nombre de una ciudad:")
    val ciudad = readLine()!!

    val poblacion = poblaciones[ciudad]

    if (poblacion != null) {
        println("La población de $ciudad es $poblacion")
    } else {
        println("La ciudad $ciudad no está registrada")
    }
}