import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class CadastroIMCTest {
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;
    private InputStream originalIn;
    private ArrayList<Object> pessoas;

    @Test
    public void testCalculoIMC() {
        Pessoa pessoa = new Pessoa("João", "joao@example.com", "123456789", 30, 75.0, 1.75);
        double imcCalculado = pessoa.calcularIMC();
        assertEquals(24.49, imcCalculado, 0.01); // O IMC deve ser aproximadamente 24.49
    }

    @Test
    public void testVerificarAlertaPessoaMagreza() {
        Pessoa pessoaNormal = new Pessoa("Maria", "maria@example.com", "987654321", 25, 50.0, 1.70);
        String alertaNormal = pessoaNormal.classificarIMC();
        assertEquals("Magreza", alertaNormal);
    }
    @Test
    public void testVerificarAlertaPessoaNormal() {
        Pessoa pessoaNormal = new Pessoa("Maria", "maria@example.com", "987654321", 25, 70.0, 1.70);
        String alertaNormal = pessoaNormal.classificarIMC();
        assertEquals("Normal", alertaNormal);
    }
    @Test
    public void testVerificarAlertaPessoaSobrepeso() {
        Pessoa pessoaNormal = new Pessoa("Maria", "maria@example.com", "987654321", 25, 80.0, 1.70);
        String alertaNormal = pessoaNormal.classificarIMC();
        assertEquals("Sobrepeso", alertaNormal);

    }
    @Test
    public void testVerificarAlertaPessoaObesidadeGrauI() {
        Pessoa pessoaObesa = new Pessoa("Carlos", "carlos@example.com", "111222333", 40, 100.0, 1.75);
        String alertaObesa = pessoaObesa.classificarIMC();
        assertEquals("Obesidade grau I", alertaObesa);
    }
    @Test
    public void testVerificarAlertaPessoaObesidadeGrauII() {
        Pessoa pessoaObesa = new Pessoa("Carlos", "carlos@example.com", "111222333", 40, 110.0, 1.75);
        String alertaObesa = pessoaObesa.classificarIMC();
        assertEquals("Obesidade grau II", alertaObesa);
    }
    @Test
    public void testVerificarAlertaPessoaObesidadeGrauIII() {
        Pessoa pessoaObesa = new Pessoa("Carlos", "carlos@example.com", "111222333", 40, 140.0, 1.75);
        String alertaObesa = pessoaObesa.classificarIMC();
        assertEquals("Obesidade grau III", alertaObesa);
    }
    @Before
    public void setUp() {
        pessoas = new ArrayList<>();
    }

    @Test
    public void testAdicionarPessoa() {
        Pessoa pessoa = new Pessoa("João", "joao@example.com", "123456789", 30, 75.0, 1.75);
        pessoas.add(pessoa);

        assertEquals(1, pessoas.size());
        assertTrue(pessoas.contains(pessoa));
    }
    @Test
    public void testTamanhoDaLista() {
        Pessoa pessoa1 = new Pessoa("João", "joao@example.com", "123456789", 30, 75.0, 1.75);
        Pessoa pessoa2 = new Pessoa("Maria", "maria@example.com", "987654321", 25, 50.0, 1.70);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        assertEquals(2, pessoas.size());
    }

}
