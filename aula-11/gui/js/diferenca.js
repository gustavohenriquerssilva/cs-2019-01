/*
 * Path para a requisição (URL)
 */
const PATH = "http://localhost:9875/ds?dataInicial=";

/*
 * Obtém data inicial e final e retorna a diferença em dias para essas datas.
 */
function atualizaDiferenca() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let diferenca = extraiDiferencaEntreDatas(xhttp.responseText);
            document.getElementById("resultado").innerHTML = diferencaDias;
        }
    };

    let di = document.getElementById("dataInicial").value;
    let dataInicial = formatarData(di);
    let df = document.getElementById("dataFinal").value;
    let dataFinal = formatarData(df);
    xhttp.open("GET", monteURL(dataInicial, dataFinal), true);
    xhttp.send();
}

/*
 * Obtém URL montada.
 *
 * @param {String} dataInicial data inicial informada na tela
 * @param {String} dataFinal data final informada na tela
 *
 * @returns url concatenada
 */
function monteURL(dataInicial, dataFinal) {
    return PATH + dataInicial + "&dataFinal=" + dataFinal;
}

/*
 *  
 */
function data() {
    document.getElementById("dataInicial").valueAsDate = new Date();
    document.getElementById("dataFinal").valueAsDate = new Date();
}

// Funções para integração (satisfazer contrato do servidor)

function extraiDiferencaEntreDatas(resposta) {
    return JSON.parse(resposta).diferencaDias;
}

// Dia ou mês deve possuir dois dígitos
function formataDiaOuMes(n) {
    return ("00" + n).substr(-2, 2);
}

// Ano deve possuir quatro dígitos
function formataAno(n) {
    return ("0000" + n).substr(-4, 4);
}

// ENTRADA: ano-mes-dia SAIDA: dd-mm-yyyy
function formatarData(data) {
    let [a, m, d] = data.split("-");

    let dia = formataDiaOuMes(d);
    let mes = formataDiaOuMes(m);
    let ano = formataAno(a);

    return `${d}-${m}-${a}`;
}