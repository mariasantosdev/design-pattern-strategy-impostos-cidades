package br.com.strategy;

import br.com.strategy.cidades.*;

import java.math.BigDecimal;

public class StrategyCidadesApplication {
    public static void main(String[] args) {
        BeloHorizonte beloHorizonte = new BeloHorizonte(new BigDecimal("900.00"), 1);
        System.out.println(beloHorizonte.calculoTotal());

        SaoPaulo saoPaulo = new SaoPaulo(new BigDecimal("900.00"), 4);
        System.out.println(saoPaulo.calculoTotal());

        PortoAlegre portoAlegre = new PortoAlegre(new BigDecimal("900.00"), new BigDecimal("200.00"), true);
        System.out.println(portoAlegre.calculoTotal());

        Curitiba curitiba = new Curitiba(new BigDecimal("900.00"), 10);
        System.out.println(curitiba.calculoTotal());
    }
}
