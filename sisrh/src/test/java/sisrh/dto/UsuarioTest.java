package sisrh.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testConstrutorComArgumentos() {
        Usuario u = new Usuario("Carlos", 1, "MAT789", "senha123");

        assertEquals("Carlos", u.getNome());
        assertEquals(1, u.getPerfil());
        assertEquals("MAT789", u.getMatricula());
        assertEquals("senha123", u.getSenha());
    }

    @Test
    public void testConstrutorPadraoEGetters() {
        Usuario u = new Usuario();
        assertNull(u.getNome());
        assertNull(u.getPerfil());
        assertNull(u.getMatricula());
        assertNull(u.getSenha());
    }
}
