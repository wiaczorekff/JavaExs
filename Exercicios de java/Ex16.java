import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //– Faça um algoritmo que leia dez números inteiros e imprima o menor número da lista. 
  Scanner numeral = new Scanner(System.in);

        int menorNumero = Integer.MAX_VALUE; // Inicializa com um valor muito grande

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = numeral.nextInt();

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("O menor número é: " + menorNumero);

    
  }
}