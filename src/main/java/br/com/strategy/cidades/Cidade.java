package br.com.strategy.cidades;

import java.math.BigDecimal;

public abstract class Cidade {
    private BigDecimal areaTotal;

    protected BigDecimal calcular() {
        return calcularArea(areaTotal);
    }

    protected abstract BigDecimal calcularArea(BigDecimal tamanhoArea);
}
