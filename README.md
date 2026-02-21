# Java 11 Features Showcase

Este módulo demonstra as principais novidades introduzidas no Java 11 (LTS).

O objetivo é apresentar exemplos simples, claros e práticos das evoluções da linguagem em relação ao Java 8.

---

## 🚀 Principais Features Demonstradas

### 1️⃣ var em parâmetros de lambda
Permite inferência de tipo também em parâmetros de expressões lambda.

```java
nomes.forEach((var nome) -> System.out.println(nome));
```

---

### 2️⃣ Novos métodos da classe String

- `isBlank()`
- `strip()`
- `lines()`
- `repeat()`

```java
String texto = "  Java 11  ";
System.out.println(texto.strip());
System.out.println("=".repeat(10));
```

---

### 3️⃣ Optional.isEmpty()

Melhoria para leitura mais expressiva.

```java
Optional<String> nome = Optional.empty();

if (nome.isEmpty()) {
    System.out.println("Optional vazio");
}
```

---

### 4️⃣ Files.readString() e writeString()

Leitura e escrita simplificada de arquivos.

```java
Path path = Path.of("arquivo.txt");
Files.writeString(path, "Hello Java 11");
String conteudo = Files.readString(path);
```

---

### 5️⃣ Nova API HttpClient

Substitui a antiga HttpURLConnection.

```java
HttpClient client = HttpClient.newHttpClient();

HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("https://api.github.com"))
        .GET()
        .build();

HttpResponse<String> response =
        client.send(request, HttpResponse.BodyHandlers.ofString());
```

---

## 📌 Requisitos

- Java 11+
- Maven ou Gradle (opcional)

---

## 🎯 Objetivo

Este projeto serve como:

- Atualização para quem vem do Java 8
- Base para entrevistas técnicas
- Referência rápida das melhorias da LTS 11
