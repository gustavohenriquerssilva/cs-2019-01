const funcao = require("../exercicios.js");

test("3025 satisfaz (caso clássico)", () => {
    expect(funcao.ehPropriedade3025(3025)).toBe(true);
});

test("3024 não satisfaz", () => {
    expect(funcao.ehPropriedade3025(3024)).toBe(false);
});

test("valor nulo", () => {
    expect(() => {
        funcao.ehPropriedade3025();
    }).toThrow(TypeError);
});

test("valor não é número", () => {
    expect(() => {
        funcao.ehPropriedade3025("abcd");
    }).toThrow(TypeError);
});

test("valor negativo fora da faixa", () => {
    expect(() => {
        funcao.ehPropriedade3025(-1);
    }).toThrow(RangeError);
});

test("valor com mais de 4 digitos fora da faixa", () => {
    expect(() => funcao.ehPropriedade3025(10000)).toThrow(RangeError);
});