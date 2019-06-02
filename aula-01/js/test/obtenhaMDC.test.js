const funcao = require("../exercicios.js");

test("mdc satisfaz (caso classico)", () => {
    expect(funcao.obtenhaMDC(95, 50)).toBe(5.0);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaMDC("a", 50); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaMDC(95, "a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaMDC(95, 100); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaMDC(95, 0); }).toThrow(RangeError);
});