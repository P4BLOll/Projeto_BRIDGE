package abstracao;

import implementacao.FormatoExportacao;
import java.util.Objects;

// Classe base para os relatórios do sistema.
// Recebe a implementação de exportação por injeção de dependência.
public abstract class Relatorio {

    // Referência para o exportador configurado (ponte do Bridge)
    protected FormatoExportacao exportador;

    public Relatorio(FormatoExportacao exportador) {
        this.exportador = Objects.requireNonNull(exportador, "O exportador não pode ser nulo.");
    }

    // Cada tipo de relatório implementa sua lógica de montagem
    public abstract void gerarRelatorio();

    // Permite trocar o formato do relatório em tempo de execução
    public void setExportador(FormatoExportacao exportador) {
        this.exportador = Objects.requireNonNull(exportador, "O exportador não pode ser nulo.");
    }

    public FormatoExportacao getExportador() {
        return exportador;
    }
}
