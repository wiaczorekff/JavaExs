import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   //3. Leia 8 elementos em um vetor inteiro A. Construa um outro vetor B, de mesma dimensão de A, com seus elementos sendo a multiplicação dos elementos de A por 3. Mostre os elementos de B
    Scanner scanner = new Scanner(System.in);
        
        int tamanhoVetor = 8;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do vetor A: ");
            vetorA[i] = scanner.nextInt();
            
            vetorB[i] = vetorA[i] * 3;
        }
        
        System.out.println("Elementos do vetor B (multiplicados por 3):");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetorB[i] + " ");
        }
  }
}