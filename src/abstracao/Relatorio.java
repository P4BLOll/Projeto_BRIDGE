package abstracao;

import implementacao.FormatoExportacao;

/**
 * Abstração base do Padrão Bridge.
 * Mantém uma referência de agregação para a interface FormatoExportacao,
 * recebida exclusivamente via Injeção de Dependência.
 */
public abstract class Relatorio {

    protected FormatoExportacao exportador;

    /**
     * Construtor com Injeção de Dependência do exportador concreto.
     * É vedado o uso do operador 'new' dentro da hierarquia de relatórios.
     *
     * @param exportador implementação concreta de FormatoExportacao
     */
    public Relatorio(FormatoExportacao exportador) {
        if (exportador == null) {
            throw new IllegalArgumentException("O formato de exportação não pode ser nulo.");
        }
        this.exportador = exportador;
    }

    /**
     * Permite alterar dinamicamente o formato de exportação em tempo de execução
     * para a mesma instância de relatório.
     *
     * @param exportador novo formato de exportação
     */
    public void setExportador(FormatoExportacao exportador) {
        if (exportador == null) {
            throw new IllegalArgumentException("O formato de exportação não pode ser nulo.");
        }
        this.exportador = exportador;
    }

    /**
     * Operação abstrata que organiza os dados do relatório e delega a escrita
     * para a ponte de implementação (exportador).
     */
    public abstract void gerarRelatorio();
}
