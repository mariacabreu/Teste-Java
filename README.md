# Plano de Testes

### Soma

| ID  | Operação                    | Entrada      | Resultado Esperado | Resultado Obtido | Status     |
|-----|-----------------------------|--------------|--------------------|------------------|------------|
| T01 | Soma de positivos           | 2 + 3        | 5.0                | 5.0              | ✅ Passou  |
| T02 | Soma com zero               | 3 + 0        | 3.0                | 3.0              | ✅ Passou  |
| T03 | Soma de negativos           | -2 + (-3)    | -5.0               | -5.0             | ✅ Passou  |
| T04 | Soma de negativo e positivo | -2 + 3       | 1.0                | 1.0              | ✅ Passou  |
| T05 | Soma de decimais            | 2.5 + 3.0    | 5.5                | 5.5              | ✅ Passou  |
| T06 | Soma de números grandes     | 1bi + 1bi    | 2000000000.0       | 2000000000.0     | ✅ Passou  |

### Subtração

| ID  | Operação                        | Entrada      | Resultado Esperado | Resultado Obtido | Status     |
|-----|---------------------------------|--------------|--------------------|------------------|------------|
| T07 | Subtração de positivos          | 5 - 2        | 3.0                | 3.0              | ✅ Passou  |
| T08 | Subtração com zero              | 5 - 0        | 5.0                | 5.0              | ✅ Passou  |
| T09 | Subtração com resultado negativo| 2 - 5        | -3.0               | -3.0             | ✅ Passou  |
| T10 | Subtração de negativos          | -3 - (-2)    | -1.0               | -1.0             | ✅ Passou  |
| T11 | Subtração de decimais           | 2.5 - 2.0    | 0.5                | 0.5              | ✅ Passou  |
| T12 | Subtração de números grandes    | 1bi - 1bi    | 0.0                | 0.0              | ✅ Passou  |

### Multiplicação

| ID  | Operação                          | Entrada        | Resultado Esperado  | Resultado Obtido  | Status     |
|-----|-----------------------------------|----------------|---------------------|-------------------|------------|
| T13 | Multiplicação de positivos        | 4 * 3          | 12.0                | 12.0              | ✅ Passou  |
| T14 | Multiplicação por zero            | 5 * 0          | 0.0                 | 0.0               | ✅ Passou  |
| T15 | Multiplicação por um              | 7 * 1          | 7.0                 | 7.0               | ✅ Passou  |
| T16 | Multiplicação de negativos        | -2 * (-3)      | 6.0                 | 6.0               | ✅ Passou  |
| T17 | Multiplicação negativo e positivo | -2 * 3         | -6.0                | -6.0              | ✅ Passou  |
| T18 | Multiplicação de decimais         | 2.5 * 2        | 5.0                 | 5.0               | ✅ Passou  |
| T19 | Multiplicação de números grandes  | 999999 * 999999| 999998000001.0      | 999998000001.0    | ✅ Passou  |

### Divisão

| ID  | Operação                        | Entrada      | Resultado Esperado   | Resultado Obtido     | Status     |
|-----|---------------------------------|--------------|----------------------|----------------------|------------|
| T20 | Divisão de positivos            | 10 / 2       | 5.0                  | 5.0                  | ✅ Passou  |
| T21 | Divisão por zero                | 10 / 0       | ArithmeticException  | ArithmeticException  | ✅ Passou  |
| T22 | Divisão com resultado decimal   | 5 / 2        | 2.5                  | 2.5                  | ✅ Passou  |
| T23 | Divisão de negativos            | -6 / (-3)    | 2.0                  | 2.0                  | ✅ Passou  |
| T24 | Divisão negativo por positivo   | -6 / 2       | -3.0                 | -3.0                 | ✅ Passou  |
| T25 | Divisão de zero por número      | 0 / 5        | 0.0                  | 0.0                  | ✅ Passou  |
| T26 | Divisão por um                  | 8 / 1        | 8.0                  | 8.0                  | ✅ Passou  |
| T27 | Divisão de números grandes      | 1bi / 1bi    | 1.0                  | 1.0                  | ✅ Passou  |

---

## Resultado da Execução

![Testes passando](print-testes.png)

> 27 tests passed — todos os casos executados com sucesso.

---

## Como Executar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Aguarde o Maven sincronizar as dependências
4. Clique com o botão direito em `CalculadoraTest.java` → **Run**

---

## Tecnologias

- Java 26
- JUnit Jupiter 5.10.0
- Maven 3
- IntelliJ IDEA Community 2024.2.2
