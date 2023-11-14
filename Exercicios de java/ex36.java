class Main {
  public static void main(String[] args) {
   int valorMaior;
   valorMaior = encontraMax(25, 40);
    System.out.println("o maior valor é " + valorMaior);
  }
   public static int encontraMax(int numero1, int numero2){
    
     if(numero1 > numero2){
         return(numero1);
     }
     else{
         return(numero2);
     }
    
    }
}

/*public class MetodoAsterisco {
    public static void main(String[] args) {
        System.out.println("Este é meu primeiro método em Java,");
        exibirAsterisco();
        System.out.println("Fiz uma chamada ao método exibirAsterisco(), fiz outra chamada.");
        exibirAsterisco();
    }

    public static void exibirAsterisco() {
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println(); // Adiciona uma quebra de linha após os asteriscos
    }
}*/
