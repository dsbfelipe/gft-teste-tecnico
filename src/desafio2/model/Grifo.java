package desafio2.model;

public class Grifo extends Criatura {
  public Grifo() {
    super("Grifo", "Vento", 20);
  }

  @Override
  public int calcularForcaTotal() {
    return getForcaBase() * 2;
  }
}
