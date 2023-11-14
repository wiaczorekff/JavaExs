import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     //exercicio 1 - faça um algoritmo que leia um número inteiro. se o numero for maior que 20 calcular e imprimir a metade dele.
    
        Scanner numero1 = new Scanner(System.in);
        
        System.out.println("digite um numero ");
        int numero = numero1.nextInt();
        
        if(numero > 20){
            System.out.println(numero/2);
        }
  }
}