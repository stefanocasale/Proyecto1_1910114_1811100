class ListaAdyacenciaGrafo<T> : Grafo<T> {
    private val adyacencias: MutableMap<T, MutableList<T>> = mutableMapOf()

    override fun contiene(v: T): Boolean { 
        return v in adyacencias 
    }

    override fun agregarVertice(v: T): Boolean { 
        if (v in adyacencias) { // Si el vertice existe, no se agrega y se retorna false
            return false
        } else {
            // Se agrega el vértice con una lista vacía de adyacencias, ya que no tiene conexiones aún
            adyacencias[v] = mutableListOf() 
            return true
        }
    }

    override fun tamano(): Int { 
        return adyacencias.size // Devuelve la cantidad de vértices en el grafo
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