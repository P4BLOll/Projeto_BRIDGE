package implementacao;

import java.util.List;

/**
 * ConcreteImplementor para exportação no formato HTML.
 * Encapsula os detalhes de marcação semântica e estilização CSS.
 */
public class ExportadorHTML implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("  [HTML] --------------- DOCUMENTO WEB (HTML5) ---------------");
        System.out.println("  [HTML] <!DOCTYPE html>");
        System.out.println("  [HTML] <html lang=\"pt-BR\"><head><meta charset=\"UTF-8\"><title>" + titulo + "</title>");
        System.out.println("  [HTML] <style>body{font-family:Segoe UI,sans-serif;} table{width:100%;border-collapse:collapse;} th,td{padding:8px;border:1px solid #ddd;}</style>");
        System.out.println("  [HTML] </head><body><h1>" + titulo + "</h1>");
        System.out.println("  [HTML] <table><thead><tr><th>Registro / Dados Corporativos</th></tr></thead><tbody>");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        for (String linha : dados) {
            System.out.println("  [HTML]   <tr><td>" + linha + "</td></tr>");
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("  [HTML] </tbody></table>");
        System.out.println("  [HTML] </body></html>");
        System.out.println("  [HTML] >> Página web gerada com sucesso: saida_relatorio.html\n");
    }
}
