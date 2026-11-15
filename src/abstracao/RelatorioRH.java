package abstracao;

import implementacao.FormatoExportacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Abstração Refinada para o Relatório de Desempenho de RH do sistema TechFatec.
 * Segue o Diagrama de Classes e de Sequência da Fase 1:
 * atributo privado (- dadosDesempenho: List<String>) e método privado (- montarDados(): List<String>).
 */
public class RelatorioRH extends Relatorio {

    private List<String> dadosDesempenho;

    /**
     * Recebe o exportador via Injeção de Dependência no construtor.
     *
     * @param exportador implementação do formato de saída (PDF, Excel ou HTML)
     */
    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
        this.dadosDesempenho = new ArrayList<>();
    }

    @Override
    public void gerarRelatorio() {
        this.dadosDesempenho = montarDados();
        exportador.desenharCabecalho("Relatório de Desempenho de RH");
        exportador.desenharCorpo(this.dadosDesempenho);
        exportador.finalizarArquivo();
    }

    /**
     * Organiza e retorna os indicadores de desempenho de RH (mensagem 6.1 do Diagrama de Sequência).
     */
    private List<String> montarDados() {
        return Arrays.asList(
            "Colaborador: Ana Silva     | Cargo: Engenheira de Dados | Meta: 98% (Atingida)",
            "Colaborador: Carlos Mendes | Cargo: Arquiteto de BI     | Meta: 95% (Atingida)",
            "Colaborador: Beatriz Costa | Cargo: Analista de Sistemas| Meta: 92% (Atingida)"
        );
    }
}
