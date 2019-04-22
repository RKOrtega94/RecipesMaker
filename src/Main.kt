fun main (arg: Array<String>){
    println(":: Bienvenido a Recipe Maker ::")
    //Variable para almacenar el valor obtenido
    var option = 0

    //Ciclo de entrada
    loop@ while (option != 3) {
        println(
            """

        Elija la opcion deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
        """.trimIndent()
        )
        print("Opcion:")
        val resopinse: Int = readLine()!!.toInt()
        option = resopinse
        //Si no esta dentro de las opciones repite el ciclo
        if (option in 4..0) continue@loop
        //Si esta dentro de las opciones ejecuta el ciclo que corresponde
        when (option) {
            //Agregar receta
            1 -> addRecipe()
            2 -> println("Ver recetas")
            3 -> println("Salir")
        }
    }
}
//Funcion para agregar recetas
fun addRecipe(){
    println("Agregar receta")
}