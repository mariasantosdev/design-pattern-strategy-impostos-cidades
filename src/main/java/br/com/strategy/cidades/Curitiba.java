package br.com.strategy.cidades;

import br.com.strategy.imposto.IdadesSuportadasParaCalculoDoImposto;

import java.math.BigDecimal;

public class Curitiba extends Cidade {

    private int idadeDoImovel;

    public BigDecimal calculoTotal() {
       return IdadesSuportadasParaCalculoDoImposto.calcularImpostoDeRenda(idadeDoImovel);
    }
    @Override
    protected BigDecimal calcularArea(BigDecimal tamanhoArea) {
        return tamanhoArea.multiply(new BigDecimal("5"));
    }
}
