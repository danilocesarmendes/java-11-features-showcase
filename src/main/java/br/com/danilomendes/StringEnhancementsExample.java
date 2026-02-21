package br.com.danilomendes;

public class StringEnhancementsExample {

    public static void main(String[] args) {

        String texto = "  Java 11  ";

        System.out.println(texto.isBlank()); // false
        System.out.println(texto.strip());   // remove espaços Unicode
        System.out.println("Java\nSpring\nBoot".lines().count());
        System.out.println("=".repeat(10));
    }

}
