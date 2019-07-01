/**
 * Implementação em Java dos 21 algoritmos propostos na aula 01.
 *
 * @author gustavohenriquerssilva - Gustavo Henrique Rodrigues Santos Silva
 */

package main.java.com.github.gustavohenriquerssilva.cs.aula1.domain;

public final class Exercicios {

    private Exercicios() {
    };

    /**
     * Obtém quadrado da soma das dezenas da entrada resulta no próprio número.
     *
     * @param valorTestado O valor passado para ser avaliado.
     * @return Resposta se o valor corresponde a propriedade 3025.
     * @throws IllegalArgumentException Se é menor que zero ou maior que 9999.
     */

    public static boolean ehPropriedade3025(final int valorTestado) {
        final int valorMaxParam3025 = 9999;
        final int valorMinParam3025 = 0;

        if (valorTestado > valorMaxParam3025 || valorTestado < valorMinParam3025) {
            throw new IllegalArgumentException(
                    "Valor inserido não" + " pode ser " + "menor que zero ou maior que 9999");
        }

        final int centena = valorTestado / 100;
        final int dezena = valorTestado % 100;
        final int somaDosValores = centena + dezena;
        final int potencia = somaDosValores * somaDosValores;

        return valorTestado == potencia;
    }

    /**
     * Verfica se o número passado satisfaz a propriedade 153.
     *
     * @param valorTestado O valor passado para ser avaliado.
     * @return Resposta se o valor corresponde a propriedade 3025.
     * @throws IllegalArgumentException Se é menor que 100 ou maior que 999.
     */

    public static boolean ehPropriedade153(final int valorTestado) {

        final int valorMaxParam153 = 999;
        final int valorMinParam153 = 100;
        if (valorTestado > valorMaxParam153 || valorTestado < valorMinParam153) {
            throw new IllegalArgumentException("Valor inserido não pode ser" + "menor que 100 ou maior que 999");
        }

        final int centena = valorTestado / 100;
        final int dezena = valorTestado % 100;
        final int centenaAux = dezena / 10;
        final int dezenaAux = dezena % 10;

        final int potenciaCubica1 = centena * centena * centena;
        final int potenciaCubica2 = centenaAux * centenaAux * centenaAux;
        final int potenciaCubica3 = dezenaAux * dezenaAux * dezenaAux;

        final int resultadoFinal = potenciaCubica1 + potenciaCubica2 + potenciaCubica3;

        return valorTestado == resultadoFinal;
    }

    /**
     * Algoritmo que define o dia da semana para uma data.
     *
     * @param dia O dia avaliado.
     * @param mes O mês avaliado.
     * @param ano O ano avaliado
     * @return Dia da semana corresponde ao dia, mês e ano passado.
     * @throws IllegalArgumentException Se o dia menor que 1 ou maior que 31.
     * @throws IllegalArgumentException Se o mês menor que 1 ou maior que 12.
     * @throws IllegalArgumentException Se o ano menor que 1753.
     */
    public static int obtenhaDiaDaSemana(final int dia, final int mes, final int ano) {

        geraExcecaoSeDataInvalida(dia, mes, ano);

        int mesAuxiliar = mes;
        int anoAuxiliar = ano;
        if (mes == 1 || mes == 2) {
            final int mesMais = 12;
            final int anoMenos = 1;
            mesAuxiliar = mes + mesMais;
            anoAuxiliar = ano - anoMenos;
        }

        final int tresMes = 3;
        final int cincoAno = 5;
        final int quatroAno = 4;
        final int cemAno = 100;
        final int quatrocentosAno = 400;
        final int seteDia = 7;

        final int resultado = dia + (2 * mesAuxiliar) + (tresMes * (mesAuxiliar + 1) / cincoAno) + anoAuxiliar
                + (anoAuxiliar / quatroAno) - (anoAuxiliar / cemAno) + (anoAuxiliar / quatrocentosAno);

        final int diasDaSemana = seteDia;
        return resultado % diasDaSemana;
    }

    /**
     * Gera exceção se a data recebida estiver invalida.
     *
     * @param dia Dia a ser verificado.
     * @param mes Mês a ser verificado.
     * @param ano Ano a ser verificado.
     *
     * @throws IllegalArgumentException Se qualquer um dos argumentos não estiver
     *                                  dentro dos parâmetros de data.
     */
    private static void geraExcecaoSeDataInvalida(final int dia, final int mes, final int ano) {

        final int maxDiasNoMes = 31;
        final int minDiasNoMes = 1;
        final boolean ehDiaInvalido = dia > maxDiasNoMes || dia < minDiasNoMes;
        if (ehDiaInvalido) {
            throw new IllegalArgumentException("Dia inválido");
        }

        final int maxMesesNoAno = 12;
        final int minMesesNoAno = 1;
        final boolean ehMesInvalido = mes > maxMesesNoAno || mes < minMesesNoAno;
        if (ehMesInvalido) {
            throw new IllegalArgumentException("Mês inválido");
        }

        final int valorMinParaAno = 1754;
        final boolean ehAnoValido = ano < valorMinParaAno;
        if (ehAnoValido) {
            throw new IllegalArgumentException("Ano deve ser maior que 1754");
        }
    }

    /**
     * Obtém resto da divisão.
     *
     * @param divisor   O divisor da divisão.
     * @param dividendo O dividendo da divisão.
     * @return O resto da divisão.
     * @throws IllegalArgumentException Se o dividendo for menor que zero.
     * @throws IllegalArgumentException Se o divisor for menor que um.
     */
    public static int obtenhaResto(final int dividendo, final int divisor) {

        final boolean ehDividendoValido = dividendo < 0;
        if (ehDividendoValido) {
            throw new IllegalArgumentException("Dividendo deve ser " + "maior ou igual a 0");
        }

        final boolean ehDivisorValido = divisor < 1;
        if (ehDivisorValido) {
            throw new IllegalArgumentException("Divisor deve ser maior que 0");
        }

        int s = dividendo;
        while (divisor <= s) {
            s = s - divisor;
        }

        return s;
    }

    /**
     * Obtém soma primeiros números naturais.
     *
     * @param numero O valor a ser avaliado.
     * @return O somatório para os primeiros k naturais.
     * @throws IllegalArgumentException Se o numero for menor que um.
     */
    public static int obtenhaSomaPrimeirosNaturais(final int numero) {

        final int valorMinSoma = 1;
        if (numero < valorMinSoma) {
            throw new IllegalArgumentException("É permitido somente números " + "naturais e diferente de zero");
        }

        int index = 2;
        int soma = 1;
        while (index <= numero) {
            soma = soma + index;
            index++;
        }

        return soma;
    }

    /**
     * Obtém o fatorial de um número natural.
     *
     * @param numero O valor a ser encontrado o fatorial corresponde.
     * @return O fatorial do número natural.
     * @throws IllegalArgumentException Se o numero for menor que um.
     */
    public static int obtenhaFatorial(final int numero) {

        final int valorMinFatorial = 1;
        if (numero < valorMinFatorial) {
            throw new IllegalArgumentException("É permitido somente números " + "naturais e diferente de zero");
        }

        int index = 2;
        int fatorial = 1;
        while (index <= numero) {
            fatorial = fatorial * index;
            index++;
        }

        return fatorial;
    }

    /**
     * Obtém o produto de dois inteiros positivos.
     *
     * @param multiplicador O primeiro valor da multiplicação.
     * @param multiplicando O segundo valor da multiplicação.
     * @return O produto dos dois números.
     * @throws IllegalArgumentException Se o a ou b forem menores que zero.
     */
    public static int obtenhaProdutoDeInteirosUsandoSomas(final int multiplicador, final int multiplicando) {

        if (multiplicador < 0) {
            throw new IllegalArgumentException("Multiplicador deve " + "ser maior que zero");
        }

        if (multiplicando < 0) {
            throw new IllegalArgumentException("Multiplicando deve " + "ser maior que zero");
        }

        int totalParcelas = multiplicador;
        int parcela = multiplicando;
        if (multiplicando < multiplicador) {
            totalParcelas = multiplicando;
            parcela = multiplicador;
        }

        int index = 1;
        int soma = 0;
        while (index <= totalParcelas) {
            soma = soma + parcela;
            index++;
        }

        return soma;
    }

    /**
     * Obtém potência usando apenas somas.
     *
     * @param base     O valor da base.
     * @param expoente O valor da potência.
     * @return O resultado da potencia.
     * @throws IllegalArgumentException Se o x ou y forem menores que zero.
     */
    public static int obtenhaPotenciaUsandoAsSomas(final int base, final int expoente) {

        if (base < 0 || expoente < 0) {
            throw new IllegalArgumentException("É permitido somente" + " números naturais");
        }

        int potencia = 1;
        int index = 1;
        while (index <= expoente) {
            potencia = obtenhaProdutoDeInteirosUsandoSomas(potencia, base);
            index++;
        }
        return potencia;
    }

    /**
     * Obtém valor de pi com uma precisão.
     *
     * @param precisao O valor de precisão para o pi.
     * @return O valor de pi.
     * @throws IllegalArgumentException Se o valor de precissão for menor que um.
     */
    public static double obtenhaValorPi(final int precisao) {

        final int valorMinPi = 1;
        if (precisao < valorMinPi) {
            throw new IllegalArgumentException("É permitido somente " + "números maiores que um");
        }

        double sinal = -1;
        double divisor = -1;
        double piValor = 0;

        for (int contador = 1; contador <= precisao; contador++) {
            final int auxiliar = 4;
            divisor = divisor + 2;
            sinal = -1 * sinal;
            piValor = piValor + ((auxiliar * sinal) / divisor);
        }

        return piValor;
    }

    /**
     * Obtém valor do logaritmo.
     *
     * @param base           O valor é númerador.
     * @param valorLogaritmo O valor é denominador.
     * @return O valor do logaritmo.
     * @throws IllegalArgumentException Se o valor base for menor que 1.
     * @throws IllegalArgumentException Se o valor valorLogaritmo for menor que 2.
     */
    public static double obtenhaLogaritmoNatural(final int base, final int valorLogaritmo) {

        final int valorMinBase = 1;
        if (base < valorMinBase) {
            throw new IllegalArgumentException("Base deve ser maior que zero");
        }

        final int valorMinLog = 2;
        if (valorLogaritmo < valorMinLog) {
            throw new IllegalArgumentException("Número logaritmo deve ser maior que um");
        }

        int contador = 2;
        double euler = contador + base;
        double numerador = base;
        double denominador = 1;

        for (; contador <= valorLogaritmo; contador++) {
            numerador = numerador * numerador;
            denominador = denominador * contador;
            euler = euler + (numerador / denominador);
        }

        return euler;
    }

    /**
     * Obtém razão áurea.
     *
     * @param anterior  O valor do primeiro inteiro positivo.
     * @param posterior O valor do segundo inteiro positivo.
     * @param limite    O valor da precisão desejada.
     * @return O valor da razão áurea.
     * @throws IllegalArgumentException Se o valor anterior for menor que zero ou
     *                                  posterior for menor que x ou limite for
     *                                  menor que 1.
     */
    public static double obtenhaRazaoAurea(final int anterior, final int posterior, final int limite) {

        final int valorMinAnt = 0;
        final int valorMinLim = 0;
        if (anterior < valorMinAnt || posterior < anterior || limite <= valorMinLim) {
            throw new IllegalArgumentException("Valor anterior deve" + " ser menor que 0"
                    + " posterior maior que anterior" + " e limite maior que 0.");
        }

        double auxiliarPosterior = posterior;
        double auxiliarAnterior = anterior;

        for (int contador = 1; contador <= limite; contador++) {
            final double troca = auxiliarPosterior;
            auxiliarPosterior = auxiliarPosterior + auxiliarAnterior;
            auxiliarAnterior = troca;
        }

        return auxiliarPosterior / auxiliarAnterior;
    }

    /**
     * Calcula se quadrado perfeito n^2 satisfaz a equação.
     *
     * @param valorEntrada O valor a ser testado.
     * @return Retorna verdadeiro se o número fornecido é um quadrado perfeito.
     * @throws IllegalArgumentException Se o valor valorEntrada for menor que 1.
     */
    public static boolean ehQuadradoPerfeito(final int valorEntrada) {

        final int valorMinQuadrado = 1;
        if (valorEntrada < valorMinQuadrado) {
            throw new IllegalArgumentException("É permitido somente números " + "naturais e diferente de zero");
        }

        int index = 1;
        int soma = 1;
        while (soma < valorEntrada) {
            index = index + 2;
            soma = soma + index;
        }

        return soma == valorEntrada;
    }

    /**
     * Obtém a raiz quadrada do valor.
     *
     * @param valorEntrada O valor de entrada
     * @param precisao     O valor de precisão
     * @return {boolean} Retorna verdadeiro se o número fornecido é um quadrado
     *         perfeito.
     * @throws IllegalArgumentException Se o valor n for menor que zero.
     */
    public static int obtenhaRaizQuadrada(final int valorEntrada, final double precisao) {

        final int valorMinRaizQuad = 0;
        if (valorEntrada < valorMinRaizQuad) {
            throw new IllegalArgumentException("É permitido somente " + "números naturais");
        }

        double precisaoAux = precisao;
        int raiz = 1;
        while (0 <= precisaoAux) {
            raiz = (raiz + (valorEntrada / raiz)) / 2;
            precisaoAux--;
        }

        return raiz;
    }

    /**
     * Calcula se o valor é primo.
     *
     * @param numeroEntrada O valor de entrada
     * @return Retorna verdadeiro se o número fornecido é primo
     * @throws IllegalArgumentException Se o valor numeroEntrada for menor ou igual
     *                                  a um.
     */
    public static boolean ehNumeroPrimo(final int numeroEntrada) {

        final int valorMinPrimo = 1;
        if (numeroEntrada <= valorMinPrimo) {
            throw new IllegalArgumentException("É permitido somente " + "números maiores que um");
        }

        int index = 2;
        while (index < numeroEntrada) {
            if (numeroEntrada % index == 0) {
                return false;
            }
            index++;
        }

        return true;
    }

    /**
     * Calcula se o número é primo.
     *
     * @param numeroEntrada O valor de entrada
     * @return Retorna o valor {@code true} se for um número primo e o valor
     *         {@code false} caso não seja.
     * @throws IllegalArgumentException Se numero não for maior ou igual a 2.
     */
    public static boolean crivoErastotenes(final int numeroEntrada) {

        final int valorMinCrivo = 2;
        if (numeroEntrada < valorMinCrivo) {
            throw new IllegalArgumentException("Valor de entrada deve " + "ser maior que 2");
        }

        int[] vetor = new int[numeroEntrada + 1];

        for (int contador = 1; contador < numeroEntrada + 1; contador++) {
            vetor[contador] = 0;
        }

        final double limite = Math.floor(Math.sqrt(numeroEntrada));

        for (int contador = 2; contador <= limite; contador++) {
            if (vetor[contador] == 0) {
                int multiplo = contador + contador;
                while (multiplo <= numeroEntrada) {
                    vetor[multiplo] = 1;
                    multiplo = multiplo + contador;
                }
            }
        }

        return vetor[numeroEntrada] == 1;
    }

    /**
     * Obtém o MDC entre dois inteiros positivos e não nulos é o maior valor dentre
     * os divisores comuns entre eles.
     *
     * @param primeiroValor O valor do primerio número a ser avaliado
     * @param segundoValor  O valor do segundo número a ser avaliado
     * @return Retorna o mdc
     * @throws IllegalArgumentException Se o valor n for menor ou igual a um.
     */
    public static int obtenhaMDC1(final int primeiroValor, final int segundoValor) {

        final int valorMinMDC1 = 1;
        if (segundoValor > primeiroValor || segundoValor < valorMinMDC1) {
            throw new IllegalArgumentException("Valores informados " + "estão incorretos");
        }

        int primeiroValorAux = primeiroValor;
        int segundoValorAux = segundoValor;

        while (segundoValorAux != 0) {
            final int resto = primeiroValorAux % segundoValorAux;
            primeiroValorAux = segundoValorAux;
            segundoValorAux = resto;
        }

        return primeiroValorAux;
    }

    /**
     * Obtém maior divisor comum.
     *
     * @param primeiroValor Número maior divisor comum.
     * @param segundoValor  Número do maior divisor comum.
     * @return Retorna maior divisor comum.
     * @throws IllegalArgumentException Se primeiroValor não for maior ou igual a
     *                                  numeroDois ou se segundoValor não for maior
     *                                  que 0.
     */
    public static int obtenhaMDC2(final int primeiroValor, final int segundoValor) {

        final int valorMinMDC2 = 1;
        if (primeiroValor < segundoValor || segundoValor < valorMinMDC2) {
            throw new IllegalArgumentException("Valores informados" + "estão incorretor");
        }

        int primeiroValorAux = primeiroValor;
        int segundoValorAux = segundoValor;
        while (primeiroValorAux != segundoValorAux) {
            if (primeiroValorAux > segundoValorAux) {
                primeiroValorAux = primeiroValorAux - segundoValorAux;
            } else {
                segundoValorAux = segundoValorAux - primeiroValorAux;
            }
        }

        return primeiroValorAux;
    }

    /**
     * Verifica, com a regra de Horner, para avaliação de polinômio.
     *
     * @param valor Número para cálculo da regra de Horner.
     * @param total Número para cálculo da regra de Horner.
     * @param vetor Vetor para cálculo da regra de Horner.
     * @return Retorna regra de Horner.
     * @throws IllegalArgumentException Se total não for maior ou igual a 1.
     */
    public static double obtenhaValorDaRegraDeHorner(final double valor, final int total, final int[] vetor) {

        final int valorMinHorner = 1;
        if (total < valorMinHorner) {
            throw new IllegalArgumentException("Valor total maior ou igual a 1.");
        }

        double polinomio = vetor[total];

        for (int contador = total - 1; contador >= 0; contador--) {
            polinomio = polinomio * (valor + vetor[contador]);
        }

        return polinomio;
    }

    /**
     * Cálculo de Fibonacci.
     *
     * @param valorEntrada Número de entrada para cálculo de Fibonacci.
     * @return Retorna número de Fibonacci.
     * @throws IllegalArgumentException Se numero não for maior ou igual a 0.
     */
    public static int obtenhaFibonacci(final int valorEntrada) {

        final int valorMinFibonacci = 0;
        if (valorEntrada < valorMinFibonacci) {
            throw new IllegalArgumentException("É permitido somente valor inteiro");
        }

        final int valorEntr1 = 0;
        final int valorEntr2 = 1;
        if (valorEntrada == valorEntr1 || valorEntrada == valorEntr2) {
            return valorEntrada;
        }

        int auxiliar = 0;
        int resultado = 1;

        for (int contador = 2; contador <= valorEntrada; contador++) {
            final int troca = resultado;
            resultado = resultado + auxiliar;
            auxiliar = troca;
        }

        return resultado;
    }

    /**
     * Confere se CPF é válido.
     *
     * @param digitoCPF Array com cpf para conferir.
     * @return Retorna o true se o CPF for válido
     */
    public static boolean ehCPFValido(final int[] digitoCPF) {

        verificaExcecaoCpfInvalido(digitoCPF);

        final int primeiraPosicao = 2;
        final int segundaPosicao = 3;
        final int terceiraPosicao = 4;
        final int quartaPosicao = 5;
        final int quintaPosicao = 6;
        final int sextaPosicao = 7;
        final int setimaPosicao = 8;
        final int oitavaPosicao = 9;
        final int novaPosicao = 10;
        final int decimaPosicao = 11;

        final int primeiraCompar = digitoCPF[0] + primeiraPosicao * (digitoCPF[1]) + segundaPosicao * (digitoCPF[2])
                + terceiraPosicao * (digitoCPF[segundaPosicao]) + quartaPosicao * (digitoCPF[terceiraPosicao])
                + quintaPosicao * (digitoCPF[quartaPosicao]) + sextaPosicao * (digitoCPF[quintaPosicao])
                + setimaPosicao * (digitoCPF[sextaPosicao]) + oitavaPosicao * (digitoCPF[setimaPosicao]);

        final int segundaComparacao = digitoCPF[1] + primeiraPosicao * (digitoCPF[2])
                + segundaPosicao * (digitoCPF[segundaPosicao]) + terceiraPosicao * (digitoCPF[terceiraPosicao])
                + quartaPosicao * (digitoCPF[quartaPosicao]) + quintaPosicao * (digitoCPF[quintaPosicao])
                + sextaPosicao * (digitoCPF[sextaPosicao]) + setimaPosicao * (digitoCPF[setimaPosicao])
                + oitavaPosicao * (digitoCPF[oitavaPosicao]);

        final int vetorComparaUm = Math.floorMod(Math.floorMod(primeiraCompar, decimaPosicao), novaPosicao);

        final int vetorComparaDois = Math.floorMod(Math.floorMod(segundaComparacao, decimaPosicao), novaPosicao);

        return vetorComparaUm == digitoCPF[oitavaPosicao] && vetorComparaDois == digitoCPF[novaPosicao];
    }

    /**
     * Confere se CPF é válido.
     *
     * @param digitoCPF Array com cpf para conferir.
     * @return Retorna o true se o CPF for válido
     */
    public static boolean ehCPFValido2(final int[] digitoCPF) {

        verificaExcecaoCpfInvalido(digitoCPF);

        final int sextaPosicao = 7;
        final int setimaPosicao = 8;
        final int oitavaPosicao = 9;
        final int novaPosicao = 10;
        final int decimaPosicao = 11;

        int aux1 = digitoCPF[setimaPosicao];
        int aux2 = digitoCPF[setimaPosicao];

        for (int contador = sextaPosicao; 0 <= contador; contador--) {
            aux1 = aux1 + digitoCPF[contador];
            aux2 = aux2 + aux1;
        }

        final int primeiraCompar = Math.floorMod(Math.floorMod(aux2, decimaPosicao), novaPosicao);
        final int segundaComparacao = Math.floorMod(
                Math.floorMod(aux2 - aux1 + (oitavaPosicao * digitoCPF[oitavaPosicao]), decimaPosicao), novaPosicao);

        return primeiraCompar == digitoCPF[oitavaPosicao] && segundaComparacao == digitoCPF[novaPosicao];
    }

    /**
     * Verificação se o CPF é váligo.
     *
     * @param digitoCPF Array com cpf para conferir.
     */
    public static void verificaExcecaoCpfInvalido(final int[] digitoCPF) {

        if (digitoCPF == null) {
            throw new IllegalArgumentException("CPF não informado");
        }

        final int maxDigTotal = 11;
        if (digitoCPF.length != maxDigTotal) {
            throw new IllegalArgumentException("CPF deve ter exatos 11 digitos");
        }

        final int maxDigParcial = 9;

        for (int contador = 0; contador < maxDigParcial; contador++) {
            if (digitoCPF[contador] < 0 || digitoCPF[contador] > maxDigParcial) {
                throw new IllegalArgumentException("CPF incorreto, fora da formatação.");
            }
        }
    }
}
