import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //exercicio 4- ler 2 numeros(ponto flutuante) e apresenta-los em ordem decrescente. supor que não sejam iguais
        
        Scanner numeral = new Scanner(System.in);
        
        System.out.println("digite um número ");
        double numero1 = numeral.nextDouble();
        
        System.out.println("digite outro número ");
        double numero2 = numeral.nextDouble();
        
        if(numero1 > numero2){
            System.out.println("ordem 1 decrescente");
            System.out.println(numero1);
            System.out.println(numero2);
        }
        
        else{
            System.out.println("ordem 2 decrescente");
            System.out.println(numero2);
            System.out.println(numero1);
        }
  }
}