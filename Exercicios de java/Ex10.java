import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner conta = new Scanner(System.in);
        //ler um numero inteiro n. escrever a soma de todos os numeros de 1 a n
        System.out.print("Digite um número inteiro: ");
        int n = conta.nextInt();
        
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        
        System.out.println("A soma dos números de 1 a " + n + " é: " + soma);
        
  }
}