import java.security.SecureRandom;
import java.util.Arrays;

public class Exercicio02 {
  // Exercício 02 - Gerar e escrever uma matriz bidimensional
  // de tamanho 9x7, com números aleatórios entre zero e cem.
  // Ao final, imprimir a média geral dos números da tabela.
  public static void main(String[] args) {
    SecureRandom random = new SecureRandom();
    int[][] lista_inteiros = new int[9][7];

    for (int i = 0; i < lista_inteiros.length; i++) {
      for (int j = 0; j < lista_inteiros[i].length; j++) {
        lista_inteiros[i][j] = random.nextInt(0, 100);
      }
    }
    System.out.println(Arrays.deepToString(lista_inteiros));
  }
}