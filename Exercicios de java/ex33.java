import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //5. Leia dois vetores reais A (de tamanho 4) e B (de tamanho 7). Construa um 3° vetor que seja a junção de A e B (colocar os elementos de A seguidos dos elementos de B).
    Scanner scanner = new Scanner(System.in);
        
        int tamanhoVetorA = 4;
        int tamanhoVetorB = 7;
        int tamanhoVetorC = tamanhoVetorA + tamanhoVetorB;
        
        double[] vetorA = new double[tamanhoVetorA];
        double[] vetorB = new double[tamanhoVetorB];
        double[] vetorC = new double[tamanhoVetorC];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanhoVetorA; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextDouble();
        }
        
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanhoVetorB; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = scanner.nextDouble();
        }
        
        for (int i = 0; i < tamanhoVetorA; i++) {
            vetorC[i] = vetorA[i];
        }
        
        for (int i = 0; i < tamanhoVetorB; i++) {
            vetorC[tamanhoVetorA + i] = vetorB[i];
        }
        
        System.out.println("Elementos do vetor C (junção de A e B):");
        for (int i = 0; i < tamanhoVetorC; i++) {
            System.out.print(vetorC[i] + " ");
        }
  }
}