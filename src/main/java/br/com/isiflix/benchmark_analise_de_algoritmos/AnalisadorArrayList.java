package br.com.isiflix.benchmark_analise_de_algoritmos;

import java.util.ArrayList;
import java.util.UUID;

public class AnalisadorArrayList {

    //
    //
    //
    public static final int TAMANHO = 10000;

    public static void main(String[] args) {

        ArrayList<Product> lista = new ArrayList<Product>();

        String UUID_Str;

        for (int i = 1; i <= TAMANHO; i++) {

            UUID_Str = i + "=" + UUID.randomUUID().toString();

            lista.add( new Product(UUID_Str, "Product" + i, i * 10));
        }

        int codigoAserEncontrado = TAMANHO;

        long inicio, fim;

        inicio = System.currentTimeMillis();

        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            for (Product p: lista) {
                if (p.getId().contains(String.valueOf(codigoAserEncontrado))) {
                    break;
                }
            }
        }

        fim = System.currentTimeMillis();

        System.out.println("Este algoritmo levou: " + (fim - inicio) + "ms");
    }

}
