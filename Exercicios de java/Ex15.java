import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   //Faça um algoritmo que leia 200 números inteiros e imprima quantos são pares e quantos são ímpares. 
  Scanner numeral = new Scanner(System.in);
        
        int numerosLidos = 0;
        int pares = 0;
        int impares = 0;
        
        while (numerosLidos < 200) {
            System.out.print("Digite um número inteiro: ");
            int numero = numeral.nextInt();
            
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            
            numerosLidos++;
        }
        
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    
    
  }
}