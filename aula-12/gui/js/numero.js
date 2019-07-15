/*
 * Path para a requisição (URL)
 */
const PATH = "http://localhost:8080/ds?";

/*
 * Executa uma requisição XMLHTTP e obtém número um número 
 * e o retorna por extenso. O resultado é exibido no campo
 * resultado
 */
function atualizaNumeroExtenso() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let numeroExtenso = extraiNumeroPorExtenso(xhttp.responseText);
            document.getElementById("resultado").innerHTML = numeroExtenso;
        }
    };

    let numero = document.getElementById("numero").value;

    xhttp.open("GET", obtenhaUrlMontada(numero), true);
    xhttp.send();
}

/**
 * Obtém URL montada para a requisição do serviço.
 * 
 * @param {String} data Numero informado na tela que será passado para extenso
 * 
 * @returns url concatenada para a requisição XML
 */
function obtenhaUrlMontada(numero) {
    return PATH + "numero=" + numero;
}

/** 
 *Funções para integração (satisfazer contrato do servidor)
 *
 * @param resposta É uma NumeroDTO que contém o número
 * por extenso como um JSON do tipo '{"numero":um}'
 * 
 * @returns o número em extenso calculado pela requisição
 */
function extraiNumeroPorExtenso(resposta) {
    return JSON.parse(resposta).numero;
}


module.exports = {
    atualizaNumeroExtenso,
    obtenhaUrlMontada,
    extraiNumeroPorExtenso,
};