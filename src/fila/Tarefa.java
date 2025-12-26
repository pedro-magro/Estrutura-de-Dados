package fila;

public class Tarefa implements Comparable<Tarefa> {

    String nome;
    int prioridade;

    public Tarefa(String nome, int prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Tarefa o) {
        return Integer.compare(this.prioridade, o.prioridade);
    }

    @Override
    public String toString() {
        return "Prioridade: "+ prioridade+" - fila.Tarefa: "+nome;
    }
}
