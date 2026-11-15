package implementacao;

import java.util.List;

/**
 * Implementador Concreto para exportação tabular no formato Excel (XLSX).
 */
public class ExportadorExcel implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[EXCEL/XLSX] Criando aba principal da planilha: [" + titulo + " - TechFatec]");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[EXCEL/XLSX] Preenchendo linhas e células tabulares:");
        for (int i = 0; i < dados.size(); i++) {
            System.out.printf("  [Linha %d] | %s |%n", i + 1, dados.get(i));
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[EXCEL/XLSX] Planilha .xlsx gravada e fechada com sucesso.\n");
    }
}
