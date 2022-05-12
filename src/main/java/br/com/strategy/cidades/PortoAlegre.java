package br.com.strategy.cidades;

import java.math.BigDecimal;

public class PortoAlegre extends Cidade {

    private BigDecimal areaDaGaragem;
    private boolean contemGaragem;

    public BigDecimal calculoTotal(BigDecimal tamanhoArea) {
        if (contemGaragem) {
            return this.calcularArea(tamanhoArea).add(areaDaGaragem).multiply(new BigDecimal("2"));
        }
        return this.calcularArea(tamanhoArea).multiply(new BigDecimal("8"));
    }
    @Override
    protected BigDecimal calcularArea(BigDecimal tamanhoArea) {
        return tamanhoArea.multiply(new BigDecimal("7.5"));
    }
}
