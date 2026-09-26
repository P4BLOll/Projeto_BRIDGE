package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;
import implementacao.FormatoExportacao;

// Ponto de entrada da aplicação para testar o comportamento dos relatórios
public class Main {

    public static void main(String[] args) {
        System.out.println("=== TechFatec - Módulo de Relatórios ===\n");

        // 1. Gera o relatório de vendas em PDF
        System.out.println("1. Gerando Relatório de Vendas em PDF:");
        FormatoExportacao exportadorPdf = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(exportadorPdf);
        relatorioVendas.gerarRelatorio();

        // 2. Muda o formato do mesmo relatório para Excel em tempo de execução
        System.out.println("2. Alterando o formato do mesmo relatório para Excel:");
        relatorioVendas.setExportador(new ExportadorExcel());
        relatorioVendas.gerarRelatorio();

        // 3. Gera o novo relatório de RH em HTML
        System.out.println("3. Gerando Relatório de RH em HTML:");
        FormatoExportacao exportadorHtml = new ExportadorHTML();
        Relatorio relatorioRH = new RelatorioRH(exportadorHtml);
        relatorioRH.gerarRelatorio();
    }
}
