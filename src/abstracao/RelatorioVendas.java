package abstracao;

import implementacao.FormatoExportacao;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstração Refinada: Relatório de Vendas.
 * Herda a estrutura básica de Relatorio e implementa o fluxo de negócio de Vendas.
 */
public class RelatorioVendas extends Relatorio {

    /**
     * Construtor que recebe o exportador por Injeção de Dependência.
     *
     * @param exportador Formato de exportação a ser utilizado.
     */
    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    /**
     * Simula a recuperação e consolidação de métricas do banco de dados de vendas.
     *
     * @return Lista com dados tabulares de faturamento e vendas.
     */
    private List<String> obterDadosVendas() {
        List<String> dados = new ArrayList<>();
        dados.add("Região Sul | Produto: Licença Enterprise Cloud | Qtd: 45 | Total: R$ 225.000,00");
        dados.add("Região Sudeste | Produto: Suporte Especializado 24x7 | Qtd: 120 | Total: R$ 360.000,00");
        dados.add("Região Nordeste | Produto: Treinamento Corporativo Bridge | Qtd: 15 | Total: R$ 45.000,00");
        dados.add("Região Centro-Oeste | Produto: Consultoria de Arquitetura | Qtd: 30 | Total: R$ 150.000,00");
        dados.add("TOTAL GERAL DE VENDAS: R$ 780.000,00 | Status: Meta Trimestral Superada (104%)");
        return dados;
    }

    @Override
    public void gerarRelatorio() {
        // 1. Obtém os dados de domínio de vendas
        List<String> dados = obterDadosVendas();

        // 2. Delega a renderização para a interface FormatoExportacao (Bridge)
        this.exportador.desenharCabecalho("Relatório Consolidado de Vendas - TechFatec");
        this.exportador.desenharCorpo(dados);
        this.exportador.finalizarArquivo();
    }
}
