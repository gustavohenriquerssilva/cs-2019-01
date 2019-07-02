package com.github.gustavohenriquerssilva.cs.aula10.domain;

/**
 * Valida as entradas enviadas pelo terminal de acordo com
 * restrições de datas e números inteiros.
 */
public final class VerificaEntradaUtils {
    /**
     * Método construtor da classe.
     */
    private VerificaEntradaUtils() {

    }

    /**
     * Verifica tamanho do argumento recebido
     *
     * @param argumentos Data analizada
     *
     * @return  Retorna 1 para quantidade correta e
     *         -1 se não for
     */
    public static int verifiqueTamanhoArg(final String[] argumentos) {
        final int tamArg = 4;
        if (argumentos.length == tamArg) {
            return 1;
        } 
        return -1;
    }

    /**
     * Verifica se valor é positivo
     *
     * @param argumentos String avaliada
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para falso
     */
    public static int ehInteiro(final String[] argumentos) {
        int ehInteiro = -1;
        int sePositivo = 0;

        for (int i = 0; i < argumentos.length; i++) {
            try {
               sePositivo = Integer.parseInt(argumentos[i]);

               ehInteiro = 1;
            } catch (NumberFormatException ex) {
               return -1;
            }

            if (sePositivo < 0) {
                return -1;
            }
        }

        return ehInteiro;
     }

    /**
     * Verifica dia da semana.
     *
     * @param argDiaSemana String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para falso
     */
    public static int verifiqueSemana(final int argDiaSemana) {
        final int diaSemanaMax = 6;
        if (argDiaSemana > diaSemanaMax) {
            return -1;
        } 
        return 1;
    }

    /**
     * Verifica ano bisexto.
     *
     * @param anoBisexto String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para falso
     */
    public static int verifiqueAnoBisexto(final int anoBisexto) {
        final int limiteBisexto = 1;
        if (anoBisexto < limiteBisexto) {
            return -1;
        } 
        return 1;
    }

    /**
     * Verifica data.
     * 
     * @param argumentos String avaliada
     * @param anoBisexto Ano bisexto de referência
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para falso
     */
    public static int verifiqueData(final String argumentos,
        final int anoBisexto) {
        final int dataMax = 8;
        if (argumentos.length() != dataMax) {
            return -1;
        }

        final char anoInvalido = '0';

        if (argumentos.charAt(0) == anoInvalido) {
            return -1;
        }

        if (DiaDaSemanaUtils.obtenhaMes(argumentos) == 0) {
            return -1;
        }

        final int mesMax = 12;
        if (DiaDaSemanaUtils.obtenhaMes(argumentos) > mesMax) {
            return -1;
        }

        if (DiaDaSemanaUtils.obtenhaDia(argumentos) == 0) {
            return -1;
        }

        if (DiaDaSemanaUtils.obtenhaDia(argumentos)
                > DiaDaSemanaUtils.obtenhaUltDiaDoMes(
                    DiaDaSemanaUtils.obtenhaMes(argumentos),
                DiaDaSemanaUtils.obtenhaAno(argumentos), anoBisexto)) {
            return -1;
        }

        return 1;
    }

    /**
     * Método que processa todos os critérios
     * de excessão do argumento do programa.
     *
     * @param argumentos String a ser avaliado
     *
     * @return Retorna 1 para verdadeiro e
     * -1 para faso
     */
    public static int verifiqueValor(final String[] argumentos) {
        final int verdadeiro = 1;

        if (verifiqueTamanhoArg(argumentos) != verdadeiro) {
            return -1;
        }

        if (ehInteiro(argumentos) != verdadeiro) {
            return -1;
        }

        if (verifiqueSemana(Integer.parseInt(
            argumentos[3])) != verdadeiro) {
            return -1;
        }

        final int anoBisexto = 1;
        if (verifiqueAnoBisexto(Integer.parseInt(
            argumentos[anoBisexto])) != verdadeiro) {
            return -1;
        }

        if (verifiqueData(argumentos[0],
        Integer.parseInt(argumentos[anoBisexto])) != verdadeiro) {
            return -1;
        }

        if (verifiqueData(argumentos[2],
        Integer.parseInt(argumentos[anoBisexto])) != verdadeiro) {
            return -1;
        }

        return 1;
    }
}
