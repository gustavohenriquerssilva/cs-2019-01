const funcao = require("../exercicios.js");

test("fibonacci satisfaz (caso classico)", () => {
    expect(funcao.obtenhaFibonacci(7)).toBe(13);
});

test("fibonacci satisfaz (caso classico)", () => {
    expect(funcao.obtenhaFibonacci(1)).toBe(1);
});

test("fibonacci satisfaz (caso classico)", () => {
    expect(funcao.obtenhaFibonacci(0)).toBe(1);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaFibonacci("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaFibonacci(-1); }).toThrow(RangeError);
});