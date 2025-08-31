# 📑 Sistema de Lista de Tarefas

Este projeto é composto por **frontend (Angular)** e **backend (Spring Boot Java)**. O objetivo é gerenciar tarefas, exibindo uma lista das tarefas adicionadas.

---

## 📂 Estrutura do Projeto

```
/backend    -> Projeto Java Spring Boot (API REST)
/frontend   -> Projeto Angular (interface web)
```

---

## 🚀 Como Executar

### 🔹 Backend (Java Spring Boot)

1.  Acesse a pasta do backend:
    ```bash
    cd backend
    ```
2.  Compile e rode o projeto:
    ```bash
    # Para Linux/macOS
    ./mvnw spring-boot:run
    
    # Para Windows
    mvnw spring-boot:run
    ```
3.  O backend será iniciado em `http://localhost:8080`.

### 🔹 Frontend (Angular)

1.  Acesse a pasta do frontend:
    ```bash
    cd frontend
    ```
2.  Instale as dependências:
    ```bash
    npm install
    ```
3.  Rode o servidor Angular:
    ```bash
    ng serve
    ```
4.  Acesse a aplicação no navegador em `http://localhost:4200`.

---

## 📌 Tecnologias Utilizadas

**Backend:**
* Java 21
* Spring Boot 3.x
* Maven
* H2 Database

**Frontend:**
* Angular 19
* Bootstrap 5
* TypeScript
