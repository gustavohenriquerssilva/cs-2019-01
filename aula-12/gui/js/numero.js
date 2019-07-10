/*
 * Path para a requisição (URL)
 */
const PATH = "http://localhost:8080/ds?numero=";

/*
 * Obtém número por extenso
 */
function atualizaDiaDaSemana() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let numeroExtenso = extraiNumeroPorExtenso(xhttp.responseText);
            document.getElementById("resultado").innerHTML = numeroExtenso;
        }
    };

    let numero = document.getElementById("numero").value;

    xhttp.open("GET", monteURL(numero), true);
    xhttp.send();
}

/**
 * Obtém URL montada.
 * 
 * @param {String} data Numero informado na tela que será passado para extenso
 * 
 * @returns url concatenada
 */
function montaURL(numero) {
    return PATH + numero;
}

// Funções para integração (satisfazer contrato do servidor)

function extraiNumeroPorExtenso(resposta) {
    return JSON.parse(resposta).numeroExtenso;
}
