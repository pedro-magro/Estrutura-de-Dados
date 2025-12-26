package lista;

public class No<T>{
    private T value;
    private No next;

    public No(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public No getNext(){
        return next;
    }

    public void setNext(No next){
        this.next = next;
    }
}
