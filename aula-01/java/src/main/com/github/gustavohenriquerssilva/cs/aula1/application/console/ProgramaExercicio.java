package main.com.github.gustavohenriquerssilva.cs.aula1.application.console;

import main.com.github.gustavohenriquerssilva.cs.aula1.domain.Exercicios;


public final class ProgramaExercicio {


	/**
	 * Restringe criação de instância.
	 */
	private ProgramaExercicio() {
		// Apenas evita criação de instância.
	}

	/**
	 * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
	 *
	 * @param args Ignorados.
	 */
	public static void main(String[] args) {

		System.out.println(Exercicios.ehNumeroPrimo(99));
	}
	
	
}

