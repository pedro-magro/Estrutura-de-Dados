package hashset;

import javax.swing.*;
import java.util.HashSet;

public class GerenciadorDeNomes {

    private HashSet<String> hashNomes;

    public GerenciadorDeNomes(){
        this.hashNomes = new HashSet<String>();
    }

    public String adicionarNome(String nome){
        if(hashNomes.add(nome)){
            return "Nome adicionado na lista.Lista";
        }
        else {
            return "Nome duplicado! Impossível adiciona-lo na lista.";
        }
    }

    public boolean verficaNome(String nome){
        return hashNomes.contains(nome);
    }

    public String removeNome(String nome){
        if(hashNomes.remove(nome)){
            return "Nome removido da lista.Lista";
        }
        return "Impossivel Remover, nome não encontrado";
    }

    public void exibirTodosNomes(){
        if(hashNomes.isEmpty()){
            System.out.println("lista.Lista de nomes vazia");
        }
        else{
            for(String s: hashNomes){
                System.out.println("Nome: "+s);
            }
        }
    }

    public static void main(String[] args) {

        GerenciadorDeNomes gerenciadorDeNomes = new GerenciadorDeNomes();
        int opt = 5;
        do{
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "1- Adicionar nome\n"
                    +"2- Verificar nome\n"
                    +"3- Remover nomes\n"
                    +"4- Exibir todos os nomes\n"
                    +"5- Sair"
            ));
            switch (opt){
                case 1:{
                    System.out.println(gerenciadorDeNomes.adicionarNome(JOptionPane.showInputDialog("Digite um nome para adicionar")));
                    break;
                }
                case 2:{
                    System.out.println("Existe o nome" +gerenciadorDeNomes.verficaNome(JOptionPane.showInputDialog("Digite um nome para encontrar")));
                    break;
                }
                case 3:{
                    System.out.println((gerenciadorDeNomes.removeNome(JOptionPane.showInputDialog("Digite um nome para remover"))));
                    break;
                }
                case 4:{
                    gerenciadorDeNomes.exibirTodosNomes();
                    break;
                }
                case 5:{

                    break;
                }
                default:
                    System.out.println("Opção inválida. Tente de 1 a 5!");
            }
        }while(opt != 5);

    }
}
