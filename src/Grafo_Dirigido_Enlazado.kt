import java.util.*

class Grafo_Dirigido_Enlazado<E,P> : Grafo_Dirigido<E,P> {

    private var nodos : LinkedList<Nodo_Enlazado<E,P>>
    private var arcos : LinkedList<Arco_Enlazado<E,P>>

    constructor(){
        this.nodos = LinkedList()
        this.arcos = LinkedList()
    }

    override fun remover(nodo : Nodo<E,P>){
        if((nodo is Nodo_Enlazado) && this.nodos.contains(nodo) ){
            this.nodos.remove(nodo)
        }
    }

    override fun remover(arco : Arco<E,P>){
        if ((arco is Arco_Enlazado) && this.arcos.contains(arco)){
            this.arcos.remove(arco)
        }
    }
    override fun agregarNodo(elemento: E): Nodo<E, P> {
        var retu : Nodo_Enlazado<E,P> = Nodo_Enlazado(elemento)
        this.nodos.add(retu)
        return retu;
    }

    override fun agregarArco(peso: P, inicio: Nodo<E, P>, fin: Nodo<E, P>): Arco<E, P>? {
        var retu : Arco_Enlazado<E,P>?
        if((inicio is Nodo_Enlazado) && this.nodos.contains(inicio) && (fin is Nodo_Enlazado) && this.nodos.contains(fin)){
            retu = Arco_Enlazado(peso,inicio,fin)
            this.arcos.add(retu)
        }
        else{
            retu = null
        }
        return retu
    }

    override fun pertenece(nodo: Nodo<E, P>): Boolean {
        return (nodo is Nodo_Enlazado) && this.nodos.contains(nodo) ;
    }

    override fun pertenece(arco: Arco<E, P>): Boolean {
        return (arco is Arco_Enlazado<E,P>) && this.arcos.contains(arco) ;
    }

    override fun getNodos(): Array<Nodo<E, P>> {
        return Array(this.nodos.size){ i -> this.nodos[i] }
    }

    override fun getArcos(): Array<Arco<E, P>> {
        return Array(this.arcos.size){ i -> this.arcos[i] }
    }

}