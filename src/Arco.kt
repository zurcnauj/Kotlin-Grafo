interface Arco<E,P> {

    fun getElemento():P

    fun getNodoInicio():Nodo<E,P>
    fun getNodoFin():Nodo<E,P>
}