package abstracao;

import implementacao.FormatoExportacao;
import java.util.List;

// Relatório focado no consolidado de vendas e faturamento
public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(FormatoExportacao exportador) {
        super(exportador);
    }

    @Override
    public void gerarRelatorio() {
        List<String> dados = obterDadosVendas();
        exportador.desenharCabecalho("Relatório de Vendas - TechFatec");
        exportador.desenharCorpo(dados);
        exportador.finalizarArquivo();
    }

    // Simula a busca de dados de vendas do sistema
    private List<String> obterDadosVendas() {
        return List.of(
            "Região Sul | Enterprise Cloud | Total: R$ 225.000,00",
            "Região Sudeste | Suporte 24x7 | Total: R$ 360.000,00",
            "Região Nordeste | Treinamento | Total: R$ 45.000,00",
            "Região Centro-Oeste | Consultoria | Total: R$ 150.000,00"
        );
    }
}
