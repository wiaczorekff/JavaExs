import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    //exercicio 6- faça um algoritimo que receba a idade de uma pessoa e mostre se ela é maior de idade.
        
        Scanner numeral = new Scanner(System.in);
        
        System.out.println("digite sua idade ");
        int idade = numeral.nextInt();
        
        if(idade >=18){
            System.out.println("você é maior de idade ");
        
    }
        else{
            System.out.println("você é menor de idade");
        }
}