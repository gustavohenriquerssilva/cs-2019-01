const funcao = require("../exercicios.js");

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.obtenhaSomasPrimeirosNaturais(2)).toBe(3);
});

test("somaNaturais satisfaz (caso classico)", () => {
    expect(funcao.obtenhaSomasPrimeirosNaturais(1)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaSomasPrimeirosNaturais("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaSomasPrimeirosNaturais(0); }).toThrow(RangeError);
});