import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //2. Leia 15 nomes de pessoas e armazene-os em um Vetor. Em seguida, mostre todos os nomes em sequência contrária
    Scanner scanner = new Scanner(System.in);
        
        int tamanhoVetor = 15;
        String[] vetorNomes = new String[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            vetorNomes[i] = scanner.nextLine();
        }
        
        System.out.println("Nomes em sequência contrária:");
        for (int i = tamanhoVetor - 1; i >= 0; i--) {
            System.out.println(vetorNomes[i]);
        }
        
  }
}