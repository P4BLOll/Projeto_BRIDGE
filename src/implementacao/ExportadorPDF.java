package implementacao;

import java.util.List;

/**
 * Implementador Concreto para exportação no formato PDF.
 */
public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] === CABEÇALHO DO DOCUMENTO: " + titulo + " (TechFatec) ===");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[PDF] Renderizando páginas do relatório:");
        for (String linha : dados) {
            System.out.println("  - " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] Documento PDF finalizado e assinado com sucesso.\n");
    }
}
