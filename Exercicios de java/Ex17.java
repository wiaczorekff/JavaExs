class Main {
  public static void main(String[] args) {
    int numero = 5;
        
        System.out.println("Tabuado do " + numero);
        
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
  }
}