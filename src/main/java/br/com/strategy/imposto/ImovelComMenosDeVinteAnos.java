package br.com.strategy.imposto;

import java.math.BigDecimal;

public class ImovelComMenosDeVinteAnos implements CalculaImpostoPorIdadeDoImovel {
    @Override
    public boolean deveAplicarPara(int idade) {
        return idade < 20;
    }

    @Override
    public BigDecimal calcula(int idade) {
        return new BigDecimal("2").multiply(new BigDecimal(idade));
    }
}
