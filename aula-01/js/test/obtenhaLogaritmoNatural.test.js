const funcao = require("../exercicios.js");

test("logaritmoNatural satisfaz (caso classico)", () => {
    expect(funcao.obtenhaAlgoritimoNatural(2,2)).toBe(5.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaAlgoritimoNatural("a",2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaAlgoritimoNatural(2,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaAlgoritimoNatural(0,2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaAlgoritimoNatural(2,3); }).toThrow(RangeError);
});