package implementacao;

import java.util.List;

/**
 * Interface Implementor do Padrão Bridge.
 * Define as operações primitivas para qualquer formato de exportação de dados.
 */
public interface FormatoExportacao {
    void desenharCabecalho(String titulo);
    void desenharCorpo(List<String> dados);
    void finalizarArquivo();
}
