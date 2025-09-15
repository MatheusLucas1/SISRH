package sisrh.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Solicitacoes {

    @XmlElement(name = "solicitacao")
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }
}
