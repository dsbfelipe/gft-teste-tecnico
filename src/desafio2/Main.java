package desafio2;

import desafio2.model.Criatura;
import desafio2.model.Dragao;
import desafio2.model.Fenix;
import desafio2.model.Grifo;

public class Main {
  public static void main(String[] args) {
    Dragao dragao = new Dragao();
    Fenix fenix = new Fenix();
    Grifo grifo = new Grifo();

    Criatura[] criaturas = {dragao, fenix, grifo};
    Criatura criaturaMaisPoderosa = criaturas[0];

    for (Criatura criatura : criaturas) {
      if (criatura.calcularForcaTotal() > criaturaMaisPoderosa.calcularForcaTotal()) {
        criaturaMaisPoderosa = criatura;
      }
    }

    System.out.println("Criatura mais poderosa: " + criaturaMaisPoderosa.getNome() + " (Poder: " + criaturaMaisPoderosa.getPoder() + ", Força Total: " + criaturaMaisPoderosa.calcularForcaTotal() + ")");

  }
}
