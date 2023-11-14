import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
    //7 - O IMC (índice de Massa Corporal) é uma medida do grau de obesidade de uma pessoa. Faça um algoritmo que leia a altura e o peso de 20 pessoas. Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem obesidade.
    Scanner numeral = new Scanner(System.in);
        
        int totalPessoas = 20;
        int pessoasSemObesidade = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            System.out.print("Digite o peso (kg): ");
            double peso = numeral.nextDouble();
            
            System.out.print("Digite a altura (m): ");
            double altura = numeral.nextDouble();
            
            double imc = peso / (altura * altura);
            System.out.println("IMC da pessoa " + i + ": " + imc);
            
            if (imc >= 18.5 && imc <= 24.9) {
                pessoasSemObesidade++;
            }
        }
        
        System.out.println("Pessoas sem obesidade (IMC entre 18,5 e 24,9): " + pessoasSemObesidade);
  }
}