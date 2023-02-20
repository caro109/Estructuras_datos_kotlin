fun main(){
    //creacion de mapa con nombres y edades
    val edades = mapOf("Ana" to 25, "Carlos" to 32, "Alicia" to 28, "Pedro" to 29)

    //funcion para elegir las personas que empiecen por el nombre a
    val edadesA = edades.filterKeys { it.startsWith("A") }.values

    println("Edades de las personas cuyo nombre comienza con A: $edadesA")
}