const funcao = require("../exercicios.js");

test("razaoAurea satisfaz (caso classico)", () => {
    expect(funcao.obtenhaRazaoAurea(1, 2, 1000)).toBe(1.6180339887498947);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaRazaoAurea("a", 2, 1000); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaRazaoAurea(1, "a", 1000); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaRazaoAurea(1, 2, "a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaRazaoAurea(-1, 2, 1000); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaRazaoAurea(1, 0, 1000); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaRazaoAurea(1, 2, -1); }).toThrow(RangeError);
});