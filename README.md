# Java 11 Features Showcase

This module demonstrates the main features introduced in Java 11 (LTS).

The goal is to present simple, clear and practical examples of how the language evolved compared to Java 8.

---

## 🚀 Main Features Demonstrated

### 1️⃣ var in lambda parameters
Allows type inference in lambda expression parameters as well.

```java
names.forEach((var name) -> System.out.println(name));
```

---

### 2️⃣ New String methods

- `isBlank()`
- `strip()`
- `lines()`
- `repeat()`

```java
String text = "  Java 11  ";
System.out.println(text.strip());
System.out.println("=".repeat(10));
```

---

### 3️⃣ Optional.isEmpty()

A more expressive way to check for an empty value.

```java
Optional<String> name = Optional.empty();

if (name.isEmpty()) {
    System.out.println("Empty Optional");
}
```

---

### 4️⃣ Files.readString() and Files.writeString()

Simplified reading and writing of text files.

```java
Path path = Path.of("arquivo.txt");
Files.writeString(path, "Hello Java 11");
String content = Files.readString(path);
```

---

### 5️⃣ New HttpClient API

Replaces the old `HttpURLConnection`.

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

## 📌 Requirements

- Java 11+
- Maven or Gradle (optional)

---

## 🎯 Goal

This project serves as:

- A refresher for developers coming from Java 8
- A base for technical interview preparation
- A quick reference for the improvements in the Java 11 LTS
