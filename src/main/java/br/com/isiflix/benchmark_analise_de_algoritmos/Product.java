package br.com.isiflix.benchmark_analise_de_algoritmos;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {

    private String id;
    private String nome;
    private BigDecimal preco = new BigDecimal(0);

    public Product(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = new BigDecimal(preco);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
