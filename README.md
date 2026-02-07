# Proyecto1_1910114_1811100
Nombres: Stefano Casale, Enyerber Silva
Carnets: 1910114, 1811100

# Explicación de Métodos
- contiene(v: T): Boolean: Le indica al usuario si un vertice ya es parte de la lista de adyacencias.

- agregarVertice(v: T): Boolean: Verifica si existe el nodo que se quiere agregar. En caso de que ya exista, no hace nada; caso contrario, lo agrega como una lista vacía y mutable ya que hasta ahora, no tiene conexiones.
 
- tamano(): Int: Devuelve la cantidad de objetos que hay en el conjunto de vértices, que justamente es el tamaño del mapa de adyacencias.

- conectar(desde: T, hasta: T): Boolean: Conecta dos vertices de un grafo. Si alguno de ellos no existe, o la conexión ya existe, retorna false, caso contraio retorna true.

- obtenerArcosSalida(v: T): List<T>: Retorna la lista de vértices que salen desde v. Si v no es un vértice del grafo o v no tiene arcos de salida, entonces retorna una lista vacía.

- obtenerArcosEntrada(v: T): List<T>: Retorna la lista de vértices que llegan a v. Si v no existe, entonces el método regresará una lista vacía. Itera sobre todos los vértices, para cada uno accede a su lista de adyacencias, si v esta en esa lista, agrega el vértice a la lista que finalmente se retorna.

- eliminarVertice(v: T): Boolean:

- subgrafo(vertices: Collection<T>): Grafo<T>: