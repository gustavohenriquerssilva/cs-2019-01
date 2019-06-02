

/**
 * Verfica se o número passado satisfaz a propriedade 3025
 * 
 * @param valorTestado O valor passado para ser avaliado.
 * 
 * @returns {boolean} Resposta se o valor corresponde a propriedade 3025. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se é menor que zero ou maior que 9999.
 */
function ehPropriedade3025(valorTestado) {
	if (typeof numero != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (numero < 0 || numero > 9999) {
		return RangeError("Valor inserido não pode ser menor que zero ou maior que 9999.");
	}

	var centena = valorTestado / 100;
	var dezena = valorTestado % 100;
	var resultadoFinal = (centena + dezena) * (centena + dezena);

	return valorTestado == resultadoFinal;
}

/**
 * Verfica se o número passado satisfaz a propriedade 153
 * 
 * @param valorTestado O valor passado para ser avaliado.
 * 
 * @returns {boolean} Resposta se o valor corresponde a propriedade 153. 
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se é menor que 100 ou maior que 999.
 */
function ehPropriedade153(valorTestado) {
	if (typeof numero != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (numero < 100 || numero > 999) {
		return Error("Valor inserido não pode ser menor que 100 ou maior que 999.");
	}

	var centena = numero / 100;
	var centena = Math.trunc(centena);
	var dezenaAux = numero % 100;
	var dezena = dezenaAux / 10;
	var dezena = Math.trunc(dezena);
	var unidade = numero % 10;

	var resultado = (Math.pow(centena, 3)) + (Math.pow(dezena, 3)) + (Math.pow(unidade, 3));
	resultado = Math.trunc(resultado);

	return (resultado == numero);
}

/**
 * Algoritmo que define o dia da semana para uma data 
 * 
 * @param dia O dia avaliado.
 * @param mes O mês avaliado.
 * @param ano O ano avaliado
 *
 * @returns {int} Dia da semana corresponde ao dia, mês e ano passado.
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o dia menor que 1 ou maior que 31.
 * @throws {RangeError} Se o mês menor que 1 ou maior que 12.
 * @throws {RangeError} Se o ano menor que 1753.
 */
function obtenhaDiaDaSemana(dia, mes, ano) {
	if (typeof dia != 'number' || typeof mes != 'number' || typeof ano != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	const ehDiaInvalido = dia > 31 || dia < 1;
	if (ehDiaValido) {
		return RangeError("Data incorreta");
	}

	const ehMesValido = mes > 12 || mes < 1;
	if (ehMesValido) {
		return RangeError("Mês incorreta");
	}

	const ehAnoValido = ano < 1753;
	if (ehAnoValido) {
		return RangeError("Ano incorreto");
	}

	if (mes == 1 || mes == 2) {
		mes = mes + 12;
		ano = ano--;
	}

	var resultado;
	resultado = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);
	resultado = (resultado % 7);
	resultado = Math.trunc(resultado);

	return resultado;
}

/**
 * Função matemática que retorna o resto da divisão
 * 
 * @param divisor O divisor da divisão
 * @param dividendo O dividendo da divisão
 *
 * @returns {int} O resto da divisão
 * 
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o dividendo for menor que zero e divisor menor que um
 * @throws {RangeError} Se o mês menor que 1 ou maior que 12.
 * @throws {RangeError} Se o ano menor que 1753.
 */
function obtenhaResto(dividendo, divisor) {
	if (typeof dividendo != 'number' || typeof divisor != 'number') {
		return TypeError("Um(ou mais) parâmetro(s) não é um número.");
	}

	if (dividendo < 0 && divisor < 1) {
		return RangeError("Divisor deve ser maior que 0 e dividendo deve ser maior ou igual a 0.");
	}

	var resto;

	resto = dividendo;

	while (divisor <= resto) {
		resto = resto - divisor;
	}

	return resto;
}

/**
 * Função matemática que soma primeiros números naturais 
 * 
 * @param numero O valor a ser avaliado
 *
 * @returns {int} O somatório para os primeiros k naturais
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o numero for menor que um
 */
function obtenhaSomaPrimeirosNaturais(numero) {
	if (typeof numero != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (numero < 1) {
		return RangeError("Numero deve ser maior que 1.");
	}

	var i = 2;
	var s = 1;
	while (i <= numero) {
		s = s + i;
		i++;
	}

	return s;
}

/**
 * Função matemática que obtém o fatorial de um número natural.
 * 
 * @param numero O valor a ser encontrado o fatorial corresponde
 *
 * @returns {int} O fatorial do número natural
*
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o numero for menor que um
 */
function obtenhaFatorial(numero) {
	if (typeof numero != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (numero < 1) {
		return RangeError("Numero deve ser maior que 1.");
	}

	var i = 2;
	var f = 1;

	while (i <= numero) {
		f = f * i;
		i++;

	}
	return f;
}

/**
 * Função matemática que obtém o produto de dois inteiros positivos
 * 
 * @param multiplicador O primeiro valor da multiplicação
 * @param multiplicando O segundo valor da multiplicação
 *
 * @returns {int} O produto dos dois números
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o multiplicador ou multiplicando forem menores que zero
 */
function obtenhaProdutoDeInteirosUsandoSomas(multiplicador, multiplicando) {
	if (typeof multiplicador != 'number' || typeof multiplicando != 'number') {
		return TypeError("Este(s) parâmetro(s) não é um número.");
	}

	if (multiplicador < 0 || multiplicando < 0) {
		return RangeError("É permitido somente números naturais.");
	}

	var totalParcelas;
	var parcela;

	totalParcelas = multiplicador;
	parcela = multiplicando;

	if (multiplicando < multiplicador) {
		totalParcelas = multiplicando;
		parcela = multiplicador;
	}

	var i;
	var s;

	i = 1;
	s = 0;

	while (i <= totalParcelas) {
		s = s + parcela;
		i = i + 1;
	}

	return s;
}

/**
 * Função matemática que implementa potência usando apenas somas.
 * 
 * @param base O valor da base
 * @param expoente O valor da potência
 *
 * @returns {int} O resultado da potencia
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o base ou expoente forem menores que zero
 */
function obtenhaPotenciaUsandoAsSomas(base, expoente) {
	if (typeof base != 'number' || typeof expoente != 'number') {
		return TypeError("Este(s) parâmetro(s) não é um número.");
	}

	if (base < 0 || expoente < 0) {
		return RangeError("É permitido somente números naturais.");
	}

	var potencia = 1;
	var i = 1;
	while (i <= expoente) {
		potencia = obtenhaProdutoDeInteirosUsandoSomas(potencia, base);
		i++;
	}

	return potencia;
}

/**
 * Função matemática que obtém valor de pi
 * 
 * @param valorDePrecisao O valor de precisão para o pi
 *
 * @returns {double} O valor de pi
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor de precissão for menor que um
 */
function obtenhaValorPi(valorDePrecisao) {
	if (typeof valorDePrecisao != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (valorDePrecisao < 1) {
		return RangeError("Numero não é maior ou igual a 1.");
	}

	var i = 1;
	var s = -1;
	var d = -1;
	var p = 0;
	while (i <= valorDePrecisao) {
		d = d + 2;
		s = -1 * s;
		p = p + ((4 * s) / d);
		i++;
	}

	return p;
}

/** 
 * Função matemática que obtém valor do logaritmo 
 * 
 * @param base O valor é a base 
 * @param valorLogaritmo O valor é valor Logaritmo
 *
 * @returns {double} O valor do logaritmo
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor base for menor que 1
 * @throws {RangeError} Se o valor valorLogaritmo for menor que 2
 */
function obtenhaLogaritmoNatural(base, valorLogaritmo) {
	if (typeof base != 'number' || typeof valorLogaritmo != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (base < 1) {
		return RangeError("Numerador deve ser maior que zero");
	}

	if (valorLogaritmo < 2) {
		return RangeError("Denominador deve ser maior que um");
	}

	var i = 2;
	var e = (i + base);
	var numerador = base;
	var denominador = 1;

	while (i <= valorLogaritmo) {
		numerador = (numerador * numerador);
		denominador = (denominador * i);
		e = e + (numerador / denominador);
		i = i + 1;
	}

	return e;
}

/** 
 * Função matemática que obtém razão áurea
 * 
 * @param anterior O valor do primeiro inteiro positivo
 * @param posterior O valor do segundo inteiro positivo
 * @param limite O valor da precisão desejada
 *
 * @returns {double} O valor da razão áurea
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor anterior for menor que zero ou posterior for menor que anterior ou limite for menor que 1
 */
function obtenhaRazaoAurea(anterior, posterior, limite) {
	if (typeof anterior != 'number' || typeof posterior != 'number' || typeof limite != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (anterior < 0 || posterior < anterior || limite <= 0) {
		return RangeError("x deve ser maior ou igual a 0, y deve ser maior que x e k maior que 0.");
	}

	var c = posterior;
	var a = anterior;
	var i = 1;

	while (i <= limite) {
		var t = c;
		c = c + a;
		a = t;
		i++;
	}

	return c / a;
}

/** 
 * Função matemática diz que um quadrado perfeito n^2 satisfaz a equação.
 * 
 * @param valorEntrada O valor a ser testado.
 *
 * @returns {boolean} Retorna verdadeiro se o número fornecido é um quadrado perfeito.
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor valorEntrada for menor que 1.
 */
function ehQuadradoPerfeito(valorEntrada) {
	if (typeof valorEntrada != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (valorEntrada < 1) {
		return RangeError("É permitido somente números naturais e diferente de zero.");
	}

	var i = 1;
	var s = 1;

	while (s < valorEntrada) {
		i = i + 2;
		s = s + i;
	}

	return s == valorEntrada;
}

/** 
 * Função matemática que obtém a raiz quadrada do valor
 * 
 * @param numero O valor de entrada 
 * @param i O valor de precisão 
 *
 * @returns {boolean} Retorna verdadeiro se o número fornecido é um quadrado perfeito.
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor n for menor que zero.
 */
function obtenhaRaizQuadrada(numero, valorDePrecisao) {
	if (typeof numero != 'number' || typeof valorDePrecisao != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (numero < 0) {
		return RangeError("É permitido somente números naturais.");
	}

	var r = 1;
	while (0 <= valorDePrecisao) {
		r = (r + (numero / r)) / 2;
		valorDePrecisao--;
	}

	return r;
}

/** 
 * Função matemática que retorna se o valor é primo
 * 
 * @param valorEntrada O valor de entrada 
 *
 * @returns {boolean} Retorna verdadeiro se o número fornecido é primo
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor n for menor ou igual a um.
 */
function ehNumeroPrimo(valorEntrada) {
	if (typeof valorEntrada != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (valorEntrada <= 1) {
		return RangeError("É permitido somente números maiores que um.");
	}

	var i = 2;
	while (i < valorEntrada) {
		if (valorEntrada % i == 0) {
			return false;
		}
		i++;
	}

	return true;
}

/**Função matmática que calcula o Crivo de Eratostenes.
 *
 * @param {number} vetor vetor utilizado na operação
 *
 * @returns {number} Retorna o valor do Crivo de Eratostenes
 */
function ehCrivoErastostenes(valorEntrada) {
	if (typeof valorEntrada != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (valorEntrada < 2) {
		return RangeError("n deve ser maior ou igual a 2.");
	}

	var a = [];

	for (var i = 1; i < valorEntrada + 1; i++) {
		a[i] = 0;
	}

	var i = 2;
	var limite = Math.floor((Math.sqrt(valorEntrada)));

	while (i <= limite) {
		if (a[i] == 0) {
			var multiplo = i + i;
			while (multiplo <= valorEntrada) {
				a[multiplo] = 1;
				multiplo = multiplo + i;
			}
		}
		i = i + 1;
	}
	return (a[valorEntrada] == 1);
}

/** 
 * Função matemática que obtém o MDC entre dois inteiros positivos e não nulos é o maior valor dentre os divisores comuns entre eles.
 * 
 * @param primerioValor O valor do primerio número a ser avaliado
 * @param segundoValor O valor do segundo número a ser avaliado
 *
 * @returns {boolean} Retorna o mdc
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor n for menor ou igual a um.
 */
function obtenhaMDC(primerioValor, segundoValor) {

	if (typeof primerioValor != 'number' || typeof segundoValor != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (primerioValor < segundoValor || segundoValor < 1) {
		return RangeError("a deve ser maior ou igual a b e b deve ser maior que 0.");
	}

	var m;

	while (segundoValor != 0) {
		m = primerioValor % segundoValor;
		primerioValor = segundoValor;
		segundoValor = m;
	}

	return primerioValor;
}

/** 
 * Função matemática que obtém o MDC entre dois inteiros positivos e não nulos é o maior valor dentre os divisores comuns entre eles.
 * 
 * @param primerioValor O valor do primerio número a ser avaliado
 * @param segundoValor O valor do segundo número a ser avaliado
 *
 * @returns {boolean} Retorna o mdc
 *
 * @throws {TypeError} Se qualquer um dos argumentos não for um número.
 * @throws {RangeError} Se o valor n for menor ou igual a um.
 */
function obtenhaMDC2(primeiroValor, segundoValor) {
	if (typeof primeiroValor != 'number' || typeof segundoValor != 'number') {
		return TypeError("Este parâmetro não é um número.");
	}

	if (primeiroValor < segundoValor || segundoValor < 1) {
		return RangeError("a deve ser maior ou igual a b e b deve ser maior que 0.");
	}

	while (primeiroValor != segundoValor) {
		if (primeiroValor > segundoValor) {
			primeiroValor = primeiroValor - segundoValor;
		}

		else {
			segundoValor = segundoValor - primeiroValor;
		}
	}

	return primeiroValor;
}

/**Função que avalia um polinômio de acordo com a regra de Horner.
 *
 * @param {number} numero inteiro utilizado no calculo
 * @param {number} vetor inteiro que representa o polinomio
 *
 * @returns {number} Retorna o resultado do polinomio
 */
function obtenhaAvaliacaoPolinonimo(valor, total, vetor) {

	if (vetor == null || !Array.isArray(vetor)) {
        throw new TypeError("Este parâmetro não é um vetor");
    }

    let index = 0;

    for (index; index < vetor.length; index++) {
        if (typeof vetor[index] != "number") {
            throw new RangeError("O vetor deve conter somente"
            + "números inteiros");
        }
    }

    if (typeof numero != "number") {
        throw new TypeError("Este parâmetro não é um número");
    }

    if (vetor.length < 1) {
        throw new RangeError("Vetor não pode conter menos de um valor");
    }

    let resultado = vetor[vetor.length - 1];

    for (index = vetor.length - 1; index >= 0; index--) {
        resultado = resultado * (numero + vetor[index]);
    }

    return resultado;
}

/**Função que obtém o n-ésimo número de Fibonacci.
 *
 * @param {number} valorEntrada inteiro que representa a quantidade de
 * iterações do cálculo
 *
 * @returns {number} Retorna o número de Fibonnaci na n-ésima posição
 */
function obtenhaFibonacci(valorEntrada) {
	if (valorEntrada < 0) {
		return RangeError("É permitido somente valor inteiro");
	}

	var auxiliar = 0;
	var resultado = 1;
	if (valorEntrada == 0 || valorEntrada == 1) {
		return valorEntrada;
	}

	var i = 2;
	while (i <= valorEntrada) {
		var t = resultado;
		resultado = resultado + auxiliar;
		auxiliar = t;
		i++;
	}

	return resultado;
}

function ehCPFValido(digitoCPF) {
	if (!digitoCPF.isArray) {
		TypeError("Este parâmetro não é um vetor.");
	}

	for (var i = 1; i < digitoCPF.length; i++) {
		if (digitoCPF[i] < 0 || digitoCPF[i] > 9) {
			RangeError("Dados do vetor incorretos.")
		}
	}

	if (digitoCPF.length != 12) {
		RangeError("Vetor de tamanho incorreto.");
	}

	var j = (digitoCPF[0]) + (2 * digitoCPF[1]) + (3 * digitoCPF[2]) + (4 * digitoCPF[3]) + (5 * digitoCPF[4]) + (6 * digitoCPF[5]) + (7 * digitoCPF[6]) + (8 * digitoCPF[7]) + (9 * digitoCPF[8]);
	var k = (2 * digitoCPF[1]) + (3 * digitoCPF[2]) + (4 * digitoCPF[3]) + (5 * digitoCPF[4]) + (6 * digitoCPF[5]) + (7 * digitoCPF[6]) + (8 * digitoCPF[7]) + (9 * digitoCPF[8]) + (10 * digitoCPF[9]);
	var dj = obtenhaResto(obtenhaResto(j, 11), 10);
	var dk = obtenhaResto(obtenhaResto(k, 11), 10);

	return (dj == digitoCPF[9] && dk == digitoCPF[10]);
}


