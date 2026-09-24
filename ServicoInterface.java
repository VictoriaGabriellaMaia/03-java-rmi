import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoInterface extends Remote {

    double somar(double numero1, double numero2) throws RemoteException;

    double subtrair(double numero1, double numero2) throws RemoteException;

    double multiplicar(double numero1, double numero2) throws RemoteException;

    double dividir(double numero1, double numero2) throws RemoteException;
}
