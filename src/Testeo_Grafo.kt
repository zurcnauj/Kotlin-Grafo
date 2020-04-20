import java.util.*

fun main(){
    var grafo : Grafo_Dirigido_Enlazado<Int,Int> = Grafo_Dirigido_Enlazado()
    var nodos : Array<Nodo<Int,Int>> = Array(10){i -> grafo.agregarNodo(i)}
    var arcos : Array<Arco<Int,Int>?> = Array(9){i -> grafo.agregarArco(i,nodos[i],nodos[i+1])}

    println("Nodos")
    for( nodo in nodos ){
        print("Ne: ${nodo.getElemento()} | ")
    }
    println()
    println("Arcos")
    for( arco in arcos ){
        print("Np: ${arco!!.getElemento()} | ")
    }
    println()
    println("Nodos size: ${grafo.getNodos().size}")
    println("Arcos size: ${grafo.getArcos().size}")

    var nodo_1 : Nodo<Int,Int> = Nodo_Enlazado<Int,Int>(-1)
    var nodo_2 : Nodo<Int,Int> = Nodo_Enlazado<Int,Int>(-1)
    println("prueba anda nodo[0]: ${grafo.pertenece(nodos[0])}")
    println("prueba no anda nodo_1: ${grafo.pertenece(nodo_1)} nodo_2: ${grafo.pertenece(nodo_2)}")

    grafo.remover(nodos[0])
    grafo.remover(nodos[1])
    println("Nodos size: ${grafo.getNodos().size}")
}