import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //1. Leia 10 valores inteiros e armazene-os em um Vetor. Em seguida, imprima todos os elementos.
    Scanner scanner = new Scanner(System.in);
        
        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }
    
  }
}