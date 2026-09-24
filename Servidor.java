import java.rmi.Naming;

public class Servidor {

    public static void main(String[] args) {

        try {
            // Cria o objeto que representa o serviço remoto.
            Servico servico = new Servico();

            // Registra o serviço no RMI Registry com esse nome.
            Naming.rebind("CalculadoraRemota", servico);

            System.out.println("Servidor da calculadora operando!");

        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
