fun main(){
    // Crear una lista de enteros con los números del 1 al 5
    val lista = listOf(1,2,3,4,5)

    //Multiplica los números de la lista y almacena el resultado en una variable
    var resultado = 1
    lista.forEach { resultado *= it }

    //imprimir el resultado final
    println(resultado)
}