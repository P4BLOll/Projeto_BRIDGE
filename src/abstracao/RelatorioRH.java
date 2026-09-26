package abstracao;

import implementacao.FormatoExportacao;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstração Refinada: Relatório de Desempenho de RH.
 * Herda a estrutura básica de Relatorio e implementa o fluxo de negócio de Recursos Humanos.
 */
public class RelatorioRH extends Relatorio {

    /**
     * Construtor que recebe o exportador por Injeção de Dependência.
     *
     * @param exportador Formato de exportação a ser utilizado.
     */
    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    /**
     * Simula a recuperação de indicadores de desempenho e avaliação de colaboradores.
     *
     * @return Lista com dados consolidados de desempenho individual e organizacional.
     */
    private List<String> obterDadosDesempenho() {
        List<String> dados = new ArrayList<>();
        dados.add("Colaborador: Carlos Alberto | Cargo: Arquiteto de Software | Avaliação: 9.7/10 | Status: Excedeu Expectativas");
        dados.add("Colaborador: Beatriz Mendes | Cargo: Engenheira DevOps | Avaliação: 9.4/10 | Status: Excedeu Expectativas");
        dados.add("Colaborador: Mariana Souza | Cargo: Tech Lead Back-end | Avaliação: 9.8/10 | Status: Destaque do Trimestre");
        dados.add("Colaborador: Eduardo Santos | Cargo: Analista de QA Pleno | Avaliação: 8.9/10 | Status: Atingiu Metas");
        dados.add("ÍNDICE DE CLIMA ORGANIZACIONAL: 92% Satisfação | Taxa de Turnover: 1.2% (Excelente)");
        return dados;
    }

    @Override
    public void gerarRelatorio() {
        // 1. Obtém os dados de domínio de RH
        List<String> dados = obterDadosDesempenho();

        // 2. Delega a renderização para a interface FormatoExportacao (Bridge)
        this.exportador.desenharCabecalho("Relatório de Desempenho de RH - TechFatec");
        this.exportador.desenharCorpo(dados);
        this.exportador.finalizarArquivo();
    }
}
