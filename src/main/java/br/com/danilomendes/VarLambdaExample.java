package br.com.danilomendes;


import java.util.List;

public class VarLambdaExample {

    public static void main(String[] args) {
        List<String> nomes = List.of("Danilo", "Maria", "João");

        nomes.forEach((var nome) -> {
            System.out.println(nome.toUpperCase());
        });
    }
}
