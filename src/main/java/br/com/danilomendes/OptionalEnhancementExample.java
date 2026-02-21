package br.com.danilomendes;

import java.util.Optional;

public class OptionalEnhancementExample {

    public static void main(String[] args) {

        Optional<String> nome = Optional.empty();

        if (nome.isEmpty()) {
            System.out.println("Optional vazio");
        }
    }

}
