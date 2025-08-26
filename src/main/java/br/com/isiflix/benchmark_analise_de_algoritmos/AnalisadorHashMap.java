package br.com.isiflix.benchmark_analise_de_algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class AnalisadorHashMap {

    //
    //
    //
    public static final int TAMANHO = 100000;

    public static void main(String[] args) {

        HashMap<String, Product> mapa = new HashMap<String, Product>();

        UUID_String uuid_Str = null;

        Product product = null;

        for (int i = 1; i <= TAMANHO; i++) {
            uuid_Str = new UUID_String(i + "=" + UUID.randomUUID().toString());

            product = new Product(uuid_Str.getUUIdStr(), "Product" + i, i * 10);
            mapa.put(uuid_Str.getUUIdNumber(), product);
        }

        String codigoAserEncontrado = Integer.toString(TAMANHO);

        long inicio, fim;

        inicio = System.currentTimeMillis();

        if (mapa.containsKey(1001)) {
            System.out.println("Produto encontrado: ");
            System.out.println(mapa.get(codigoAserEncontrado).toString());
        } else {
            System.out.println("Produto nao encontrado");
            System.out.println(mapa.get(codigoAserEncontrado));
        }

        fim = System.currentTimeMillis();

        System.out.println("Este algoritmo levou: " + (fim - inicio) + "ms");
    }

}
