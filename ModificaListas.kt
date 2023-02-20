fun main(){
    val lista1 = mutableListOf("Manzana", "Naranja", "Plátano", "Mango")

    // Modificar el segundo y tercer elemento de la lista
    lista1[1] = "Pera"
    lista1[2] = "Sandía"

    // Imprimir los elementos modificados
    println("La lista modificada es: $lista1")
}