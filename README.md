# 03-java-rmi
Ordem de comandos:

Compila��o:
javac Task.java
javac Compute.java
javac ComputeEngine.java
javac Pi.java

rmic ComputeEngine

No Servidor:
start /min rmiregistry //O start coloca os processos em background.
start java ComputeEngine

No Cliente:
start java Pi
