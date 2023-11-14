import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   //4. Leia dois vetores A e B inteiros, de mesma dimensão. Construa o vetor C, de mesma dimensão, cujo elementos de C é a subtração dos elementos de A por B. Mostre o vetor C.
    Scanner scanner = new Scanner(System.in);
        
        int tamanhoVetor = 5; // Você pode ajustar o tamanho dos vetores conforme necessário
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        
        System.out.println("Elementos do vetor C (subtração de A por B):");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetorC[i] + " ");
        }
        
  }
}