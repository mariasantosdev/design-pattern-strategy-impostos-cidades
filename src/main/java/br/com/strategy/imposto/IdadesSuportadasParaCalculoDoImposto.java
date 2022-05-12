package br.com.strategy.imposto;

import java.math.BigDecimal;
import java.util.Arrays;

public enum IdadesSuportadasParaCalculoDoImposto {
    ACIMA_DE_CINQUENTA(new ImovelComMaisDeCinquentaAnos()),
    ABAIXO_DE_VINTE(new ImovelComMenosDeVinteAnos()),
    ENTRE_VINTE_E_CINQUENTA(new ImovelEntreVinteECinquentaAnos());

    private final CalculaImpostoPorIdadeDoImovel calculaImpostoPorIdadeDoImovel;

    IdadesSuportadasParaCalculoDoImposto(CalculaImpostoPorIdadeDoImovel calculaImpostoPorIdadeDoImovel) {
        this.calculaImpostoPorIdadeDoImovel = calculaImpostoPorIdadeDoImovel;
    }

    public static BigDecimal calcularImpostoDeRenda(int idade) {
        return Arrays.stream(IdadesSuportadasParaCalculoDoImposto.values())
                .filter(t -> t.aplica(idade))
                .findFirst()
                .map(i -> i.calcula(idade))
                .orElseThrow();
    }

    private boolean aplica(int idade) {
        return calculaImpostoPorIdadeDoImovel.deveAplicarPara(idade);
    }

    private BigDecimal calcula(int idade) {
        return calculaImpostoPorIdadeDoImovel.calcula(idade);
    }
}
