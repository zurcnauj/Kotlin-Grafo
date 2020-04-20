interface Grafo_Dirigido<E,P> {

    fun remover(nodo : Nodo<E,P>)

    fun remover(arco : Arco<E,P>)

    fun pertenece(nodo : Nodo<E,P>) : Boolean

    fun pertenece(arco: Arco<E,P>) : Boolean

    fun agregarNodo(elemento : E) : Nodo<E,P>

    fun agregarArco(peso : P, inicio : Nodo<E,P>, fin : Nodo<E,P>) : Arco<E,P>?

    fun getNodos():Array<Nodo<E,P>>

    fun getArcos():Array<Arco<E,P>>
}