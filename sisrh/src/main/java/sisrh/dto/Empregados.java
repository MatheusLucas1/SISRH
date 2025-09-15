package sisrh.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Empregados {

    @XmlElement(name = "empregado")
    private List<Empregado> empregados = new ArrayList<>();

    public List<Empregado> getEmpregados() {
        return empregados;
    }
}
