import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //16 – Faça um algoritmo que leia o nome de 10 frutas. Acumular as frutas em uma variável String. Após fazer a leitura e a acumulação, imprimir o conteúdo do acumulador.
     Scanner frutado = new Scanner(System.in);
        
        int totalFrutas = 10;
        String acumuladorFrutas = "";
        
        for (int i = 1; i <= totalFrutas; i++) {
            System.out.print("Digite o nome da fruta " + i + ": ");
            String fruta = frutado.nextLine();
            
            acumuladorFrutas += fruta + "\n";
        }
        
        System.out.println("Frutas acumuladas:");
        System.out.println(acumuladorFrutas);
  }
}