import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        salario *= (1 + percentual / 100);
    }
}

class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public double calcularSalarioTotal() {
        double salarioTotal = 0;
        for (Funcionario funcionario : funcionarios) {
            salarioTotal += funcionario.getSalario();
        }
        return salarioTotal;
    }
}

public class GerenciamentoFuncionarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Departamento> departamentos = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar Departamento");
            System.out.println("2. Adicionar Funcionário");
            System.out.println("3. Listar Funcionários por Departamento");
            System.out.println("4. Calcular Salário Total por Departamento");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do departamento: ");
                    String nomeDepartamento = scanner.nextLine();
                    Departamento novoDepartamento = new Departamento(nomeDepartamento);
                    departamentos.add(novoDepartamento);
                    System.out.println("Departamento adicionado com sucesso.");
                    break;

                case 2:
                    if (departamentos.isEmpty()) {
                        System.out.println("Crie um departamento primeiro.");
                        break;
                    }

                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("Digite o cargo do funcionário: ");
                    String cargoFuncionario = scanner.nextLine();
                    System.out.print("Digite o salário do funcionário: ");
                    double salarioFuncionario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.println("Escolha o departamento:");
                    for (int i = 0; i < departamentos.size(); i++) {
                        System.out.println((i + 1) + ". " + departamentos.get(i).getNome());
                    }

                    int escolhaDepartamento = scanner.nextInt();
                    Departamento departamentoSelecionado = departamentos.get(escolhaDepartamento - 1);

                    Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cargoFuncionario, salarioFuncionario);
                    departamentoSelecionado.adicionarFuncionario(novoFuncionario);

                    System.out.println("Funcionário adicionado ao departamento com sucesso.");
                    break;

                case 3:
                    if (departamentos.isEmpty()) {
                        System.out.println("Crie um departamento primeiro.");
                        break;
                    }

                    System.out.println("Escolha o departamento:");
                    for (int i = 0; i < departamentos.size(); i++) {
                        System.out.println((i + 1) + ". " + departamentos.get(i).getNome());
                    }

                    int escolhaDepartamentoLista = scanner.nextInt();
                    Departamento departamentoLista = departamentos.get(escolhaDepartamentoLista - 1);

                    System.out.println("Funcionários do departamento " + departamentoLista.getNome() + ":");
                    List<Funcionario> funcionariosLista = departamentoLista.getFuncionarios();
                    for (int i = 0; i < funcionariosLista.size(); i++) {
                        Funcionario funcionario = funcionariosLista.get(i);
                        System.out.println("Nome: " + funcionario.getNome());
                        System.out.println("Cargo: " + funcionario.getCargo());
                        System.out.println("Salário: " + funcionario.getSalario());
                        System.out.println("---------------");
                    }
                    break;

                case 4:
                    if (departamentos.isEmpty()) {
                        System.out.println("Crie um departamento primeiro.");
                        break;
                    }

                    System.out.println("Escolha o departamento:");
                    for (int i = 0; i < departamentos.size(); i++) {
                        System.out.println((i + 1) + ". " + departamentos.get(i).getNome());
                    }

                    int escolhaDepartamentoSalario = scanner.nextInt();
                    Departamento departamentoSalario = departamentos.get(escolhaDepartamentoSalario - 1);

                    double salarioTotal = departamentoSalario.calcularSalarioTotal();
                    System.out.println("Salário total do departamento " + departamentoSalario.getNome() + ": " + salarioTotal);
                    break;

                case 5:
                    System.out.println("Sistema encerrado.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
