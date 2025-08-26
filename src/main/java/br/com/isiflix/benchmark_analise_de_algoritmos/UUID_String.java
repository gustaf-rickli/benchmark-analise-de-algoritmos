package br.com.isiflix.benchmark_analise_de_algoritmos;

public class UUID_String {

    private String uuid_str;

    public UUID_String(String uuid_str) {
        this.uuid_str = uuid_str;
    }

    public String getUUIdStr() {
        return uuid_str;
    }

    public String getUUIdNumber() {
        return uuid_str.split("=")[0];
    }

}
