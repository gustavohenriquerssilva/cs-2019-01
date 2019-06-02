    
const funcao = require("../exercicios.js");

var test1 = [0];
for (let i = 1; i < 19; i++) {
    test1[i] = 0;
}

test("crivoEratostenes satisfaz (caso classico)", () => {
    expect(funcao.ehCrivoErastotenes(test1)).toBe(true);
});


test("valor não é um número", () => {
    expect(() => { funcao.ehCrivoErastotenes("a"); }).toThrow(TypeError);
});

var test2 = [0,0,0,0,0,0,0,0,0,"a"];


test("valor fora da faixa", () => {
    expect(() => { funcao.ehCrivoErastotenes(test2); }).toThrow(RangeError);
});