package pilha;

import arvore.Folha;

class Node {
    int valor;
    Node next;

    public Node(int valor){
        this.valor = valor;
        next = null;
    }

    public Node(){}
}
public class LinkedStack {

    Node topo;
    int size = 0;
    int min;

    public LinkedStack(){}

    public LinkedStack(int valor){
        topo = new Node(valor);
        size++;
        min = valor;
    }

    public void push(int valor){
        Node node = new Node(valor);
        node.next = topo;
        topo = node;
        size++;
        if(valor < min){min = valor;}
    }

    public int pop(){
        if(topo == null){
            throw new RuntimeException("Stack vazia.");
        }

        int retorno = topo.valor;
        topo = topo.next;
        size--;
        return retorno;
    }

    public int peek(){
        if(topo == null){
            throw new RuntimeException("Stack vazia.");
        }

        return topo.valor;
    }

    public int size(){
        return size;
    }

}
