const funcao = require("../exercicios.js");

test("primo satisfaz (caso clássico)", () => {
    expect(funcao.ehNumeroPrimo(3)).toBe(true);
});

test("primo satisfaz (caso clássico)", () => {
    expect(funcao.ehNumeroPrimo(19)).toBe(true);
});

test("primo satisfaz (caso clássico)", () => {
    expect(funcao.ehNumeroPrimo(229)).toBe(true);
});

test("primo satisfaz (caso clássico)", () => {
    expect(funcao.ehNumeroPrimo(4)).toBe(false);
});

test("primo satisfaz (caso clássico)", () => {
    expect(funcao.ehNumeroPrimo(192)).toBe(false);
});

test("valor não é um número", () => {
    expect(() => { funcao.ehNumeroPrimo("a"); }).toThrow(TypeError);
});

test("valor fora da faixa", () => {
    expect(() => { funcao.ehNumeroPrimo(1); }).toThrow(RangeError);
});