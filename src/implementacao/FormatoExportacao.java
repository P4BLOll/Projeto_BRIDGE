package implementacao;

import java.util.List;

/**
 * Interface Implementor do Padrão Bridge.
 * Define o contrato de renderização e saída independente da abstração do relatório.
 */
public interface FormatoExportacao {

    void desenharCabecalho(String titulo);

    void desenharCorpo(List<String> dados);

    void finalizarArquivo();
}
