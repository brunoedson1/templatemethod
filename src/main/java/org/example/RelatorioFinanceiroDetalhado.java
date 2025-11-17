package org.example;

public class RelatorioFinanceiroDetalhado extends RelatorioFinanceiroTemplate {
    private final String[] dados;
    private final String autor;

    public RelatorioFinanceiroDetalhado(String[] dados, String autor) {
        this.dados = dados;
        this.autor = autor;
    }

    @Override
    protected String cabecalho() {
        return "RELATÓRIO FINANCEIRO DETALHADO";
    }

    @Override
    protected String conteudo() {
        StringBuilder sb = new StringBuilder();
        for (String d : dados) {
            sb.append("> Entrada detalhada: ").append(d).append("\n");
        }
        return sb.toString().trim();
    }

    @Override
    protected String rodape() {
        return "Autor: " + autor + "\nFim do relatório detalhado.";
    }
}
