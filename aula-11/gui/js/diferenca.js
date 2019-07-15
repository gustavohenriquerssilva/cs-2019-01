/*
 * Path para a requisição (URL)
 */
const PATH = "http://localhost:9875/ds?dataInicial=";

/*
 * Executa uma requisição XMLHTTP e obtém data inicial
 * e final e retorna a diferença em dias para essas datas.
 * O resultado é exibido no campo resultado
 */
function atualizaDiferenca() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            let diferenca = extraiDiferencaEntreDatas(xhttp.responseText);
            document.getElementById("resultado").innerHTML = diferenca;
        }
    };

    let di = document.getElementById("dataInicial").value;
    let dataInicial = formatarData(di);
    let df = document.getElementById("dataFinal").value;
    let dataFinal = formatarData(df);
    xhttp.open("GET", obtenhaUrlMontada(dataInicial, dataFinal), true);
    xhttp.send();
}

/**
 * Obtém URL montada para a requisição do serviço.
 *
 * @param {String} dataInicial data inicial informada na tela
 * @param {String} dataFinal data final informada na tela
 *
 * @returns url concatenada para a requisição XML
 */
function obtenhaUrlMontada(dataInicial, dataFinal) {
    return PATH + dataInicial + "&dataFinal=" + dataFinal;
}

/*
 *  Adiciona a data atual para inserir nos dois campos de data
 */
function data() {
    document.getElementById("dataInicial").valueAsDate = new Date();
    document.getElementById("dataFinal").valueAsDate = new Date();
}

/** 
 *Funções para integração (satisfazer contrato do servidor)
 *
 * @param resposta É uma DiferencaDTO que contém a diferença
 * entre as duas datas como um JSON do tipo '{"diferencaDias":1}'
 * 
 * @returns a diferença calculada pela requisição
 */
function extraiDiferencaEntreDatas(resposta) {
    return JSON.parse(resposta).diferencaDias;
}


/** 
 *Recebe o valor da data e retorna uma string com a mesma data, 
 * porém com formato 'dd-mm-aaaa'
 * 
 * @param data É a data informada na tela do tipo date
 * 
 * @returns String com a data em no formato 'dd/mm/aaaa'
 */
function formatarData(data) {
    let [a, m, d] = data.split("-");

    let dia = formataDiaOuMes(d);
    let mes = formataDiaOuMes(m);
    let ano = formataAno(a);

    return `${d}-${m}-${a}`;
}

module.exports = {
    atualizaDiferenca,
    data,
    extraiDiferencaDaResposta,
    formatarData,
    obtenhaUrlMontada
};