package implementacao;

import java.util.List;

/**
 * ConcreteImplementor para exportação no formato PDF.
 * Encapsula os detalhes de estrutura vetorial e layout de documentos PDF.
 */
public class ExportadorPDF implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("  [PDF] ------------------ CABEÇALHO DO DOCUMENTO ------------------");
        System.out.println("  [PDF] Título: " + titulo.toUpperCase());
        System.out.println("  [PDF] Metadados: Versão PDF 1.7 | Layout: Retrato A4 | Margem: 20mm");
        System.out.println("  [PDF] -----------------------------------------------------------");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("  [PDF] Renderizando blocos de texto e tabelas vetoriais:");
        for (String linha : dados) {
            System.out.println("  [PDF]   • " + linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("  [PDF] Inserindo sumário de páginas, assinatura digital e fechando stream.");
        System.out.println("  [PDF] >> Arquivo gravado com sucesso: saida_relatorio.pdf\n");
    }
}
