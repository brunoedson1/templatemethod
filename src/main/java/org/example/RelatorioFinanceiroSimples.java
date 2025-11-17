package org.example;

public class RelatorioFinanceiroSimples extends RelatorioFinanceiroTemplate {
    private final String[] dados;

    public RelatorioFinanceiroSimples(String[] dados) {
        this.dados = dados;
    }

    @Override
    protected String cabecalho() {
        return "RELATÓRIO FINANCEIRO SIMPLES";
    }

    @Override
    protected String conteudo() {
        StringBuilder sb = new StringBuilder();
        for (String d : dados) {
            sb.append("Entrada: ").append(d).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    protected String rodape() {
        return "Fim do relatório simples.";
    }
}