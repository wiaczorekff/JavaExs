import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    //exercicio 7- faça um algoritimo que leia a altura e sexo de uma pessoa, calcule e mostre seu peso ideal. usar as formulas a seguir para calcular o peso ideal: sexo masculino:(72,7 * altura)-58 ; sexo feminino:(62,1*altura)-44,7
        
        Scanner numeral = new Scanner(System.in);

        System.out.print("Informe a altura (em metros): ");
        double altura = numeral.nextDouble();

        System.out.print("Informe o sexo (M para masculino, F para feminino): ");
        char sexo = numeral.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

    }
  }
}