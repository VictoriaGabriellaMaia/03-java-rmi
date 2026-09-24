import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servico extends UnicastRemoteObject implements ServicoInterface {

    public Servico() throws RemoteException {
        super();
    }

    public double somar(double numero1, double numero2) throws RemoteException {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) throws RemoteException {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) throws RemoteException {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) throws RemoteException {
        return numero1 / numero2;
    }
}
