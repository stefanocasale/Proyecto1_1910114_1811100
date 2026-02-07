interface Grafo<T> {
    fun agregarVertice(v: T): Boolean    // STEFANO



    
    fun eliminarVertice(v: T): Boolean


    fun conectar(desde: T, hasta: T): Boolean   // STEFANO


    fun contiene(v: T): Boolean     // STEFANO 


    fun obtenerArcosSalida(v: T): List<T>


    fun obtenerArcosEntrada(v: T): List<T>


    fun tamano(): Int   // STEFANO


    fun subgrafo(vertices: Collection<T>): Grafo<T>
    
}