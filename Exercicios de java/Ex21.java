import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //9 – Faça um algoritmo que leia duas notas de 5 alunos, Calcular a média aritmética de cada aluno e calcular a média da classe. A entrada de cada nota deve ser validada! Ou seja, o programa somente avança se a entrada de nota estiver entre 0 e 10. Caso contrário, solicita novamente! Utilize o do..while para validar as notas!!
     Scanner numeral = new Scanner(System.in);
        
        int totalAlunos = 5;
        double[] mediasAlunos = new double[totalAlunos];
        double somaMedias = 0.0;
        
        for (int i = 0; i < totalAlunos; i++) {
            double nota1, nota2;
            
            do {
                System.out.print("Digite a primeira nota do aluno " + (i + 1) + ": ");
                nota1 = numeral.nextDouble();
            } while (nota1 < 0 || nota1 > 10);
            
            do {
                System.out.print("Digite a segunda nota do aluno " + (i + 1) + ": ");
                nota2 = numeral.nextDouble();
            } while (nota2 < 0 || nota2 > 10);
            
            mediasAlunos[i] = (nota1 + nota2) / 2;
            somaMedias += mediasAlunos[i];
        }
        
        System.out.println("Médias dos alunos:");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + mediasAlunos[i]);
        }
        
        double mediaClasse = somaMedias / totalAlunos;
        System.out.println("Média da classe: " + mediaClasse);
  }
}