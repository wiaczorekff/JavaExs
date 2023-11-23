import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }
}

class ListaDeTarefas {
    private List<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void listarTarefas() {
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            System.out.println((i + 1) + ". " + tarefa.getDescricao() +
                    (tarefa.isConcluida() ? " (Concluída)" : ""));
        }
    }

    public void marcarComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice);
            tarefa.marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída: " + tarefa.getDescricao());
        } else {
            System.out.println("Índice inválido.");
        }
    }
}

public class GerenciamentoDeTarefas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        while (true) {
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricaoTarefa = scanner.nextLine();
                    Tarefa novaTarefa = new Tarefa(descricaoTarefa);
                    listaDeTarefas.adicionarTarefa(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    listaDeTarefas.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int indiceConcluir = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    listaDeTarefas.marcarComoConcluida(indiceConcluir - 1);
                    break;

                case 4:
                    System.out.println("Sistema encerrado.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
