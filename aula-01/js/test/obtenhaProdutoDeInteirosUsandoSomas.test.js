const funcao = require("../exercicios.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.obtenhaProdutoDeInteirosUsandoSoma(5,2)).toBe(10);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaProdutoDeInteirosUsandoSoma("a",2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaProdutoDeInteirosUsandoSoma(2,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaProdutoDeInteirosUsandoSoma(-1, 2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaProdutoDeInteirosUsandoSoma(1, -2); }).toThrow(RangeError);
});