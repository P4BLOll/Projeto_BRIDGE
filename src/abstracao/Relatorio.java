package abstracao;

import implementacao.FormatoExportacao;

/**
 * Abstração Base do Padrão Bridge.
 * Mantém uma referência protegida (#exportador) para a interface FormatoExportacao.
 *
 * É terminantemente proibido instanciar exportadores concretos dentro desta classe
 * ou de suas subclasses, respeitando a Injeção de Dependência e o Princípio Aberto/Fechado (OCP).
 */
public abstract class Relatorio {

    // Ponte (Bridge) para o Implementor
    protected FormatoExportacao exportador;

    /**
     * Injeção de Dependência obrigatória via construtor.
     *
     * @param exportador Implementação do formato de saída desejado.
     */
    public Relatorio(FormatoExportacao exportador) {
        if (exportador == null) {
            throw new IllegalArgumentException("O exportador não pode ser nulo.");
        }
        this.exportador = exportador;
    }

    /**
     * Método abstrato de negócio que coordena o fluxo de montagem do relatório.
     */
    public abstract void gerarRelatorio();

    /**
     * Permite a alteração dinâmica da implementação da ponte em tempo de execução (Runtime).
     *
     * @param exportador Novo formato de exportação.
     */
    public void setExportador(FormatoExportacao exportador) {
        if (exportador == null) {
            throw new IllegalArgumentException("O exportador não pode ser nulo.");
        }
        this.exportador = exportador;
    }

    public FormatoExportacao getExportador() {
        return this.exportador;
    }
}
