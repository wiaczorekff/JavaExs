import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //exercicio 5 - a empresa X software concedeu um bonus de 20% do valor do salario a todos os funcionários com tempo de trabalho na empresa igual ou superior a 5 anos e de 10% aos demais funcionarios. faça algoritmos que leia o salário e a quantidade de anos de casa de um funcionário clacule e imprima o valor do bonus.
       
     Scanner numeral = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: ");
        double salario = numeral.nextDouble();

        System.out.print("Informe a quantidade de anos de casa do funcionário: ");
        int anosDeCasa = numeral.nextInt();

        double bonus;

        if (anosDeCasa >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.println("O valor do bônus é: " + bonus);
  }
}