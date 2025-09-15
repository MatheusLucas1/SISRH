package sisrh.soap;

import java.util.List;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.WebServiceContext;

import sisrh.banco.Banco;
import sisrh.dto.Solicitacao;
import sisrh.dto.Solicitacoes;
import sisrh.seguranca.Autenticador;

@WebService
@SOAPBinding(style = Style.RPC)
public class ServicoSolicitacao {

    @Resource
    WebServiceContext context;

    @WebMethod(action = "listarSolicitacoes")
    public Solicitacoes listarSolicitacoes() throws Exception {
        Autenticador.autenticarUsuarioSenha(context);
        String usuario = Autenticador.getUsuario(context);

        List<Solicitacao> lista = Banco.listarSolicitacoes(usuario);
        Solicitacoes solicitacoes = new Solicitacoes();
        solicitacoes.getSolicitacoes().addAll(lista);
        return solicitacoes;
    }
}
