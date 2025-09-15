package sisrh.dto;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class EmpregadoTest {

    @Test
    public void testConstrutorComArgumentos() {
        Date admissao = new Date();
        Date desligamento = new Date();
        Empregado e = new Empregado("123", "João", admissao, desligamento, 4500.0);

        assertEquals("123", e.getMatricula());
        assertEquals("João", e.getNome());
        assertEquals(admissao, e.getAdmissao());
        assertEquals(desligamento, e.getDesligamento());
        assertEquals(4500.0, e.getSalario());
    }

    @Test
    public void testSettersAndGetters() {
        Empregado e = new Empregado();

        Date admissao = new Date();
        Date desligamento = new Date();

        e.setMatricula("456");
        e.setNome("Maria");
        e.setAdmissao(admissao);
        e.setDesligamento(desligamento);
        e.setSalario(5000.0);

        assertEquals("456", e.getMatricula());
        assertEquals("Maria", e.getNome());
        assertEquals(admissao, e.getAdmissao());
        assertEquals(desligamento, e.getDesligamento());
        assertEquals(5000.0, e.getSalario());
    }

    @Test
    public void testValoresNulos() {
        Empregado e = new Empregado();

        e.setMatricula(null);
        e.setNome(null);
        e.setAdmissao(null);
        e.setDesligamento(null);
        e.setSalario(null);

        assertNull(e.getMatricula());
        assertNull(e.getNome());
        assertNull(e.getAdmissao());
        assertNull(e.getDesligamento());
        assertNull(e.getSalario());
    }
}
