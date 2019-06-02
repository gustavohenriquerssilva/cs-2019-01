const funcao = require("../exercicios.js");

test("satisfaz (caso clássico)", () => {
    expect(funcao.ehQuadradoPerfeito(9)).toBe(true);
});

test("não satisfaz ", () => {
    expect(funcao.ehQuadradoPerfeito(7)).toBe(false);
});

test("valor fora da faixa", () => {
    expect(() => {
        funcao.ehQuadradoPerfeito(0);
    }).toThrow(RangeError);
});

test("valor nulo", () => {
    expect(() => {
        funcao.ehQuadradoPerfeito();
    }).toThrow(TypeError);
});

test("valor não é número", () => {
    expect(() => {
        funcao.ehQuadradoPerfeito("abcd");
    }).toThrow(TypeError);
});