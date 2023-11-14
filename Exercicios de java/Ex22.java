class Main {
  public static void main(String[] args) {
    //10 – Faça um algoritmo que imprima a seguinte sequência: 100, 99, 98, 97, 96, ...1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i);
            if (i != 1) {
                System.out.print(", ");
            }
        }
    
  }
}