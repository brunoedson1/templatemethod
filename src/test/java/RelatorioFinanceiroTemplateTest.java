import org.example.RelatorioFinanceiroDetalhado;
import org.example.RelatorioFinanceiroSimples;
import org.example.RelatorioFinanceiroTemplate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RelatorioFinanceiroTemplateTest {

    @Test
    public void testRelatorioSimples() {
        String[] valores = {"100", "200", "300"};
        RelatorioFinanceiroTemplate relatorio = new RelatorioFinanceiroSimples(valores);

        String esperado =
                "RELATÓRIO FINANCEIRO SIMPLES\n" +
                        "Entrada: 100\n" +
                        "Entrada: 200\n" +
                        "Entrada: 300\n" +
                        "Fim do relatório simples.";

        assertEquals(esperado, relatorio.gerarRelatorio());
    }

    @Test
    public void testRelatorioDetalhado() {
        String[] valores = {"500", "700"};
        RelatorioFinanceiroTemplate relatorio = new RelatorioFinanceiroDetalhado(valores, "Contador João");

        String esperado =
                "RELATÓRIO FINANCEIRO DETALHADO\n" +
                        "> Entrada detalhada: 500\n" +
                        "> Entrada detalhada: 700\n" +
                        "Autor: Contador João\n" +
                        "Fim do relatório detalhado.";

        assertEquals(esperado, relatorio.gerarRelatorio());
    }
}