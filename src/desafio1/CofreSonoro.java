package desafio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CofreSonoro {


  public static void main(String[] args) {
    ArrayList<String> senha = new ArrayList<String>(Arrays.asList("DO", "RE", "MI", "FA"));

    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira as 4 notas separadas por um espaço: ");
    String senhaInserida = scanner.nextLine();

    ArrayList<String> notasInseridas = new ArrayList<String>(Arrays.asList(senhaInserida.split(" ")));

    System.out.println((notasInseridas.equals(senha)) ? "Cofre aberto com sucesso!" : "Sequência incorreta.");
  }

}
