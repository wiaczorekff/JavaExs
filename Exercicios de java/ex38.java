import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
   String nome = "Felipe";
   String tipoConta = "conta corrente";
   double saldo = 5000.00;
   int opcao = 0;
   
        System.out.println("*******************");
        System.out.println();
        System.out.println("cliente: " + nome);
        System.out.println("tipo de conta: " + tipoConta);
        System.out.println("saldo atual R$: " + saldo);
        System.out.println();
        System.out.println("********************");
        
        
        String menu = "*** Digite sua opção ***" + 
                "1 - consultar saldo" + 
                "2 - transferir" + 
                "3- receber valor" + 
                "4 - sair";
        
       Scanner dados = new Scanner(System.in);
       
       while (opcao != 4){
           System.out.println(menu);
           opcao = dados.nextInt();
           
           if(opcao == 1){
               System.out.println(saldo);
           }
           else if(opcao == 2){
               System.out.println("qual valor deseja transferir: ");
               double valor = dados.nextDouble();
               if(valor > saldo){
                   System.out.println("Saldo insuficiente");
               }
               else{
                   saldo -= valor;
                   System.out.println("saldo atualizado " + saldo);
               }
           }
               else if(opcao == 3){
                       System.out.println("voce recebeu valor ");
                       double valor = dados.nextDouble();
                       saldo += valor;
                       System.out.println("novo saldo " + saldo);
                       }
               else if(opcao == 4){
                   System.out.println("sair");
                   
               }
           }
           
       }
}
