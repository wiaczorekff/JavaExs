class Main {
  public static void main(String[] args) {
    //11 – Faça um algoritmo que apresente na tela os quadrados dos números inteiros entre 15 e 100; O quadrado de 15 é 225; O quadrado de 16 é 256; O quadrado de 17 é 289
    for (int i = 15; i <= 100; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " é " + quadrado);
        }
  }
}