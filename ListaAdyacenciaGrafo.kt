class ListaAdyacenciaGrafo<T> : Grafo<T> {
    private val adyacencias: MutableMap<T, MutableList<T>> = mutableMapOf()

    override fun contiene(v: T): Boolean { // STEFANO
        return false
    }

    override fun agregarVertice(v: T): Boolean { // STEFANO
        return false
    }

    override fun tamano(): Int { // STEFANO 
        return 0
    }

    override fun conectar(desde: T, hasta: T): Boolean { // STEFANO
        return false
    }

    override fun obtenerArcosSalida(v: T): List<T> { // STEFANO
        return listOf()
    }

    override fun obtenerArcosEntrada(v: T): List<T> { // ENYER
        return listOf()
    }

    override fun eliminarVertice(v: T): Boolean { // ENYER
        return false 
    }

    override fun subgrafo(vertices: Collection<T>): Grafo<T> { // ENYER
        return ListaAdyacenciaGrafo()
    }
}