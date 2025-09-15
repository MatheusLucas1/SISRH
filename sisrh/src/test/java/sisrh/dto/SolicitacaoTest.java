package sisrh.dto;

import org.junit.jupiter.api.Test;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitacaoTest {

    @Test
    public void testConstrutorComArgumentos() {
        Date data = Date.valueOf("2025-09-15");
        Solicitacao s = new Solicitacao(1, data, "Teste", 2, "MAT123");

        assertEquals(1, s.getId());
        assertEquals(data, s.getData());
        assertEquals("Teste", s.getDescricao());
        assertEquals(2, s.getSituacao());
        assertEquals("MAT123", s.getMatricula());
    }

    @Test
    public void testSettersAndGetters() {
        Solicitacao s = new Solicitacao();
        Date data = Date.valueOf("2025-09-15");

        s.setId(10);
        s.setDescricao("Nova desc");
        s.setData(data);
        s.setSituacao(3);
        s.setMatricula("MAT456");

        assertEquals(10, s.getId());
        assertEquals("Nova desc", s.getDescricao());
        assertEquals(data, s.getData());
        assertEquals(3, s.getSituacao());
        assertEquals("MAT456", s.getMatricula());
    }

    @Test
    public void testValoresNulos() {
        Solicitacao s = new Solicitacao();
        s.setId(null);
        s.setDescricao(null);
        s.setData(null);
        s.setSituacao(null);
        s.setMatricula(null);

        assertNull(s.getId());
        assertNull(s.getDescricao());
        assertNull(s.getData());
        assertNull(s.getSituacao());
        assertNull(s.getMatricula());
    }
}
