const funcoes = require("../numero");

test("extraiNumeroPorExtenso", () => {
    expect(funcoes.extraiNumeroPorExtenso("{\"numero\":um}")).toBe(um);
});

test("obtenhaUrlMontada", () => {
    expect(funcoes.obtenhaUrlMontada("0"))
        .toBe("http://localhost:8080/ds?numero=0");
});
