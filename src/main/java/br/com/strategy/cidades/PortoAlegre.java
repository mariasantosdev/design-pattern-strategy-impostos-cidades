package br.com.strategy.cidades;

import java.math.BigDecimal;

public class PortoAlegre extends Cidade {

    private BigDecimal areaDaGaragem;
    private boolean contemGaragem;

    public PortoAlegre(BigDecimal areaTotal, BigDecimal areaDaGaragem, boolean contemGaragem) {
        super(areaTotal);
        this.areaDaGaragem = areaDaGaragem;
        this.contemGaragem = contemGaragem;
    }

    public BigDecimal calculoTotal() {
        if (contemGaragem) {
            return this.calcularArea().add(areaDaGaragem).multiply(new BigDecimal("2"));
        }
        return this.calcularArea().multiply(new BigDecimal("8"));
    }

    @Override
    protected BigDecimal calcularArea() {
        return areaTotal.multiply(new BigDecimal("7.5"));
    }
}
