package org.example;

public abstract class RelatorioFinanceiroTemplate {
    public final String gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        sb.append(cabecalho()).append("\n");
        sb.append(conteudo()).append("\n");
        sb.append(rodape());
        return sb.toString();
    }

    protected abstract String cabecalho();
    protected abstract String conteudo();
    protected abstract String rodape();
}