import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //exercicio 3- ler 2 valores inteiros e se forem iguais mostrar "numeros iguais" caso contrario, apresentar a diferença do maior pelo menor.
       
      Scanner numeral = new Scanner(System.in);
       
        System.out.println("digite um numero ");
        int numero1 = numeral.nextInt();
        
        System.out.println("digite outro numero ");
        int numero2 = numeral.nextInt();
        
        if(numero1 == numero2){
            System.out.println("são iguais ");
        }
        else if (numero1 > numero2){
            System.out.println("o numero "+numero1+" é maior");
        }
        else{
            System.out.println("o numero "+numero2+" é maior");
        }
  }
}