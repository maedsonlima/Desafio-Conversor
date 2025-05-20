# 💱 Conversor de Moedas em Java

Um projeto simples em Java que consome uma API de câmbio para converter valores entre diferentes moedas.

## 📌 Funcionalidades

- Exibição de um menu interativo com opções de conversão.
- Entrada do valor desejado para conversão.
- Requisição em tempo real à API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas.
- Conversão de moedas como: 
  - Dólar (USD)
  - Peso Argentino (ARS)
  - Real (BRL)
  - Peso Colombiano (COP)

---

## 📂 Estrutura do Projeto

```
.
├── src/
│   ├── ApiRequisicao.java      # Classe responsável por fazer a requisição na API
│   ├── Calculadora.java        # Classe que realiza a conversão com base na resposta da API
│   ├── Menu.java               # Classe responsável por mostrar o menu ao usuário
│   ├── Moeda.java              # Classe base com atributos e getters/setters
│   ├── Principal.java          # Ponto de entrada do programa
│   └── RespostaApi.java        # Classe modelo para mapear os dados da resposta JSON
```

---

## ✅ Tecnologias Utilizadas

- Java 17+
- API pública da [ExchangeRate-API](https://www.exchangerate-api.com/)
- Biblioteca [Gson](https://github.com/google/gson) para parsing de JSON

---

## 🛠️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas-java.git
   ```

2. Compile os arquivos:
   ```bash
   javac *.java
   ```

3. Execute o programa:
   ```bash
   java Principal
   ```

---

## ✍️ Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

---

## 📃 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

---

## 📸 Demonstração

```
===========================
   CONVERSOR DE MOEDAS
===========================

Escolha a moeda para conversão:
1 - USD para ARS
2 - ARS para BRL
3 - USD para BRL
...

Digite o valor: 100
Resultado: 100 USD = 13.500 ARS
```

---

Desenvolvido com 💙 por [Seu Nome]
