package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

// Relatório para avaliação de desempenho dos colaboradores
public class RelatorioRH extends Relatorio {

    public RelatorioRH(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        List<String> dados = obterDadosDesempenho();
        exportador.desenharCabecalho("Relatório de Desempenho de RH - TechFatec");
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }

    // Simula a consulta de métricas e notas da equipe
    private List<String> obterDadosDesempenho() {
        return List.of(
            "Carlos Alberto (Arquiteto de Software) - Nota: 9.7",
            "Beatriz Mendes (Engenheira DevOps) - Nota: 9.4",
            "Mariana Souza (Tech Lead) - Nota: 9.8",
            "Eduardo Santos (Analista QA) - Nota: 8.9"
        );
    }
}
