import ListaAdyacenciaGrafo

// Pondre pruebas para verificar el funcionamiento del grafo implementado en ListaAdyacenciaGrafo.kt

fun main() { 
    //Crear un grafo de Strings
    val grafo = ListaAdyacenciaGrafo<String>()

    //Agregar vértices                                 // Salida esperada
    println("Agregar A: ${grafo.agregarVertice("A")}") // true
    println("Agregar B: ${grafo.agregarVertice("B")}") // true
    println("Agregar C: ${grafo.agregarVertice("C")}") // true
    println("Agregar A otra vez: ${grafo.agregarVertice("A")}") // false

    //Conectar vértices                                    // Salida esperada
    println("Conectar A → B: ${grafo.conectar("A", "B")}") // true
    println("Conectar A → C: ${grafo.conectar("A", "C")}") // true
    println("Conectar B → A: ${grafo.conectar("B", "A")}") // true
    println("Conectar A → B (duplicado): ${grafo.conectar("A", "B")}") // false

    //Consultar arcos                                              // Salida esperada
    println("Arcos salida de A: ${grafo.obtenerArcosSalida("A")}") // [B, C]
    println("Arcos entrada de A: ${grafo.obtenerArcosEntrada("A")}") // [B]
    println("Arcos salida de C: ${grafo.obtenerArcosSalida("C")}") // []

    //Tamaño del grafo                             // Salida esperada
    println("Tamaño del grafo: ${grafo.tamano()}") // 3

    //Subgrafo 
    val sub = grafo.subgrafo(listOf("A", "B"))
    println("Subgrafo (A, B) - arcos salida de A: ${sub.obtenerArcosSalida("A")}") // [B]

    //Eliminar vértice                                   // Salida esperada
    println("Eliminar B: ${grafo.eliminarVertice("B")}") // true
    println("Tamaño después de eliminar: ${grafo.tamano()}") // 2
    println("Arcos entrada de A: ${grafo.obtenerArcosEntrada("A")}") // [] 

    //Verificar vértices                           // Salida esperada
    println("¿Contiene A? ${grafo.contiene("A")}") // true
    println("¿Contiene B? ${grafo.contiene("B")}") // false
}