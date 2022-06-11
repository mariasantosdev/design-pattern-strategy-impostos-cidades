package br.com.strategy.cidades;

import java.math.BigDecimal;

public abstract class Cidade {
    protected BigDecimal areaTotal;

    public void setAreaTotal(BigDecimal areaTotal) {
        this.areaTotal = areaTotal;
    }

    protected abstract BigDecimal calcularArea();
}
