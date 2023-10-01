import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, String email, String telefone, int idade, double peso, double altura) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nEmail: " + email +
                "\nTelefone: " + telefone +
                "\nIdade: " + idade +
                "\nPeso: " + peso +
                "\nAltura: " + altura +
                "\nIMC: " + calcularIMC() +
                "\nClassificação IMC: " + classificarIMC();
    }
}

public class CadastroIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeUsuario = "admin";
        String senha = "senha123";

        System.out.println("Bem-vindo ao Sistema de Cadastro e IMC");
        System.out.print("Nome de Usuário: ");
        String usuarioAdm = scanner.nextLine();

        System.out.print("Senha: ");
        String senhaAdm = scanner.nextLine();

        if (usuarioAdm.equals(nomeUsuario) && senhaAdm.equals(senha)) {
            System.out.println("\nLogin bem-sucedido!");
            System.out.println("Agora você pode usar o sistema de cadastro e cálculo de IMC.");

            List<Pessoa> pessoas = new ArrayList<>(); // Lista para armazenar pessoas cadastradas

            while (true) { // Loop para exibir o menu
                System.out.println("\nMenu:");
                System.out.println("1. Cadastrar Pessoa");
                System.out.println("2. Listar Pessoas Cadastradas");
                System.out.println("3. Logout/Encerrar");
                System.out.print("Escolha uma opção: ");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        // Cadastro de Pessoa
                        System.out.print("Nome (obrigatório): ");
                        String nome = scanner.nextLine(); // Consumir a quebra de linha pendente
                        nome = scanner.nextLine();

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = scanner.nextLine();

                        System.out.print("Idade (obrigatório): ");
                        int idade = scanner.nextInt();

                        System.out.print("Peso (obrigatório): ");
                        double peso = scanner.nextDouble();

                        System.out.print("Altura (obrigatório, use a vírgula como separador decimal, EX: 1,60): ");
                        double altura = scanner.nextDouble();

                        Pessoa pessoa = new Pessoa(nome, email, telefone, idade, peso, altura);
                        pessoas.add(pessoa);

                        System.out.println("Pessoa cadastrada com sucesso!");
                        break;

                    case 2:
                        // Listar Pessoas Cadastradas
                        System.out.println("\nPessoas Cadastradas:");
                        for (Pessoa p : pessoas) {
                            System.out.println(p);
                        }
                        break;

                    case 3:
                        // Sair do programa
                        System.out.println("Logout realizado com Sucesso, programa encerrado!");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            }
        } else {
            System.out.println("Login falhou. Nome de usuário ou senha incorretos.");
        }
    }
}