import java.util.Random;

class Main {
  public static void main(String[] args) {
    //6. Sortear 1000 números inteiros e armazenar em um vetor. Percorrer o vetor e encontrar o menor elemento.
    int tamanhoVetor = 1000;
        int[] vetor = new int[tamanhoVetor];
        
        Random random = new Random();
        
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = random.nextInt(1000); // Sorteia um número inteiro aleatório entre 0 e 999
        }
        
        int menorElemento = vetor[0];
        
        for (int i = 1; i < tamanhoVetor; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
            }
        }
        
        System.out.println("Menor elemento encontrado: " + menorElemento);
  }
}