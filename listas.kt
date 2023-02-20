fun main(){
    var lista1 = mutableListOf("Manzana", "Naranja", "Plátano", "Mango")
    
    //accediendo a ella
    val segundoElemento = lista1[1]
    val tercerElemento = lista1.get(2)

    println("El elemento 1 y 2 es: $segundoElemento , $tercerElemento")
}