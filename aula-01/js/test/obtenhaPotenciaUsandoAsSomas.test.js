const funcao = require("../exercicios.js");

test("potencia satisfaz (caso classico)", () => {
    expect(funcao.obtenhaPotenciaUsandoAsSomas(5,2)).toBe(25);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaPotenciaUsandoAsSomas("a",2); }).toThrow(TypeError);
});

test("valor não é um número", () => {
    expect(() => { funcao.obtenhaPotenciaUsandoAsSomas(2,"a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaPotenciaUsandoAsSomas(-1, 2); }).toThrow(RangeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.obtenhaPotenciaUsandoAsSomas(1, -2); }).toThrow(RangeError);
});