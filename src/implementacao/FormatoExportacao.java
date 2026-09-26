package implementacao;

import java.util.List;

// Contrato comum para os diferentes formatos de saída
public interface FormatoExportacao {
    void desenharCabecalho(String titulo);
    void desenharCorpo(List<String> dados);
    void finalizarArquivo();
}
