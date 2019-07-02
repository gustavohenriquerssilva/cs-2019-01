package com.github.gustavohenriquerssilva.cs.aula10.domain;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Incremente ou decrementa uma data um dia
 * de cada vez levando em conta o último dia
 * de cada mês e o ano bissexto passado como
 * parâmetro em Strings que representam datas
 * no formato 'aaaammdd'.
 */
public final class DiaDaSemanaUtils {

    /**
     * Método construtor da classe.
     */
    private DiaDaSemanaUtils() {

    }

    /**
     * Obtém dia da semana correspondente a data.
     *
     * @param dataEntrada String de uma data no formato 'aaaammdd'
     *
     * @return Retorna o dia 
     */
    public static int obtenhaDia(final String dataEntrada) {
        final int inicioDia = 6;
        final int finalDia = 8;
        return Integer.parseInt(dataEntrada.substring(
            inicioDia, finalDia));
    }

    /**
     * Obtém o mês correspondente a data.
     *
     * @param dataEntrada String de uma data no formato 'aaaammdd'
     *
     * @return Retorna o mês
     */
    public static int obtenhaMes(final String dataEntrada) {
        final int inicioMes = 4;
        final int finalMes = 6;
        return Integer.parseInt(dataEntrada.substring(
            inicioMes, finalMes));
    }

    /**
     * Obtém o ano correspondente a data.
     *
     * @param dataEntrada String de uma data no formato 'aaaammdd'
     *
     * @return Retorna o ano
     */
    public static int obtenhaAno(final String dataEntrada) {
        final int inicioAno = 0;
        final int finalAno = 4;
        return Integer.parseInt(dataEntrada.substring(
            inicioAno, finalAno));
    }

    /**
     * Identifica se um ano é bissexto.
     *
     * @param ano Ano que se deseja saber se é bissexto
     * @param anoBisexto Ano bissexto de referência
     *
     * @return Retorna verdadeiro quando bissexto e falso se não for
     */
    public static boolean ehAnoBisexto(final int ano,
            final int anoBisexto) {
        final int quatrocentos = 400;
        final int cem = 100;
        final int quatro = 4;

        if (ano == anoBisexto) {
            return true;
        } else if ((ano - anoBisexto) % quatro == 0
                && (ano % cem != 0 || ano % quatrocentos == 0)) {
            return true;
        }
        return false;
    }

    /**
     * Obtém o último dia do mês de acordo com
     * a data fornecida e o ano bissexto calculado.
     *
     * @param mes mês em que se deseja saber o último dia
     * @param ano ano para se saber se é bissexto ou não
     * @param anoBisexto Ano bissexto de referência
     *
     * @return um int representando o último dia do mês
     */
    public static int obtenhaUltDiaDoMes(final int mes, final int ano,
            final int anoBisexto) {
                final boolean ehAnoBisexto = ehAnoBisexto(ano, anoBisexto);
                final int janeiro = 1;
                final int fevereiro = 2;
                final int marco = 3;
                final int abril = 4;
                final int maio = 5;
                final int junho = 6;
                final int julho = 7;
                final int agosto = 8;
                final int setembro = 9;
                final int outubro = 10;
                final int novembro = 11;
                final int dezembro = 12;
                final int diaTrintaEUm = 31;
                final int diaTrinta = 30;
                final int diaVinteNove = 29;
                final int diaVinteOito = 28;
        
                switch (mes) {
                    case janeiro:
                    case marco:
                    case maio:
                    case julho:
                    case agosto:
                    case outubro:
                    case dezembro:
                        return diaTrintaEUm;
                    case abril:
                    case junho:
                    case setembro:
                    case novembro:
                        return diaTrinta;
                    case fevereiro:
                        if (ehAnoBisexto) {
                            return diaVinteNove;
                        } else {
                            return diaVinteOito;
                        }
                    default:
                        return 0;
                }
    }

    /**
     * Identifica se duas datas passadas como inteiros
     * são iguais.
     *
     * @param diaUm Dia da primeira data a ser comparada
     * @param mesUm Mês da primeira data a ser comparada
     * @param anoUm Ano da primeira data a ser comparada
     * @param diaDois Dia da segunda data a ser comparada
     * @param mesDois Mês da segunda data a ser comparada
     * @param anoDois Ano da segunda data a ser comparada
     *
     * @return verdadeiro se as duas datas forem iguais e
     * falso se não for
     */
    private static boolean compareDatas(final int diaUm,
            final int mesUm, final int anoUm, final int diaDois,
            final int mesDois, final int anoDois) {
        return anoUm == anoDois && mesUm == mesDois && diaUm == diaDois;
    }

    /**
     * Conta a diferença de dias entre uma data menor e outra maior
     * considerando um ano bissexto informado como parâmetro.
     *
     * @param dataOrigem Data de origem
     * @param dataDestino Data de destino
     * @param bissextoRef Ano bissexto de referência
     *
     * @return inteiro do número de dias de diferença entre
     * as datas fornecidas
     */
    public static int avancaData(final String dataOrigem,
            final String dataDestino, final int bissextoRef) {
        int diaOrigem = obtenhaDia(dataOrigem);
        int mesOrigem = obtenhaMes(dataOrigem);
        int anoOrigem = obtenhaAno(dataOrigem);
        final int diaDestino = obtenhaDia(dataDestino);
        final int mesDestino = obtenhaMes(dataDestino);
        final int anoDestino = obtenhaAno(dataDestino);
        int contadorDias = 0;
        final int dezembro = 12;

        while (!compareDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDestino, mesDestino, anoDestino)) {
            for (int j = mesOrigem; j <= dezembro; j++) {
                for (int i = diaOrigem; i <= obtenhaUltDiaDoMes(mesOrigem,
                        anoOrigem, bissextoRef); i++) {
                    if (compareDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDestino, mesDestino, anoDestino)) {
                        break;
                    }
                    diaOrigem++;
                    contadorDias++;
                }
                if (compareDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDestino, mesDestino, anoDestino)) {
                    break;
                }
                diaOrigem = 1;
                mesOrigem++;
            }
            if (compareDatas(diaOrigem, mesOrigem, anoOrigem,
                    diaDestino, mesDestino, anoDestino)) {
                break;
            }
            mesOrigem = 1;
            anoOrigem++;
        }

        return contadorDias;
    }

    /**
     * Conta a diferença de dias entre uma data maior e outra menor
     * considerando um ano bissexto informado como parâmetro.
     *
     * @param dataOrigem Data de origem
     * @param dataDestino Data de destino
     * @param bissextoRef Ano bissexto de referência
     *
     * @return inteiro do número de dias de diferença entre
     * as datas fornecidas
     */
    public static int recuaData(final String dataOrigem,
            final String dataDestino, final int bissextoRef) {
        int diaOrigem = obtenhaDia(dataOrigem);
        int mesOrigem = obtenhaMes(dataOrigem);
        int anoOrigem = obtenhaAno(dataOrigem);
        final int diaDestino = obtenhaDia(dataDestino);
        final int mesDestino = obtenhaMes(dataDestino);
        final int anoDestino = obtenhaAno(dataDestino);
        int contadorDias = 0;

        while (!compareDatas(diaOrigem, mesOrigem, anoOrigem,
                diaDestino, mesDestino, anoDestino)) {
            for (int j = mesOrigem; j > 0; j--) {
                for (int i = diaOrigem; i > 0; i--) {
                    if (compareDatas(diaOrigem, mesOrigem, anoOrigem,
                            diaDestino, mesDestino, anoDestino)) {
                        break;
                    }
                    diaOrigem = recuaDia(bissextoRef, diaOrigem,
                            mesOrigem, anoOrigem);
                    contadorDias++;
                }
                if (compareDatas(diaOrigem, mesOrigem, anoOrigem,
                        diaDestino, mesDestino, anoDestino)) {
                    break;
                }
                mesOrigem = recuaMes(mesOrigem);
                diaOrigem = obtenhaUltDiaDoMes(mesOrigem, anoOrigem,
                        bissextoRef);
            }
            if (compareDatas(diaOrigem, mesOrigem, anoOrigem,
                    diaDestino, mesDestino, anoDestino)) {
                break;
            }
            anoOrigem--;
        }

        return contadorDias;
    }

    /**
     * Retroage um dia numa data especificada
     * considerando o ano bissexto informado.
     *
     * @param diaRef Dia da data a recuar
     * @param mes Mês da data a recuar
     * @param ano Ano da data a recuar
     * @param bissextoRef Ano bissexto de referência
     *
     * @return inteiro representando o dia anterior
     * da data informada
     */
    private static int recuaDia(final int bissextoRef, final int diaRef,
        final int mes, final int ano) {
        int dia = diaRef;
        final int primeiroDia = 1;

        if (dia == primeiroDia) {
            dia = obtenhaUltDiaDoMes(mes - 1, ano, bissextoRef);
        } else {
            dia--;
        }
        return dia;
    }

    /**
     * Retroage um mês para o mês anterior.
     *
     * @param mesRef Mês da data a recuar
     *
     * @return inteiro representando o mês anterior
     * do mês informado
     */
    private static int recuaMes(final int mesRef) {
        int mes = mesRef;
        final int dezembro = 12;
        final int janeiro = 1;

        if (mes == janeiro) {
            mes = dezembro;
        } else {
            mes--;
        }
        return mes;
    }

    /**
     * Avança ao longo dos 7 dias da semana de acordo
     * com a quantidade de dias solicitado.
     *
     * @param qtdDia Quantidade dias a se avançar
     * @param diaSemanaRef Dia da semana inicial
     *
     * @return inteiro que representa o dia da semana
     * após a iteração
     */
    public static int avancaDiaDaSemana(final int qtdDia,
        final int diaSemanaRef) {
        int iteradorDia = diaSemanaRef;
        final int limiteDias = 7;

        for (int i = 0; i < qtdDia; i++) {
            iteradorDia++;
            if (iteradorDia == limiteDias) {
                iteradorDia = 0;
            }
        }

        return iteradorDia;
    }

    /**
     * Recua ao longo dos 7 dias da semana de acordo
     * com a quantidade de dias solicitado.
     *
     * @param qtdDia Quantidade dias a se recuar
     * @param diaSemanaRef Dia da semana inicial
     *
     * @return inteiro que representa o dia da semana
     * após a iteração
     */
    public static int recuaDiaDaSemana(final int qtdDia,
        final int diaSemanaRef) {
        int iteradorDia = diaSemanaRef;
        final int domingo = 6;

        for (int i = 0; i < qtdDia; i++) {
            iteradorDia--;
            if (iteradorDia == -1) {
                iteradorDia = domingo;
            }
        }

        return iteradorDia;
    }

    /**
     * Identifica se uma data enviada como String
     * no formato 'yyyymmdd' é maior, menor ou igual que uma
     * segunda data.
     *
     * @param dataOrigem Data de origem
     * @param dataDestino Data de destino
     *
     * @return Retorna 1 para maior, 0 para igual e -1
     * para menor
     */
    public static int obtenhaDataMaior(final String dataOrigem,
        final String dataDestino) {
        final int diaOrigem = obtenhaDia(dataOrigem);
        final int mesOrigem = obtenhaMes(dataOrigem);
        final int anoOrigem = obtenhaAno(dataOrigem);
        final int diaDestino = obtenhaDia(dataDestino);
        final int mesDestino = obtenhaMes(dataDestino);
        final int anoDestino = obtenhaAno(dataDestino);

        if (anoDestino == anoOrigem) {
            if (mesDestino == mesOrigem) {
                if (diaOrigem > diaDestino) {
                    return -1;
                } else if (diaOrigem == diaDestino) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mesDestino > mesOrigem) {
                return 1;
            } else {
                return -1;
            }
        } else if (anoDestino > anoOrigem) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Recebe vetor de Strings, analisa todos os casos
     * de excessão e, caso válido, executa a iteração
     * das datas.
     *
     * @param argumentos Vetor de Strings em que se espera
     * data de interesse, ano bissexto, data de referência e
     * dia da semana de referência
     *
     * @return Retorna -1 para inválido ou um int que representa
     * um dia da semana, começando em 0 para segunda-feira e
     * finalizando em 6 para domingo
     */
    public static int executaPrograma(final String[] argumentos) {
        final int um = 1;
        if (VerificaEntradaUtils.verifiqueValor(argumentos) != um) {
            return -1;
        }

        int resultado = -1;

        final int tres = 3;
        if (obtenhaDataMaior(argumentos[0],
        argumentos[2]) == 0) {
            resultado = Integer.parseInt(argumentos[tres]);
        }

        final int maior = 1;

        if (obtenhaDataMaior(argumentos[0],
        argumentos[2]) == maior) {
            resultado = avancaDiaDaSemana(avancaData(
                argumentos[0],
                argumentos[2],
                Integer.parseInt(argumentos[1])),
                Integer.parseInt(argumentos[tres]));
        }

        final int menor = -1;

        if (obtenhaDataMaior(argumentos[0],
        argumentos[2]) == menor) {
            resultado = recuaDiaDaSemana(recuaData(
                argumentos[0],
                argumentos[2],
                Integer.parseInt(argumentos[1])),
                Integer.parseInt(argumentos[tres]));
        }

        return resultado;
    }
}
