//import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Servico extends Remote {
  Object executarTarefa (Parametro parametro) throws RemoteException;
}
