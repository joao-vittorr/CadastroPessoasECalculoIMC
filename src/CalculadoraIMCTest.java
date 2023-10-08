import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraIMCTest {

    @Test
    public void testCalcularIMC() {
        // Teste o cálculo do IMC para diferentes valores
        double imc1 = CalculadoraIMC.calcularIMC(70.5, 1.75);
        assertEquals(23.02, imc1, 0.01);

        double imc5 = CalculadoraIMC.calcularIMC(120.0, 1.70);
        assertEquals(41.52, imc5, 0.01);
    }

    @Test
    public void testClassificarIMCMagreza() {
        String classificacao1 = CalculadoraIMC.classificarIMC(18.4);
        assertEquals("Magreza", classificacao1);

        String classificacaoLimite1 = CalculadoraIMC.classificarIMC(12.5);
        assertEquals("Magreza", classificacaoLimite1);

    }
    @Test
    public void testClassificarIMCNOmal() {
        String classificacao2 = CalculadoraIMC.classificarIMC(18.5);
        assertEquals("Normal", classificacao2);

        String classificacaoLimite2 = CalculadoraIMC.classificarIMC(24.9);
        assertEquals("Normal", classificacaoLimite2);
    }
    @Test
    public void testClassificarIMCSobrepeso() {
        String classificacao3 = CalculadoraIMC.classificarIMC(25);
        assertEquals("Sobrepeso", classificacao3);

        String classificacaoLimite3 = CalculadoraIMC.classificarIMC(29.9);
        assertEquals("Sobrepeso", classificacaoLimite3);

    }
    @Test
    public void testClassificarIMCObesidadeGrauI() {
        String classificacao4 = CalculadoraIMC.classificarIMC(30);
        assertEquals("Obesidade grau I", classificacao4);

        String classificacaoLimite4 = CalculadoraIMC.classificarIMC(34.9);
        assertEquals("Obesidade grau I", classificacaoLimite4);
    }
    @Test
    public void testClassificarIMCObesidadeGrauII() {
        String classificacao5 = CalculadoraIMC.classificarIMC(35);
        assertEquals("Obesidade grau II", classificacao5);

        String classificacaoLimite5 = CalculadoraIMC.classificarIMC(39.9);
        assertEquals("Obesidade grau II", classificacaoLimite5);

    }
    @Test
    public void testClassificarIMCObesidadeGrauIII() {
        String classificacao6 = CalculadoraIMC.classificarIMC(40.0);
        assertEquals("Obesidade grau III", classificacao6);

        String classificacaoLimite6 = CalculadoraIMC.classificarIMC(70.0);
        assertEquals("Obesidade grau III", classificacaoLimite6);
    }
}
