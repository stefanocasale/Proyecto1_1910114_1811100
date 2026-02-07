class ListaAdyacenciaGrafo<T> : Grafo<T> {
    private val adyacencias: MutableMap<T, MutableList<T>> = mutableMapOf()

    override fun contiene(v: T): Boolean { // Verifica si el vértice existe en el grafo
        return v in adyacencias 
    }

    override fun agregarVertice(v: T): Boolean { 
        if (v !in adyacencias) { // Si el vértice no existe, se agrega al grafo
            adyacencias[v] = mutableListOf() 
            return true
        }

        return false 
    }

    override fun tamano(): Int { 
        return adyacencias.size // Devuelve la cantidad de vértices en el grafo
    }

    override fun conectar(desde: T, hasta: T): Boolean { 
        // Verifica que ambos nodos a conectar existan en el grafo
        if (desde !in adyacencias || hasta !in adyacencias){
            return false 
        }

        // Verifica si la conexión ya existe 
        if (hasta in adyacencias[desde]!!) {
            return false
        }

        // Realiza la conexión   
        adyacencias[desde]!!.add(hasta)

        return true
    }

    override fun obtenerArcosSalida(v: T): List<T> { 
        // Verifica si el vértice existe 
        if (v !in adyacencias) {
            return listOf() // Si no existe, retorna una lista vacía
        }

        // Retorna la lista de vértices que salen desde v 
        return adyacencias[v]!!
    }

    override fun obtenerArcosEntrada(v: T): List<T> { 

        // Verifica si el vértice existe
        if (v !in adyacencias) {
            return listOf() // Si no existe, retorna una lista vacía
        }

        val entrada = mutableListOf<T>() // Almacena los vértices que tienen una conexión hacia v

        // Recorre todos los vertices 
        for (vertices in adyacencias) { 
            // Verifica la conexión 
            if (v in vertices.value) { // Si v esta en la lista actual, se agrega el vértice a la lista de entrada
                entrada.add(vertices.key) 
            }
        }

        return entrada
    }

    override fun eliminarVertice(v: T): Boolean { 
        return false 
    }

    override fun subgrafo(vertices: Collection<T>): Grafo<T> { 
        return ListaAdyacenciaGrafo()
    }
}