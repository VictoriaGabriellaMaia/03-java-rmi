import java.io.*;
import java.rmi.*;
import java.rmi.server.*;

public class Cliente {
  public static void main(String[] args) { 
    try {
       Servico servico = (Servico) Naming.lookup("ServiçoRemoto");
       
       System.out.println("Cliente operando!");

       // Parâmetro que será passado para o método remoto:
       Pi pi = new Pi();

       // Chamada do método remoto:
       Double dobroDePi = (Double) servico.executarTarefa(pi);

       System.out.println("Resposta do servidor - valor de 2 * PI: " + dobroDePi);
    } catch (Exception e) {
       System.err.println ("Erro no cliente: " + e.toString ()); 
       e.printStackTrace ();
    }
  }
}
