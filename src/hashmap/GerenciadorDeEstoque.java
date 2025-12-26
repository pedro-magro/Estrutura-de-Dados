package hashmap;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeEstoque {

    private HashMap<String, Integer> listaEstoque;
    public GerenciadorDeEstoque(){
        this.listaEstoque = new HashMap<String, Integer>();
    }

    public String adicionarOuAtualizar(final String produto, final Integer quantidade){
        if(quantidade <=0){
            return"Quantidade inválida! Deve-se adicionar uma quantidade positiva";
        }
        if(listaEstoque.containsKey(produto)){
            listaEstoque.put(produto, listaEstoque.get(produto) + quantidade);
            return "Produto "+ produto+" atualizado com sucesso";
        }else {
            listaEstoque.put(produto, quantidade);
            return "produto adicionado ao estoque";
        }
    }

    public String removerProduto(final String produto) {
        if(listaEstoque.remove(produto) != null){
            return "Produto "+produto+" removido!";
        }
        else{
            return "Produto não encontrado no estoque";
        }
    }

    public void exibirTodosProdutos() {
        for(Map.Entry<String, Integer> entry: listaEstoque.entrySet()){
            System.out.println("Produto "+entry.getKey()+"Quantidade: "+entry.getValue());
        }
    }

    public void consultarProduto(final String produto){
        if (listaEstoque.containsKey(produto)){
            Integer qtdProduto = listaEstoque.get(produto);
            System.out.println("Produto :"+produto+" Quantidade: "+ qtdProduto);
        } else{
            System.out.println("Produto não encontrado no estoque");
        }
    }

    public static void main(String[] args) {

    }
}
