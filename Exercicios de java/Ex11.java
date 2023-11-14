import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //declare um vetor de 10 posições e o preencha com os 10 primeiros numeros impares e o escreva
  
        Scanner numeral = new Scanner(System.in);
  
        int [] pacos = new int[9];
        for (int i =0; 1 < pacos.length; i++){
        System.out.println("digite o valor da posição " + i);
        int valor = numeral.nextInt();
        pacos[i] = valor;
        }
  }
}