fun main(){
    //creando conjunto de Strings
    val amigos = mutableSetOf("Ana", "Juan", "María", "Pedro")

    //Ingreso por el teclado
    println("Escribe el nombre de un amigo:")
    val nombre = readLine()!!

    if (amigos.contains(nombre)) {
        println("El amigo $nombre está en el conjunto")
    } else {
        amigos.add(nombre)
        println("Se ha agregado el amigo $nombre al conjunto")
    }
}