package implementacao;

import java.util.List;

/**
 * ConcreteImplementor para exportação no formato Excel (XLSX).
 * Encapsula os detalhes de grades, planilhas e formatações de células.
 */
public class ExportadorExcel implements FormatoExportacao {

    @Override
    public void desenharCabecalho(String titulo) {
        System.out.println("  [EXCEL] -------------- WORKBOOK / PLANILHA (XLSX) --------------");
        System.out.println("  [EXCEL] Planilha Criada: [ " + titulo + " ]");
        System.out.println("  [EXCEL] Faixa A1:E1 Mesclada | Formatação: Negrito, Fundo Azul (#1F4E79), Texto Branco");
        System.out.println("  [EXCEL] -----------------------------------------------------------");
    }

    @Override
    public void desenharCorpo(List<String> dados) {
        System.out.println("  [EXCEL] Populando linhas e colunas na grade do Excel:");
        int linhaNum = 2;
        for (String linha : dados) {
            System.out.printf("  [EXCEL]   Linha %02d | %s%n", linhaNum++, linha);
        }
    }

    @Override
    public void finalizarArquivo() {
        System.out.println("  [EXCEL] Aplicando auto-ajuste de largura de colunas e compactando pacote OpenXML.");
        System.out.println("  [EXCEL] >> Planilha salva com sucesso: saida_relatorio.xlsx\n");
    }
}
