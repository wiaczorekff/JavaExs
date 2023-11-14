import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //13 - Faça um algoritmo que receba a idade, a altura e o peso de 25 pessoas, calcule e mostre: – A quantidade de pessoas com idade superior a 50 anos;– A média das alturas das pessoas com idade entre 10 e 20 anos; – A percentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas;
     Scanner contas = new Scanner(System.in);
        
        int totalPessoas = 5;
        int pessoasAcima50 = 0;
        int pessoasEntre10e20 = 0;
        double somaAlturas = 0.0;
        int pessoasComPesoInferior40 = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            
            System.out.print("Idade: ");
            int idade = contas.nextInt();
            
            System.out.print("Altura (m): ");
            double altura = contas.nextDouble();
            
            System.out.print("Peso (kg): ");
            double peso = contas.nextDouble();
            
            if (idade > 50) {
                pessoasAcima50++;
            }
            
            if (idade >= 10 && idade <= 20) {
                pessoasEntre10e20++;
                somaAlturas += altura;
            }
            
            if (peso < 40) {
                pessoasComPesoInferior40++;
            }
        }
        
        double mediaAlturas = pessoasEntre10e20 > 0 ? somaAlturas / pessoasEntre10e20 : 0.0;
        double percentagemPesoInferior40 = (pessoasComPesoInferior40 * 100.0) / totalPessoas;
        
        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + pessoasAcima50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas);
        System.out.println("Percentagem de pessoas com peso inferior a 40 quilos: " + percentagemPesoInferior40 + "%");
    
  }
}