package implementacao;

import java.util.List;

// Exporta as informações simulando um documento PDF
public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[PDF] Cabeçalho: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[PDF] Conteúdo:");
        for (String item : dados) {
            System.out.println("  - " + item);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[PDF] Arquivo gerado com sucesso.\n");
    }
}
