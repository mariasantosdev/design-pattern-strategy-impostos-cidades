package br.com.strategy.imposto;

import java.math.BigDecimal;

public class ImovelEntreVinteECinquentaAnos implements CalculaImpostoPorIdadeDoImovel {
    @Override
    public boolean deveAplicarPara(int idade) {
        return idade > 20 && idade < 50;
    }

    @Override
    public BigDecimal calcula(int idade) {
        return new BigDecimal("2.5").multiply(new BigDecimal(idade));
    }
}
