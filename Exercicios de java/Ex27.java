import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //15 - Faça um algoritmo que receba a idade e a altura de 20 pessoas, calcule e mostre a média das alturas daquelas com mais de 50 anos. 
     Scanner scanner = new Scanner(System.in);
        
        int totalPessoas = 20;
        int pessoasMaisDe50 = 0;
        double somaAlturasMaisDe50 = 0.0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Dados da pessoa " + i + ":");
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            
            if (idade > 50) {
                pessoasMaisDe50++;
                somaAlturasMaisDe50 += altura;
            }
        }
        
        double mediaAlturasMaisDe50 = pessoasMaisDe50 > 0 ? somaAlturasMaisDe50 / pessoasMaisDe50 : 0.0;
        
        System.out.println("Média das alturas das pessoas com mais de 50 anos: " + mediaAlturasMaisDe50 + " m");
  }
}