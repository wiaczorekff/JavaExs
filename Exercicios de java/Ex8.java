class Main {
  public static void main(String[] args) {
    //exercicio 8 - faça um algoritimo que verifique a validade de uma senha fornecida pelo usuário. Sabendo que a senha é R10p5, imprimir mensagem de "acesso concedido" ou "acesso negado".(para comparar duas strings utilize a função equals)
    
    Scanner letrado = new Scanner(System.in);
    
    System.out.print("Informe a senha ");
    String senha = letrado.next();
    
    if(senha.equals ("R10p5")){
        System.out.println("acesso concedido");
    }
    else{
        System.out.println("acesso negado");
    }
    
    
}
  }
}