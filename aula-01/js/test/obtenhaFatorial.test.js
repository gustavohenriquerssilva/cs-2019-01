const funcao = require("../exercicios.js");

test("mod satisfaz (caso classico)", () => {
    expect(funcao.obtenhaFatorial(5)).toBe(120);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaFatorial("a"); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaFatorial(0); }).toThrow(RangeError);
});