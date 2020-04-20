import java.util.*

class Nodo_Enlazado<E,P> : Nodo<E,P>{

    private var elemento:E

    private var listaArcos : LinkedList<Arco<E,P>>

    constructor(elemento : E){
        this.elemento = elemento
        this.listaArcos = LinkedList()
    }

    public fun addArco(arco : Arco<E,P>){
        this.listaArcos.add(arco)
    }

    override fun getElemento(): E {
        return this.elemento
    }

    override fun getListaArcos(): LinkedList<Arco<E, P>> {
        return this.listaArcos
    }
}