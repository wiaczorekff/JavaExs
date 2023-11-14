import java.util.Scanner;
class Main {
  public static void main(final String[] args) {
    //leia um vetor de 20 posições e em seguida um valor x qualquer. seu programa deverá fazer uma busca do valor x no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.

        final Scanner entrada = new Scanner(System.in);
        
        final int tamanhoVetor = 20;
        final int[] vetor = new int[tamanhoVetor];
        
        System.out.println("Digite os valores do vetor de 20 posições:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = entrada.nextInt();
        }
        
        System.out.print("Digite o valor a ser buscado (x): ");
        final int valorBusca = entrada.nextInt();
        
        boolean encontrado = false;
        int posicaoEncontrada = -1;
        
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] == valorBusca) {
                encontrado = true;
                posicaoEncontrada = i; 
            }
        }
    
        if (encontrado) {
            System.out.println("O valor " + valorBusca + " foi encontrado na posição " + posicaoEncontrada);
        } else {
            System.out.println("O valor " + valorBusca + " não foi encontrado no vetor.");
        }
      
    }
}

