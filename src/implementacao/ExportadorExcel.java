package implementacao;

import java.util.List;

// Exporta as informações simulando uma planilha Excel
public class ExportadorExcel implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[Excel] Planilha: " + titulo);
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[Excel] Linhas da planilha:");
        for (int i = 0; i < dados.size(); i++) {
            System.out.printf("  Linha %d: %s%n", i + 1, dados.get(i));
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[Excel] Planilha gerada com sucesso.\n");
    }
}
