package desafio2.model;

public class Fenix extends Criatura {
  public Fenix() {
    super("Fenix", "Renascimento", 50);
  }

  @Override
  public int calcularForcaTotal() {
    return getForcaBase() * 3;
  }
}
