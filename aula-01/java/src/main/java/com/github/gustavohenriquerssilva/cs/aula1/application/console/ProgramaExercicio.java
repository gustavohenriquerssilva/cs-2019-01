package main.java.com.github.gustavohenriquerssilva.cs.aula1.application.console;

import main.java.com.github.gustavohenriquerssilva.cs.aula1.domain.Exercicios;

/**
 * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
 *
 * @param args Ignorados.
 */
public final class ProgramaExercicio {
    /**
     * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
     *
     * @param args Ignorados.
     */
    private static void main(final String[] args) {
        final int valorEntrada = 99;
        Exercicios.ehNumeroPrimo(valorEntrada);
    }
}

