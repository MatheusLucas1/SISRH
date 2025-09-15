package sisrh.dto;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmpregadosTest {

    @Test
    public void testListaEmpregadosInicialVazia() {
        Empregados empregados = new Empregados();
        assertNotNull(empregados.getEmpregados());
        assertTrue(empregados.getEmpregados().isEmpty());
    }

    @Test
    public void testAdicionarEmpregadoNaLista() {
        Empregados empregados = new Empregados();
        Empregado e = new Empregado("123", "João", null, null, 3000.0);

        empregados.getEmpregados().add(e);

        List<Empregado> lista = empregados.getEmpregados();
        assertEquals(1, lista.size());
        assertEquals("João", lista.get(0).getNome());
    }
}
