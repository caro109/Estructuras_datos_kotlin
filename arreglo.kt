fun main() {
    var miArreglo = arrayOf(1, 2, 3, 4, 5)

    //el numero 0 se utliza para acceder al primer elemento
    //del arreglo
    var primerElemento = miArreglo[0]
    println("el primer numero es $primerElemento")

    //asignamos el valor 10 al primer elemto de nuestro arreglo
    miArreglo[1]=10

    //accediendo a el segundo elemento modificado
    var segundoElemento = miArreglo[1]
    println("El segundo numero modificado es $segundoElemento")
}
