package br.com.strategy;

import br.com.strategy.cidades.*;

import java.math.BigDecimal;

public class StrategyCidadesApplication {
    public static void main(String[] args) {
        BeloHorizonte beloHorizonte = new BeloHorizonte();
        beloHorizonte.setAreaTotal(new BigDecimal("900.00"));
        System.out.println(beloHorizonte.calculoTotal());

        SaoPaulo saoPaulo = new SaoPaulo();
        saoPaulo.setAreaTotal(new BigDecimal("900.00"));
        System.out.println(saoPaulo.calculoTotal());

        PortoAlegre portoAlegre = new PortoAlegre();
        portoAlegre.setAreaTotal(new BigDecimal("900.00"));
        System.out.println(portoAlegre.calculoTotal());
    }
}
