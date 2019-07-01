/**
 * Implementação em JavaScript dos 6 algoritmos propostos na aula 07.
 */

/**
 * Obtém a menor temperatura.
 *
 * @param {number} temperaturas Vetor de valores de temperaturas.
 * @return {number} A menor temperatura encontrada no vetor.
 */

function obtenhaMenorTermperatura(temperaturas) {

    var menorTemperatura = temperaturas[0];

    for (var index = 0; index < temperaturas.length; index++ ) {
        if (temperaturas[index] < menorTemperatura) {
            menorTemperatura = temperaturas[index];
        }
    }

    return menorTemperatura;
}

/**
 * Obtém soma de números ímpares.
 *
 * @param {number} vetor Vetor de números inteiros.
 * @return {number} A soma dos números ímpares do vetor.
 */

function ObtenhaSomaImpares(vetor) {

    var soma = 0;

    for (var index = 0; index < vetor.length; index++ ) {
        if (vetor[index] % 2 != 0) {
            soma = soma + vetor[index];
        }
    }

    return soma;
}

/**
 * Obtém quantidade de repeticões em que determinado número ocorre em um vetor.
 *
 * @param {number} vetor    Vetor que será analisado.
 * @param {number} elemento Valor que será buscado no vetor e contabilizado.
 * @return {number} A quantidade de valores no vetor iguais ao elemento.
 */

function obtenhaQtdElementosIguais(vetor, elemento) {

    var qtdElementosIguais = 0;

    for (var index = 0; index < vetor.length; index++ ) {
        if (vetor[index] == elemento) {
            qtdElementosIguais++;
        }
    }

    return qtdElementosIguais;
}

/**
 * Obtém a quantidade de letras em uma sequência de caracteres.
 *
 * @param {String} palavra A sequência de caracteres.
 * @return {number} Vetor com a quantidade de repetições de cada letra na string.
 */

function obtenhaQtdCaracteres(palavra) {

    var quantidadeLetras = 0;
        for (var i = 0; i < palavra.length(); i++) {
            if (Character.isLetter(palavra.charAt(i))) {
                quantidadeLetras++;
            }
        }

        return quantidadeLetras;
}

/**
 * obtenha a quantidade de vezes que uma palavra ocorre em um vetor de
 * palavras.
 *
 * @param {String} frase A sequência de caracteres.
 * @return {String} A palavra que mais aparece na sequência de caracteres.
 */

function obtenhaQtdPalavras(frase) {

    var quantidade = 0;
        for (var i = 0; i < frase.length; i++) {
            if (palavraSelecionada.equals(frase[i])) {
                quantidade++;
            }
        }

        return quantidade;

}

/**
 * A função gera um número inteiro aleatório entre dois valores.
 *
 * @param {number} min Valor mínimo do intervalo.
 * @param {number} max Valor máximo do intervalo.
 *
 * @returns {number} Valor aleatório dentro do intervalo especificado no parâmetro.
 */

function getRandomIntInclusive(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

/**
 * A função sorteia aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e identifica o
 * número que mais foi sorteado. Se mais de um número foi o “mais frequente”, então todos eles
 * são retornados (em uma coleção) juntamente com a quantidade de vezes em que ocorrerão.
 *
 * @return {String} Array de strings contendo os números mais sorteados juntamente com a quantidade
 * de vezes que foram sorteados.
 */

function verificarMaisSorteado() {

    var qtdSorteada = [1000];
    var maiorQtdSorteio = 0;
    var maisSorteados = [];

    for (var h = 0; h < 1000; h++) {
        qtdSorteada[h] = 0;
    }

    for (var index = 0; index < 1000000; index++ ) {
        qtdSorteada[getRandomIntInclusive(0, 1000)]++;
    }

    for (var j = 0; j < 1000; j++) {
        if (qtdSorteada[j] > maiorQtdSorteio) {
            maiorQtdSorteio = qtdSorteada[j];
        }
    }

    for (var k = 0; k < 1000; k++) {
        if (qtdSorteada[k] == maiorQtdSorteio) {
            maisSorteados.push(k + " foi sorteado " + maiorQtdSorteio + " vezes.");
        }
    }

    return maisSorteados;
}

module.exports = {
    obtenhaMenorTermperatura: obtenhaMenorTermperatura,
    ObtenhaSomaImpares: ObtenhaSomaImpares,
    obtenhaQtdElementosIguais: obtenhaQtdElementosIguais,
    obtenhaQtdCaracteres: obtenhaQtdCaracteres,
    obtenhaQtdPalavras: obtenhaQtdPalavras,
    verificarMaisSorteado: verificarMaisSorteado
};