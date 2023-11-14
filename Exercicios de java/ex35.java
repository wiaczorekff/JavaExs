import java.util.Random;

class Main {
  public static void main(String[] args) {
   //7.Criar um vetor para armazenar 10.000 números inteiros gerados de forma aleatória (entre 1 e 10). Após gerar o vetor, calcular a quantidade de vezes que cada número foi sorteada. O número 1 aparece 5 vezes O número 2 aparece 2 vezes
    int tamanhoVetor = 10000;
        int[] vetor = new int[tamanhoVetor];
        
        Random random = new Random();
        
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = random.nextInt(10) + 1; // Sorteia um número inteiro aleatório entre 1 e 10
        }
        
        int[] contagem = new int[10]; // Vetor para contar a frequência de cada número
        
        for (int i = 0; i < tamanhoVetor; i++) {
            int numero = vetor[i];
            contagem[numero - 1]++; // Incrementa a contagem para o número sorteado
        }
        
        for (int i = 0; i < contagem.length; i++) {
            System.out.println("O número " + (i + 1) + " aparece " + contagem[i] + " vezes");
  }
  }
}
