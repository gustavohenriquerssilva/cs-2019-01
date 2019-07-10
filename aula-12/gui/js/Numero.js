// Path para a requisição (URL)
const PATH = "http://localhost:8080/ds?dataFinal=";

function atualizaDiaDaSemana() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let dds = extraiDiaDaSemanaDaResposta(xhttp.responseText);
            document.getElementById("resultado").innerHTML = dds;
        }
    };

    let di = document.getElementById("dataFinalInicial").value;
    let dataFinal = formataDataFinal(di);
    let df = document.getElementById("dataFinalFinal").value;
    let dataFinal = formataDataFinal(df);
    xhttp.open("GET", monteURL(dataInicial, dataFinal), true);
    xhttp.send();
}

function monteURL(dataInicial, dataFinal) {
    return PATH + dataInicial + "&dataFinal=" + dataFinal;
}

function dataFinalCorrente() {
    document.getElementById("dataFinal").valueAsDate = new Date();
}

// Funções para integração (satisfazer contrato do servidor)

function extraiNumeroExtensoResposta(resposta) {
    return JSON.parse(resposta).diaDaSemana;
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
function formataDataFinal(dataFinal) {
    let [a, m, d] = dataFinal.split("-");

    let dia = formataDiaOuMes(d);
    let mes = formataDiaOuMes(m);
    let ano = formataAno(a);

    return `${d}-${m}-${a}`;
}
