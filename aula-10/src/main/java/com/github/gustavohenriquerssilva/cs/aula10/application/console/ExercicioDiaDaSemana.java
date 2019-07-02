package com.github.gustavohenriquerssilva.cs.aula10.application.console;

import com.github.gustavohenriquerssilva.cs.aula10.domain.DiaDaSemanaUtils;

//import com.github.gustavohenriquerssilva.cs.aula10.domain.ProcessaDataUtils;

/**
* Executa ProgramaInteiro.
*
* @author Octavio Lo Leggio
*/
public final class ExercicioDiaDaSemana {
    /**
    * Método construtor da classe main.
    */
    private ExercicioDiaDaSemana() {

    }
    /**
    * Método main.
    * @param args String de endereço de um arquivo
    *
    * @throws IOException se ocorrer exception de IO
    */
    public static void main(final String[] args) {
        System.exit(DiaDaSemanaUtils.executaPrograma(args));
    }
}
