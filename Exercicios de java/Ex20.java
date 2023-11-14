import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   //
         Scanner scanner = new Scanner(System.in);
        
        int totalEleitores = 50;
        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;
        
        for (int i = 1; i <= totalEleitores; i++) {
            System.out.print("Eleitor " + i + ", digite o código do seu voto: ");
            int voto = scanner.nextInt();
            
            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Opção inválida. Voto não contabilizado.");
            }
        }
        
        int totalVotosComputados = totalEleitores - votosBrancos;
        double percentualVotosNulos = (votosNulos * 100.0) / totalVotosComputados;
        double percentualVotosBrancos = (votosBrancos * 100.0) / totalVotosComputados;
        
        System.out.println("Total de votos para cada candidato:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i] + " votos");
        }
        
        System.out.println("Total de votos nulos: " + votosNulos + " votos");
        System.out.println("Total de votos em branco: " + votosBrancos + " votos");
        System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualVotosBrancos + "%");
  }
}