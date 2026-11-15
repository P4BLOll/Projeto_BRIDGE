package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioRH;
import abstracao.RelatorioVendas;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;
import implementacao.ExportadorPDF;
import implementacao.FormatoExportacao;

/**
 * Script de Validação (Cliente) - Sistema de Inteligência de Negócios TechFatec.
 * Demonstra o desacoplamento entre Abstração (Relatorio) e Implementação (FormatoExportacao)
 * por meio do Padrão Bridge e Injeção de Dependência.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("  TECHFATEC - MÓDULO DE RELATÓRIOS CORPORATIVOS (PADRÃO BRIDGE)   ");
        System.out.println("==================================================================\n");

        // -------------------------------------------------------------------------
        // ROTINA 1: Geração de um Relatório de Vendas em PDF (Injeção via Construtor)
        // -------------------------------------------------------------------------
        System.out.println(">>> [ROTINA 1] Gerando Relatório de Vendas em PDF:");
        FormatoExportacao expPDF = new ExportadorPDF();
        Relatorio relVendas = new RelatorioVendas(expPDF);
        relVendas.gerarRelatorio();

        // -------------------------------------------------------------------------
        // ROTINA 2: Alteração dinâmica em tempo de execução do MESMO relatório
        //           de vendas para o formato Excel (XLSX)
        // -------------------------------------------------------------------------
        System.out.println(">>> [ROTINA 2] Alterando dinamicamente o MESMO Relatório de Vendas para Excel (XLSX):");
        FormatoExportacao expExcel = new ExportadorExcel();
        relVendas.setExportador(expExcel);
        relVendas.gerarRelatorio();

        // -------------------------------------------------------------------------
        // ROTINA 3: Geração de um Relatório de Desempenho de RH em HTML
        // -------------------------------------------------------------------------
        System.out.println(">>> [ROTINA 3] Gerando Relatório de Desempenho de RH em HTML:");
        FormatoExportacao expHTML = new ExportadorHTML();
        Relatorio relRH = new RelatorioRH(expHTML);
        relRH.gerarRelatorio();
    }
}
