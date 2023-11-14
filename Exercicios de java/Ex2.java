import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //exercicio 2- faça um algoritimo para ler um numero inteiro. verificar se está no intervalo entre 50 e 100. se pertencer escreva pertence senão não pertence.
        
        Scanner numeral = new Scanner(System.in);
        
        System.out.println("digite um número ");
        int numero3 = numeral.nextInt();
        
          if(numero3 >= 50 && numero3 <= 100){
            System.out.println("Pertence ao intervalo ");
        }
        else{
            System.out.println("não pertence ao intervalo");
        }   
  }
}