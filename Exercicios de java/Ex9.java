import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   /* exercicio 1 - obtenha um número digitado pelo usuario e repita a operação de multiplicar ele por 3 (imprimindo um novo valor)até que ele seja maior do que 100.*/
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite um número ");
        int multiplo = entrada.nextInt();
        
       while(multiplo < 100){
           System.out.println(multiplo *= 3);
       }
  }
}