# Teste-Java
Criei calculadora básica, para aplicar testes automatizados pelo JUNIT


# Teste Calculadora — Plano de Testes JUnit
- **Ferramenta:** JUnit 5 + Maven + IntelliJ IDEA  

---

## Descrição

Projeto de testes automatizados para uma calculadora com as operações básicas:
- `somar(a, b)`
- `subtrair(a, b)`
- `multiplicar(a, b)`
- `dividir(a, b)`

---
---

## Plano de Testes

| ID  | Operação               | Entrada      | Resultado Esperado   | Resultado Obtido     | Status |
|-----|------------------------|--------------|----------------------|----------------------|--------|
| T01 | Soma                   | 2 + 3        | 5                    | 5.0                  | ✅ Passou |
| T02 | Subtração              | 5 - 2        | 3                    | 3.0                  | ✅ Passou |
| T03 | Multiplicação          | 4 * 3        | 12                   | 12.0                 | ✅ Passou |
| T04 | Divisão                | 10 / 2       | 5                    | 5.0                  | ✅ Passou |
| T05 | Divisão por zero       | 10 / 0       | Erro (ArithmeticException) | ArithmeticException | ✅ Passou |
| T06 | Números negativos      | -2 + 3       | 1                    | 1.0                  | ✅ Passou |
| T07 | Números decimais       | 2.5 * 2      | 5.0                  | 5.0                  | ✅ Passou |
| T08 | Subtração negativa     | 2 - 5        | -3                   | -3.0                 | ✅ Passou |
| T09 | Números grandes        | 999999 * 999999 | 999998000001.0    | 999998000001.0       | ✅ Passou |
| T10 | Zero em todas operações| 0 + 0        | 0                    | 0.0                  | ✅ Passou |

---

## Resultado da Execução

![Testes passando](print-testes.png)

> 7 tests passed — todos os casos executados com sucesso.

---

## Como Executar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Aguarde o Maven sincronizar as dependências
4. Clique com o botão direito em `CalculadoraTest.java` → **Run**

---

## Tecnologias

- Java 25
- JUnit Jupiter 5.10.0
- Maven 3
- IntelliJ IDEA
