const funcoes = require("../Exercicio7");

test("teste 1", () => {
    expect(funcoes.obtenhaQtdPalavras("Joao Jose Joao Joao Joao Jose Marilda")).toBe("Joao");
    expect(funcoes.obtenhaQtdPalavras("Terca Quarta Sexta Quinta Sexta Sexta Quarta")).toBe("Sexta");
});

