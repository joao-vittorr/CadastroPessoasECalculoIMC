import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class PessoaTest {

    @Before
    public void setUp() {
        Pessoa.limparListaPessoas();
    }

    @Test
    public void testAdicionarPessoa() {
        Pessoa pessoa1 = new Pessoa("João", "joao@email.com", "123456789", 30, 70.5, 1.75);
        Pessoa.adicionarPessoa(pessoa1);

        List<Pessoa> pessoas = Pessoa.getPessoasCadastradas();
        assertEquals(1, pessoas.size());
        assertTrue(pessoas.contains(pessoa1));
    }
    @Test
    public void testAdicionarMultiPessoas() {
        Pessoa pessoa1 = new Pessoa("João", "joao@email.com", "123456789", 30, 70.5, 1.75);
        Pessoa.adicionarPessoa(pessoa1);

        List<Pessoa> pessoas = Pessoa.getPessoasCadastradas();
        assertEquals(1, pessoas.size());
        assertTrue(pessoas.contains(pessoa1));

        Pessoa pessoa2 = new Pessoa("Maria", "maria@email.com", "987654321", 25, 60.0, 1.60);
        Pessoa.adicionarPessoa(pessoa2);

        pessoas = Pessoa.getPessoasCadastradas();
        assertEquals(2, pessoas.size());
        assertTrue(pessoas.contains(pessoa1));
        assertTrue(pessoas.contains(pessoa2));
    }

    @Test
    public void testListarPessoas() {
        Pessoa pessoa1 = new Pessoa("João", "joao@email.com", "123456789", 30, 70.5, 1.75);
        Pessoa.adicionarPessoa(pessoa1);

        Pessoa pessoa2 = new Pessoa("Maria", "maria@email.com", "987654321", 25, 60.0, 1.60);
        Pessoa.adicionarPessoa(pessoa2);

        List<Pessoa> pessoas = Pessoa.getPessoasCadastradas();

        assertEquals(2, pessoas.size());
        assertTrue(pessoas.contains(pessoa1));
        assertTrue(pessoas.contains(pessoa2));
    }
}
