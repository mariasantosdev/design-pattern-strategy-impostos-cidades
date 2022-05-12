package br.com.strategy.imposto;

import java.math.BigDecimal;

public class ImovelComMaisDeCinquentaAnos implements CalculaImpostoPorIdadeDoImovel {
    @Override
    public boolean deveAplicarPara(int idade) {
        return idade > 50;
    }

    @Override
    public BigDecimal calcula(int idade) {
        return new BigDecimal("3").multiply(new BigDecimal(idade));
    }
}
