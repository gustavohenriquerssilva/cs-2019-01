const funcoes = require("../Exercicio7");

test("teste 1", () => {
    expect(funcoes.obtenhaQtdElementosIguais([0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0], 1)).toBe(4);
});

