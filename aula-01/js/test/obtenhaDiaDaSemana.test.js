const funcao = require("../exercicios.js");

test("diaDaSemana satisfaz (caso clássico)", () => {
    expect(funcao.obtenhaDiaDaSemana(9,5,2017)).toBe(1);
});

test("diaDaSemana satisfaz (caso clássico)", () => {
    expect(funcao.obtenhaDiaDaSemana(9,1,2019)).toBe(2);
});

test("diaDaSemana satisfaz (caso clássico)", () => {
    expect(funcao.obtenhaDiaDaSemana(9,2,2019)).toBe(5);
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcao.obtenhaDiaDaSemana(-9,5,2017); }).toThrow(RangeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => { funcao.obtenhaDiaDaSemana(9,-5,2017); }).toThrow(RangeError);
});

test("dia fora da faixa", () => {
    expect(() => { funcao.obtenhaDiaDaSemana(32,5,2017); }).toThrow(RangeError);
});

test("mês fora da faixa", () => {
    expect(() => { funcao.obtenhaDiaDaSemana(9,13,2017); }).toThrow(RangeError);
});

test("ano fora da faixa", () => {
    expect(() => { funcao.obtenhaDiaDaSemana(9,5,1752); }).toThrow(RangeError);
});

test("ano fora da faixa", () => {
    expect(() => { funcao.obtenhaDiaDaSemana("a",5,1752); }).toThrow(TypeError);
});