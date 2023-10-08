import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private double peso;
    private double altura;
    private double imc;
    private String classificacaoIMC;
    private static List<Pessoa> pessoas = new ArrayList<>();

    public Pessoa(String nome, String email, String telefone, int idade, double peso, double altura) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.imc = CalculadoraIMC.calcularIMC(peso, altura);
        this.classificacaoIMC = CalculadoraIMC.classificarIMC(imc);
    }

    public static void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public static List<Pessoa> getPessoasCadastradas() {
        return pessoas;
    }

    public static void limparListaPessoas() {
        pessoas.clear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public String getClassificacaoIMC() {
        return classificacaoIMC;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nEmail: " + email +
                "\nTelefone: " + telefone +
                "\nIdade: " + idade +
                "\nPeso: " + peso +
                "\nAltura: " + altura +
                "\nIMC: " + imc +
                "\nClassificação IMC: " + classificacaoIMC;
    }
}
