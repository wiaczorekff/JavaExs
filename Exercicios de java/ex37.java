
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        String produto = "teclado mecânico";
        int quantidade = 50;
        int opcao = 0;
        Scanner gerenciamento = new Scanner(System.in);
        
        System.out.println("nome do produto: " + produto);
        System.out.println("quantidade em estoque: " + quantidade);
        
        String menu = "menu de opções: \n" + "1- consultar quantidade em estoque\n" + "2- Adicionar produtos ao estoque\n" + "3- retirar produtos do estoque" + "4- sair\n" + "escolha uma opção: ";
        
       boolean sair = false;

while (!sair) {
    System.out.println(menu);
    opcao = gerenciamento.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Quantidade em Estoque: " + quantidade);
            break;
        case 2:
            System.out.print("Digite a quantidade a ser adicionada: ");
            int quantidadeAdicionar = gerenciamento.nextInt();
            quantidade += quantidadeAdicionar;
            System.out.println("Produto adicionado ao estoque.");
            break;
        case 3:
            System.out.print("Digite a quantidade a ser retirada: ");
            int quantidadeRetirar = gerenciamento.nextInt();
            if (quantidadeRetirar <= quantidade) {
                quantidade -= quantidadeRetirar;
                System.out.println("Produto retirado do estoque.");
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
            break;
        case 4:
            sair = true;
            System.out.println("Saindo do programa. Até logo!");
            break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
    }
}

  }
}