# Proyecto1_1910114_1811100
Nombres: Stefano Casale, Enyerber Silva
Carnets: 1910114, 1811100


# Explicación de Métodos
- contiene(v: T): Boolean: Le indica al usuario si un vertice ya es parte de la lista de adyacencias.

- agregarVertice(v: T): Boolean: Cuestiona si existe el nodo que se quiere agregar. En caso de que ya exista, no hace nada; caso contrario, lo agrega como una lista vacía y mutable ya que hasta ahora, no tiene conexciones.
 
- tamano(): Int: Devuelve la cantidad de objetos que hay en el conjunto de vértices, que justamente es el tamaño del mapa de adyacencias

- conectar(desde: T, hasta: T): Boolean
- obtenerArcosSalida(v: T): List<T>
- obtenerArcosEntrada(v: T): List<T>s
- eliminarVertice(v: T): Boolean
- subgrafo(vertices: Collection<T>): Grafo<T>


