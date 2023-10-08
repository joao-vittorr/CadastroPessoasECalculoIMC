import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
                        System.out.print("\nNome (obrigatório): ");
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
                        Pessoa.adicionarPessoa(pessoa);

                        System.out.println("Pessoa cadastrada com sucesso!");
                        break;

                    case 2:
                        // Listar Pessoas Cadastradas
                        List<Pessoa> pessoasCadastradas = Pessoa.getPessoasCadastradas();
                        System.out.println("\nPessoas Cadastradas:");
                        for (Pessoa p : pessoasCadastradas) {
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
