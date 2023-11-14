import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //12 - Ler um número inteiro e imprimir na tela a sequência de números que vai do número 1 até o número lido. Exemplo: Digite um número: 8 Sequencia: 1 2 3 4 5 6 7 8
     Scanner numeral = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = numeral.nextInt();
        
        System.out.print("Sequência: ");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
  }
}