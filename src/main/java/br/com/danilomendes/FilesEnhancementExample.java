package br.com.danilomendes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesEnhancementExample {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("arquivo.txt");

        Files.writeString(path, "Hello Java 11");
        String conteudo = Files.readString(path);

        System.out.println(conteudo);
    }

}
