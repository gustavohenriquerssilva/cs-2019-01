const funcao = require("../exercicios.js");

test("pi satisfaz (caso classico)", () => {
    expect(funcao.obtenhaValorPi(1000)).toBe(3.140592653839794);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaValorPi("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaValorPi(0); }).toThrow(RangeError);
});