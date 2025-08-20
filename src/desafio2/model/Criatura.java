package desafio2.model;

public abstract class Criatura {
  private String nome;
  private String poder;
  private int forcaBase;

  public Criatura(String nome, String poder, int forcaBase) {
    this.nome = nome;
    this.poder = poder;
    this.forcaBase = forcaBase;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "Criatura{" +
            "nome='" + nome + '\'' +
            ", poder='" + poder + '\'' +
            ", forcaBase=" + forcaBase +
            '}';
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPoder() {
    return poder;
  }

  public void setPoder(String poder) {
    this.poder = poder;
  }

  public int getForcaBase() {
    return forcaBase;
  }

  public void setForcaBase(int forcaBase) {
    this.forcaBase = forcaBase;
  }

  public abstract int calcularForcaTotal();
}
