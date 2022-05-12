package br.com.strategy.imposto;

import java.math.BigDecimal;

public interface CalculaImpostoPorIdadeDoImovel {
    boolean deveAplicarPara(int idade);
    BigDecimal calcula(int idade);
}
