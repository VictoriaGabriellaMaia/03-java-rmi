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

> Observação: `rmic` foi removido em versões modernas do Java, então não use `rmic Servidor`.
> O objeto remoto precisa ser exportado com `UnicastRemoteObject`.
