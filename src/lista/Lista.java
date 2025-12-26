package lista;


public class Lista<T extends Comparable<T>>{

    private No<T> head;



    public void Lista(){
        this.head = null;
    }

    public void insereInicio(T value){
        No<T> novo = new No<T>(value);
        novo.setNext(null);
        head = novo;

    }
    public void insereFim(T value){
        No<T> novo = new No<T>(value);
        No<T> aux = head;
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        aux.setNext(novo.getNext());
    }

    public void insereOrdenado(T value){
        No<T> novo = new No<T>(value);
        No<T> aux = head;
        No<T> aux2 = null;
        while((aux != null) && (aux.getValue().compareTo(novo.getValue())) == -1){
            aux2 = aux;
            aux = aux.getNext();
        }
        if(this.head ==null) {
            this.head = novo;
        }
        else {
            novo.setNext(null);
            aux2.setNext(novo.getNext());
        }
    }
}
