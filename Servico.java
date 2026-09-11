import java.rmi.RemoteException;

public class Servico implements ServicoInterface {
  public Servico () throws RemoteException {
    super ();
  }

  public Object executarTarefa (Parametro parametro) throws RemoteException {
    return 2 * (Double) parametro.executar();
  }
}
