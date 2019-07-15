const funcoes = require("../diferenca");

test("extraiDiferencaDaResposta", () => {
    expect(funcoes.extraiDiferencaDaResposta("{\"diferencaDias\":0}")).toBe(0);
});

test("formatarData", () => {
    expect(funcoes.formatarData("2019-10-08")).toBe("08-10-2019");
});

test("obtenhaUrlMontada", () => {
    expect(funcoes.obtenhaUrlMontada("08-10-2019", "09-10-2019"))
        .toBe("http://localhost:8080/ds?dataInicial=08-10-2019&dataFinal=09-10-2019");
});
