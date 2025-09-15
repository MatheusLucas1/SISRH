package sisrh.dto;

import org.junit.jupiter.api.Test;
import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitacoesTest {

    @Test
    public void testListaSolicitacoesInicialVazia() {
        Solicitacoes solicitacoes = new Solicitacoes();
        assertNotNull(solicitacoes.getSolicitacoes());
        assertTrue(solicitacoes.getSolicitacoes().isEmpty());
    }

    @Test
    public void testAdicionarSolicitacaoNaLista() {
        Solicitacoes solicitacoes = new Solicitacoes();
        Solicitacao s = new Solicitacao(1, Date.valueOf("2025-09-15"), "Descricao", 1, "MAT001");

        solicitacoes.getSolicitacoes().add(s);

        List<Solicitacao> lista = solicitacoes.getSolicitacoes();
        assertEquals(1, lista.size());
        assertEquals("Descricao", lista.get(0).getDescricao());
    }
}
