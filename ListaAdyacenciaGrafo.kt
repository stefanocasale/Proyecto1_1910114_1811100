class ListaAdyacenciaGrafo<T> : Grafo<T> {
    private val adyacencias: MutableMap<T, MutableList<T>> = mutableMapOf()

    override fun contiene(v: T): Boolean {
        return false
    }

    override fun agregarVertice(v: T): Boolean {
        return false
    }

    override fun tamano(): Int {
        return 0
    }

    override fun conectar(desde: T, hasta: T): Boolean {
        return false
    }

    override fun obtenerArcosSalida(v: T): List<T> {
        return listOf()
    }

    override fun obtenerArcosEntrada(v: T): List<T> {
        return listOf()
    }

    override fun eliminarVertice(v: T): Boolean {
        return false
    }

    override fun subgrafo(vertices: Collection<T>): Grafo<T> {
        return ListaAdyacenciaGrafo()
    }
}