package implementacao;

import java.util.List;

/**
 * Implementador Concreto para exportação em página web no formato HTML.
 */
public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("[HTML] <!DOCTYPE html>");
        System.out.println("[HTML] <html><head><title>" + titulo + " - TechFatec</title></head><body>");
        System.out.println("[HTML]   <h1>" + titulo + " - TechFatec</h1>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("[HTML]   <ul>");
        for (String item : dados) {
            System.out.println("[HTML]     <li>" + item + "</li>");
        }
        System.out.println("[HTML]   </ul>");
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("[HTML] </body></html>");
        System.out.println("[HTML] Página HTML exportada com sucesso.\n");
    }
}
