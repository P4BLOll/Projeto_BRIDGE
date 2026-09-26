package implementacao;

import java.util.List;

// Exporta as informações simulando uma página HTML
public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <h1>" + titulo + "</h1>");
        System.out.println("[HTML] <ul>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        for (String item : dados) {
            System.out.println("  <li>" + item + "</li>");
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] </ul>");
        System.out.println("[HTML] Documento HTML finalizado com sucesso.\n");
    }
}
