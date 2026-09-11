public class Pi implements Parametro {
  public Pi() {
  }
  
  public Object executar() {
    return new Double.value(Math.PI); // Retorna o valor de PI.
  }
}