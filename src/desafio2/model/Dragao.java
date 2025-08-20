package desafio2.model;

public class Dragao extends Criatura{

  public Dragao() {
    super("Dragão", "Fogo", 30);
  }

  @Override
  public int calcularForcaTotal() {
    return getForcaBase() * 2;
  }
}
