import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private String nome;
    private int idade;
    private List<Double> notas;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }
}

class Curso {
    private String nome;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Curso> cursos = new ArrayList<>();

        while (true) {
            System.out.println("1. Criar Curso");
            System.out.println("2. Adicionar Aluno");
            System.out.println("3. Calcular Média de Aluno");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do curso: ");
                    String nomeCurso = scanner.nextLine();
                    Curso curso = new Curso(nomeCurso);
                    cursos.add(curso);
                    System.out.println("Curso criado com sucesso.");
                    break;

                case 2:
                    if (cursos.isEmpty()) {
                        System.out.println("Crie um curso primeiro.");
                        break;
                    }

                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Digite a idade do aluno: ");
                    int idadeAluno = scanner.nextInt();

                    System.out.println("Escolha o curso:");
                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println((i + 1) + ". " + cursos.get(i).getNome());
                    }

                    int escolhaCurso = scanner.nextInt();
                    Curso cursoSelecionado = cursos.get(escolhaCurso - 1);

                    Aluno novoAluno = new Aluno(nomeAluno, idadeAluno);
                    cursoSelecionado.adicionarAluno(novoAluno);

                    System.out.println("Aluno adicionado ao curso com sucesso.");
                    break;

                case 3:
                    if (cursos.isEmpty()) {
                        System.out.println("Crie um curso primeiro.");
                        break;
                    }

                    System.out.println("Escolha o curso:");
                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println((i + 1) + ". " + cursos.get(i).getNome());
                    }

                    int escolhaCursoMedia = scanner.nextInt();
                    Curso cursoMedia = cursos.get(escolhaCursoMedia - 1);

                    System.out.println("Escolha o aluno:");
                    List<Aluno> alunosDoCurso = cursoMedia.getAlunos();
                    for (int i = 0; i < alunosDoCurso.size(); i++) {
                        System.out.println((i + 1) + ". " + alunosDoCurso.get(i).getNome());
                    }

                    int escolhaAluno = scanner.nextInt();
                    Aluno alunoMedia = alunosDoCurso.get(escolhaAluno - 1);

                    double media = alunoMedia.calcularMedia();
                    System.out.println("A média do aluno " + alunoMedia.getNome() + " é: " + media);
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
