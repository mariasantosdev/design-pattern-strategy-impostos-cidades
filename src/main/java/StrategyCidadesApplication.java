import br.com.strategy.cidades.BeloHorizonte;
import br.com.strategy.cidades.PortoAlegre;
import br.com.strategy.cidades.SaoPaulo;

import java.math.BigDecimal;

public class StrategyCidadesApplication {
    public static void main(String[] args) {
        BeloHorizonte beloHorizonte = new BeloHorizonte();
        System.out.println(beloHorizonte.calculoTotal(new BigDecimal("900")));

        SaoPaulo saoPaulo = new SaoPaulo();
        System.out.println(saoPaulo.calculoTotal(new BigDecimal("900")));

        PortoAlegre portoAlegre = new PortoAlegre();
        System.out.println(portoAlegre.calculoTotal(new BigDecimal("500")));
    }
}
