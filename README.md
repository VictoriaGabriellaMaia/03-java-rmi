# 03-java-rmi

## Ordem de comandos:

## Compilação:
javac *.java

rmic ComputeEngine

No Servidor:
start /min rmiregistry //O start coloca os processos em background.
start java ComputeEngine

No Cliente:
start java Pi
