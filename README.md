# 03-java-rmi

## Ordem correta para executar:

### Compilação
```bash
javac *.java
```

### Registrar o serviço RMI
```bash
rmiregistry &
```

### Iniciar o servidor
```bash
java Servidor
```

### Executar o cliente
Em outro terminal:
```bash
java Cliente
```

## Exercício

1. Usando Java RMI, implemente uma calculadora remota.

## Solução do exercício

Foi implementada uma calculadora remota utilizando Java RMI.

A calculadora possui quatro operações:

- Soma;
- Subtração;
- Multiplicação;
- Divisão.

O `ServicoInterface` define os métodos que podem ser chamados remotamente. A classe `Servico` implementa esses métodos e funciona como o objeto remoto.

O `Servidor` cria o serviço e registra o objeto no RMI Registry com o nome `CalculadoraRemota`.

O `Cliente` localiza o serviço através do RMI Registry e realiza chamadas remotas para executar as operações da calculadora.

Também foi adicionada uma validação para impedir a divisão por zero.

### Operações realizadas pelo cliente

O cliente realiza as seguintes operações:

- `10 + 5 = 15`
- `10 - 5 = 5`
- `10 * 5 = 50`
- `10 / 5 = 2`
