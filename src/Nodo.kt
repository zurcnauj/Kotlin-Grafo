import java.util.*

interface Nodo<E,P> {

    fun getElemento():E

    fun getListaArcos():LinkedList<Arco<E,P>>
}