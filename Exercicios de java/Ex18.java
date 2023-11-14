import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //6 - Construir um algoritmo que leia um número inteiro e imprimir a sequência: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024... enquanto o valor for menor ou igual ao valor lido.
    
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numeroLido = scanner.nextInt();
        
        int expoente = 0;
        int valorAtual = 1;
        StringBuilder sequencia = new StringBuilder();

        while (valorAtual <= numeroLido) {
            sequencia.append(valorAtual);
            if (valorAtual * 2 <= numeroLido) {
                sequencia.append(", ");
            }
            valorAtual = (int) Math.pow(2, expoente);
            expoente++;
        }

        System.out.println("Sequência impressa: " + sequencia.toString());
  }
}