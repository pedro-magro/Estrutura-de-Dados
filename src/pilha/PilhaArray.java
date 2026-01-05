package pilha;

public class PilhaArray {
    private int[] dados;
    private int topo;

    public PilhaArray(int capacidade){
        dados = new int[capacidade];
        topo = -1;
    }

    public void push(int valor){
        if (topo == dados.length - 1) {
            throw new RuntimeException("Overflow");
        }
        dados[++topo] = valor;
    }

    public int pop(){
        if (topo == -1 ){
            throw new RuntimeException("Underflow");
        }
        return dados[topo--];
    }

    public int peek(){
        return dados[topo];
    }

    public int size(){return topo;}
}

