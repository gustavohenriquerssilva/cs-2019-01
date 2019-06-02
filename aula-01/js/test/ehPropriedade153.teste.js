const funcao = require("../exercicios.js");

test("153 satisfaz (caso clássico)", () => {
    expect(funcao.ehPropriedade153(153)).toBe(true);
});

test("153 não satisfaz", () => {
    expect(funcao.ehPropriedade153(154)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.ehPropriedade153("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => funcao.ehPropriedade153(10000)).toThrow(RangeError);
});