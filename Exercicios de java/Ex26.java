import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //14 – Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:– A média aritmética das duas notas de cada aluno;– A mensagem da tabela a seguir de acordo com a média calculada:– O total de alunos aprovados;– O total de alunos de exame;– O total de alunos reprovados;– A média da classe; MÉDIA ARITMÉTICA MENSAGEM ATÉ 3 REPROVADO; Acima de 3 e Menor que 7 EXAME; Maior ou igual a 7 APROVADO
     Scanner cNotas = new Scanner(System.in);
        
        int totalAlunos = 6;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somaMedias = 0.0;
        
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Notas do aluno " + i + ":");
            
            System.out.print("Primeira nota: ");
            double nota1 = cNotas.nextDouble();
            
            System.out.print("Segunda nota: ");
            double nota2 = cNotas.nextDouble();
            
            double media = (nota1 + nota2) / 2;
            somaMedias += media;
            
            System.out.println("Média do aluno " + i + ": " + media);
            
            if (media < 3) {
                System.out.println("Mensagem: REPROVADO");
                reprovados++;
            } else if (media >= 3 && media < 7) {
                System.out.println("Mensagem: EXAME");
                exame++;
            } else {
                System.out.println("Mensagem: APROVADO");
                aprovados++;
            }
            
            System.out.println();
        }
        
        double mediaClasse = somaMedias / totalAlunos;
        
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exame);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);
  }
}