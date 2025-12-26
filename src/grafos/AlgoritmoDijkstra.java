package grafos;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlgoritmoDijkstra {

    private int vertices[] [];

    public AlgoritmoDijkstra(final int numVertices){
        vertices = new int [numVertices] [numVertices];
    }

    private void criarAresta(final int noOrigem, final int noDestino, final int peso){

        if (peso>=1){
            vertices[noOrigem] [noDestino] = peso;
            vertices[noDestino] [noOrigem] = peso;
        }
        else{
            throw new InvalidParameterException("O peso do nó origem ["+noOrigem+"] para o nó destino ["+noDestino+"] não pode ser negativo!");
        }
    }

    public int getMaisProximo(final int listaCustos[], final Set<Integer> naoVisitados){

        int minDistancia = Integer.MAX_VALUE;
        int noProximo = 0;
        for (Integer i: naoVisitados) {
            if (listaCustos[i] < minDistancia){
                minDistancia = listaCustos[i];
                noProximo = i;
            }
        }
        return noProximo;
    }

    public List<Integer> getVizinhos(final int no){
        List<Integer> vizinhos = new ArrayList<Integer>();
        for (int i = 0; i < vizinhos.size(); i++) {
            if (vertices[no] [i] > 0){
                vizinhos.add(i);
            }
        }
        return vizinhos;
    }

    public int getCusto(final int noOrigem, final int noDestino) {
        return vertices[noOrigem] [noDestino];
    }

    public List<Integer> caminhoMinimo(final int noOrigem, final int noDestino){

        int custo[] = new int[vertices.length];
        int antecessor[] = new int[vertices.length];
        Set<Integer> naoVisitados = new HashSet();

        custo[noOrigem] = 0;

        for (int v = 0; v < vertices.length; v++) {
            if ( v!= noOrigem){
                custo[v] = Integer.MAX_VALUE;
            }
            antecessor[v] = -1;
            naoVisitados.add(v);
        }

        while (!naoVisitados.isEmpty()){
            int noMaisProximo = getMaisProximo(custo, naoVisitados);
            naoVisitados.remove(noMaisProximo);

            for(Integer vizinhos : getVizinhos(noMaisProximo)){
                int custoTotal = custo[noMaisProximo] + getCusto(noMaisProximo, vizinhos);
                if(custoTotal < custo[vizinhos]){
                    custo[vizinhos] = custoTotal;
                    antecessor[vizinhos] = noMaisProximo;
                }
            }
            if(noMaisProximo == noDestino){

            }
        }

        return null;
    }
}