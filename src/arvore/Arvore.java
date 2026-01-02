package arvore;

import java.util.*;

public class Arvore {

    private Folha folha;
    private Arvore esquerda;
    private Arvore direita;

    public Arvore(){
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore(Folha folha){
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty(){
        return this.folha == null;
    }

    public void inserir(Folha novo){
       if(isEmpty()){
           this.folha = novo;
       }
       else{
           Arvore novaArvore = new Arvore(novo);
           if (novo.getValor() < this.folha.getValor()){
               if(this.esquerda == null){
                   this.esquerda = novaArvore;
                   System.out.println("arvore.Folha: "+novo.getValor()+" a esquerda de: "+this.folha.getValor());
               }
               else{
                   this.esquerda.inserir(novo);
               }
           }
           else if( novo.getValor() > this.folha.getValor()){
               if (this.direita == null){
                   this.direita = novaArvore;
                   System.out.println("arvore.Folha: "+novo.getValor()+" a direita de: "+this.folha.getValor());
               }
               else {
                   this.direita.inserir(novo);
               }
           }
       }
    }

    public List<Integer> preorder(){
        List<Integer> result = new ArrayList<>();
        this.preorderRecursive(this, result);
        return result;
    }

    public void preorderRecursive(Arvore arvore, List<Integer> result){
        if(arvore == null) {
            return;
        }
        result.add(arvore.folha.getValor());
        preorderRecursive(arvore.esquerda, result);
        preorderRecursive(arvore.direita, result);
    }

    public List<Integer> inorder(){
        List<Integer> result = new ArrayList<>();
        this.inorderRecursive(this, result);
        return result;
    }

    public void inorderRecursive(Arvore arvore, List<Integer> result){
        if(arvore == null) {
            return;
        }
        inorderRecursive(arvore.esquerda, result);
        result.add(arvore.folha.getValor());
        inorderRecursive(arvore.direita, result);
    }

    public List<Integer> postorder(){
        List<Integer> result = new ArrayList<>();
        this.postorderRecursive(this, result);
        return result;
    }

    public void postorderRecursive(Arvore arvore, List<Integer> result){
        if(arvore == null) {
            return;
        }
        postorderRecursive(arvore.esquerda, result);
        postorderRecursive(arvore.direita, result);
        result.add(arvore.folha.getValor());
    }

    public Arvore inverte(){
        return this.inverteRecursivo(this);
    }

    public Arvore inverteRecursivo(Arvore arvore){
        if(arvore == null){
            return null;
        }

        Arvore temp = arvore.esquerda;
        arvore.esquerda = arvore.direita;
        arvore.direita = temp;

        inverteRecursivo(arvore.esquerda);
        inverteRecursivo(arvore.direita);

        return arvore;
    }

    public boolean dfs(int target){
        return this.dfsRecursivo(this, target);
    }

    public boolean dfsRecursivo(Arvore arvore, int target){
        if(arvore == null){
            return false;
        }

        if(arvore.folha.getValor() == target){
            return true;
        }

        return dfsRecursivo(arvore.esquerda, target) || dfsRecursivo(arvore.direita, target);
    }

    public boolean bfs(int data){
        if(this == null){
            return false;
        }

        Queue<Arvore> fila = new LinkedList<>();

        fila.add(this);

        while(!fila.isEmpty()){
            Arvore arvoreAtual = fila.poll();
            if(arvoreAtual.folha.getValor() == data){
                return true;
            }

            if(arvoreAtual.esquerda != null){
                fila.add(arvoreAtual.esquerda);
            }

            if(arvoreAtual.direita != null){
                fila.add(arvoreAtual.direita);
            }
        }
        return false;

    }

}
