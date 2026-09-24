import java.rmi.Naming;

public class Cliente {

    public static void main(String[] args) {

        try {
            // Aqui eu procuro o serviço da calculadora que foi registrado no RMI Registry.
            ServicoInterface servico =
                    (ServicoInterface) Naming.lookup("rmi://localhost/CalculadoraRemota");

            System.out.println("Cliente operando!");

            // Aqui eu faço uma chamada remota para cada operação da calculadora.
            double resultadoSoma = servico.somar(10, 5);
            double resultadoSubtracao = servico.subtrair(10, 5);
            double resultadoMultiplicacao = servico.multiplicar(10, 5);
            double resultadoDivisao = servico.dividir(10, 5);

            // Aqui eu mostro os resultados recebidos do servidor.
            System.out.println("Resultado da soma: " + resultadoSoma);
            System.out.println("Resultado da subtração: " + resultadoSubtracao);
            System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
            System.out.println("Resultado da divisão: " + resultadoDivisao);

        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
