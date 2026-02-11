# Proyecto1_1910114_1811100
- Nombres: Stefano Casale, Enyerber Silva
- Carnets: 1910114, 1811100
- Universidad Simón Bolívar
- Trimestre Ene - Mar 2026

# Pasos de Ejecucion
1. Instalar Kotlin:
    - Desde tu terminal de WSL ejecuta el siguiente comando:
        - sudo apt install kotlin
2. Ubica tu entorno:
    - Desde tu terminal de WSL ejecuta el siguiente comando:
        - cd ubicacion/de/tu/entorno
3. Compila todos los archivos .kt que estan en la misma carpeta:
    - Desde tu terminal de WSL ejecuta el siguiente comando:
        - kotlinc *.kt -d out -include-runtime
4. Ejecuta Main.kt:
    - Desde tu terminal de WSL ejecuta el siguiente comando:
        - kotlin -cp out MainKt


# Decisiones de Implementacion
En este proyecto se tomo la decision de usar MutableMap<T, MutableList<T>> debido a que el mapa representa cada vértice con su lista de sucesores, cumpliendo asi con la representacion de un grafo dirigido por listas de adyacencias. Ademas, fue recomendado a traves del mismo enunciado del proyecto. 

Decidimos agregar un archivo "Main.kt" donde realizamos pruebas para validar y verificar el funcionamiento de cada uno de los métodos implementados para este proyecto. De esta manera cualquier usuario puede ejecutarlo y comprobarlo

# Explicación de Métodos
- contiene(v: T): Boolean: Le indica al usuario si un vertice ya es parte de la lista de adyacencias.

- agregarVertice(v: T): Boolean: Verifica si existe el nodo que se quiere agregar. En caso de que ya exista, no hace nada; caso contrario, lo agrega como una lista vacía y mutable ya que hasta ahora, no tiene conexiones.
 
- tamano(): Int: Devuelve la cantidad de objetos que hay en el conjunto de vértices, que justamente es el tamaño del mapa de adyacencias.

- conectar(desde: T, hasta: T): Boolean: Conecta dos vertices de un grafo. Si alguno de ellos no existe, o la conexión ya existe, retorna false, caso contraio retorna true.

- obtenerArcosSalida(v: T): List<T>: Retorna la lista de vértices que salen desde v. Si v no es un vértice del grafo o v no tiene arcos de salida, entonces retorna una lista vacía.

- obtenerArcosEntrada(v: T): List<T>: Retorna la lista de vértices que llegan a v. Si v no existe, entonces el método regresará una lista vacía. Itera sobre todos los vértices, para cada uno accede a su lista de adyacencias, si v esta en esa lista, agrega el vértice a la lista que finalmente se retorna.

- eliminarVertice(v: T): Boolean: Verifica si el nodo v está en la estructura, si no está entonces la función no hace nada. En caso contrario, elimina el nodo v y los arcos asociados, se usa un ciclo para limpiar de las demás listas las referencias que estaban asociadas al nodo eliminado.

- subgrafo(vertices: Collection<T>): Grafo<T>: Se crea una nueva instancia de grafo que será la base para agregar los vértices y los arcos correspondientes a los elementos que se desea tener en el subgrafo deseado. Los vértices se recorren uno a uno y solo se agregan aquellos que interesan, luego se agregan las referencias entre los vértices y se conectan entre ellos si estaban en el original inicialmente.

# Tabla de complejidad computacional (Big O)

|         Método         |   Complejidad   |              Descripción
|------------------------|-----------------|--------------------------------------------------
| contiene(v)            |       O(1)      | Accede a un elemento del mapa
| agregarVertice(v)      |       O(1)      | Inserta un elemento al mapa
| tamano()               |       O(1)      | Accede a un puntero del mapa
| conectar(desde, hasta) | O(grado(desde)) | Recorre toda la lista asociada a desde, verificando  duplicados
| obtenerArcosSalida(v)  |       O(1)      | Devuelve la lista asociada a v
| obtenerArcosEntrada(v) |     O(V + E)    | Recorre todos los vértices y accede a sus listas asociadas, buscando quienes apuntan a v
| eliminarVertice(v)     |     O(V + E)    | Elimina v y recorre las listas de asociadas a los demas vértices para eliminar las referencias que queden
| subgrafo(vertices)     |    O(Vs + Es)   | Recorre las listas asociadas a vertices y sus arcos

Leyenda: 
- Vs =  Vértices seleccionados 
- Es = Arcos entre los vértices seleccionados