package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;
import implementacao.FormatoExportacao;

/**
 * Classe Principal de Execução e Script de Validação do Cliente.
 *
 * Demonstra o desacoplamento promovido pelo Padrão Bridge (GoF):
 * 1. Geração de um Relatório de Vendas em PDF (Injeção via Construtor).
 * 2. Alteração dinâmica em tempo de execução do mesmo relatório de vendas para o formato Excel (via setter).
 * 3. Geração de um Relatório de RH em HTML (Injeção via Construtor).
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("       TECHFATEC — SISTEMA DE INTELIGÊNCIA DE NEGÓCIOS (PADRÃO BRIDGE)          ");
        System.out.println("================================================================================\n");

        // -----------------------------------------------------------------------------------------
        // ROTINA 1: Geração de um Relatório de Vendas em PDF
        // -----------------------------------------------------------------------------------------
        System.out.println(">>> [ROTINA 1] Geração de Relatório de Vendas em PDF");
        System.out.println("    [Injeção de Dependência]: Instanciando ExportadorPDF fora da abstração.");
        System.out.println("    Injetando no construtor de RelatorioVendas...\n");

        FormatoExportacao exportadorPdf = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(exportadorPdf);
        relatorioVendas.gerarRelatorio();

        // -----------------------------------------------------------------------------------------
        // ROTINA 2: Alteração dinâmica em tempo de execução do MESMO relatório de vendas para Excel
        // -----------------------------------------------------------------------------------------
        System.out.println(">>> [ROTINA 2] Alteração Dinâmica de Formato em Tempo de Execução (Runtime)");
        System.out.println("    [Desacoplamento]: O mesmo objeto 'relatorioVendas' tem seu exportador");
        System.out.println("    substituído por ExportadorExcel via setExportador(...) sem recriar o relatório...\n");

        FormatoExportacao exportadorExcel = new ExportadorExcel();
        relatorioVendas.setExportador(exportadorExcel);
        relatorioVendas.gerarRelatorio();

        // -----------------------------------------------------------------------------------------
        // ROTINA 3: Geração de um Relatório de RH em HTML
        // -----------------------------------------------------------------------------------------
        System.out.println(">>> [ROTINA 3] Geração de Relatório de RH em HTML");
        System.out.println("    [Extensibilidade OCP]: Novo tipo de relatório (RH) com novo formato (HTML)");
        System.out.println("    Injetando FormatoExportacao (ExportadorHTML) no construtor de RelatorioRH...\n");

        FormatoExportacao exportadorHtml = new ExportadorHTML();
        Relatorio relatorioRH = new RelatorioRH(exportadorHtml);
        relatorioRH.gerarRelatorio();

        System.out.println("================================================================================");
        System.out.println("   VALIDAÇÃO CONCLUÍDA COM SUCESSO: TODAS AS ROTINAS EXECUTADAS CORRETAMENTE!   ");
        System.out.println("================================================================================");
    }
}
