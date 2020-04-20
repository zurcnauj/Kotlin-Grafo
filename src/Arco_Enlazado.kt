class Arco_Enlazado<E,P> : Arco<E,P> {

    private var peso : P

    private var inicio : Nodo_Enlazado<E,P>
    private var fin : Nodo_Enlazado<E,P>

    constructor(peso : P , inicio : Nodo_Enlazado<E,P>, fin : Nodo_Enlazado<E,P>){
        this.peso = peso
        this.inicio = inicio
        this.fin = fin
        this.inicio.addArco(this)
        this.fin.addArco(this)
    }

    override fun getElemento(): P {
        return this.peso
    }

    override fun getNodoInicio(): Nodo<E, P> {
        return this.inicio
    }

    override fun getNodoFin(): Nodo<E, P> {
        return this.fin
    }
}