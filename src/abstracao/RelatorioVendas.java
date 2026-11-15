package abstracao;

import implementacao.FormatoExportacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Abstração Refinada para o Relatório de Vendas do sistema TechFatec.
 * Segue o Diagrama de Classes e de Sequência da Fase 1:
 * atributo privado (- dadosVendas: List<String>) e método privado (- montarDados(): List<String>).
 */
public class RelatorioVendas extends Relatorio {

    private List<String> dadosVendas;

    /**
     * Recebe o exportador via Injeção de Dependência no construtor.
     *
     * @param exportador implementação do formato de saída (PDF, Excel ou HTML)
     */
    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
        this.dadosVendas = new ArrayList<>();
    }

    @Override
    public void gerarRelatorio() {
        this.dadosVendas = montarDados();
        exportador.desenharCabecalho("Relatório de Vendas");
        exportador.desenharCorpo(this.dadosVendas);
        exportador.finalizarArquivo();
    }

    /**
     * Organiza e retorna os dados analíticos de vendas (mensagem 3.1 do Diagrama de Sequência).
     */
    private List<String> montarDados() {
        return Arrays.asList(
            "Produto: Licença ERP TechFatec | Qtd: 120 | Total: R$ 240.000,00",
            "Produto: Módulo BI Analytics   | Qtd: 85  | Total: R$ 170.000,00",
            "Produto: Consultoria Cloud     | Qtd: 40  | Total: R$ 120.000,00"
        );
    }
}
