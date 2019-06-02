const funcao = require("../exercicios.js");

test("raiz satisfaz (caso classico)", () => {
    expect(funcao.obtenhaRaizQuadrada(4, 100)).toBe(2.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaRaizQuadrada("a",100); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaRaizQuadrada(100,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaRaizQuadrada(0, 100); }).toThrow(RangeError);
});