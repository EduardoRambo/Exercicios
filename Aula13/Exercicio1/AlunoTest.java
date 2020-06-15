import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AlunoTest.
 *
 * @author  Eduardo Rambo
 * @version 1.0
 */
public class AlunoTest {
    
    Aluno aluno = new Aluno();
    
    public AlunoTest() {
        aluno.setNome("Eduardo");
        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setTotalDeAulas(100);
        aluno.setNumeroDePresencas(50);
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    
    @Before 
    public void setUp() {
        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setTotalDeAulas(100);
        aluno.setNumeroDePresencas(50);
        System.out.println("Passou");
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        System.out.println("passou no tearDown");
    }
    
    @Test
    public void testCalcularFrequencia() {
        System.out.println("Passou no calculo de frequencia");
        assertEquals(50.0, aluno.calcularFrequencia(),0.0);
    }
    
    @Test
    public void testCalcularMediaAritmetica() {
        System.out.println("Passou no calculo de frequencia");
        assertEquals(10.0, aluno.calcularMediaAritmetica(),0.0);
    }  
    
    @Test 
    public void testVerificarAprovacão() {
        aluno.setNota1(2);
        aluno.setNota2(3);
        assertEquals("Nota D - Reprovado",aluno.verificarAprovacão());
        
        aluno.setNota1(6);
        aluno.setNota2(7);
        assertEquals("Nota C - Aprovado",aluno.verificarAprovacão());
        
        aluno.setNota1(7);
        aluno.setNota2(7);
        assertEquals("Nota B - Aprovado",aluno.verificarAprovacão());

        aluno.setNota1(10);
        aluno.setNota2(10);
        assertEquals("Nota A - Aprovado",aluno.verificarAprovacão());

    }
    
    @Test
    public void testVerificarAprovacãoComFrequencia() {
        aluno.setTotalDeAulas(100);
        aluno.setNumeroDePresencas(100);
        aluno.setNota1(2);
        aluno.setNota2(3);
        assertEquals("Nota D - Reprovado",aluno.verificarAprovacãoComFrequencia());
    
        aluno.setTotalDeAulas(100);
        aluno.setNumeroDePresencas(2);
        aluno.setNota1(2);
        aluno.setNota2(3);
        assertEquals("alo alo",aluno.verificarAprovacãoComFrequencia());
    
    }
}