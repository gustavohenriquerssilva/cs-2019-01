const funcao = require("../exercicios.js");

var test1 = [3,2,5,3,8,6,4,9,8,7,0];

test("CPF satisfaz (caso classico)", () => {
    expect(funcao.ehCPFValido(test1)).toBe(true);
});

var test2 = [3,2,5,3,8,6,4,9,8,8,0];

test("primeiro digito verificador nao satisfaz", () => {
    expect(funcao.ehCPFValido(test2)).toBe(false);
});

var test3 = [3,2,5,3,8,6,4,9,8,7,1];

test("segundo digito verificador nao satisfaz", () => {
    expect(funcao.ehCPFValido(test3)).toBe(false);
});

var test4 = ["a","b","c",3,8,6,4,9,8,7,1];

test("conteudo do vetor nao satisfaz", () => {
    expect(() => { funcao.ehCPFValido(test4); }).toThrow(RangeError);
});

var test5 = [3,2,5,3,8,6,4,9,8,7,1,2,3];

test("tamanho do vetor nao satisfaz", () => {
    expect(() => { funcao.ehCPFValido(test5); }).toThrow(RangeError);
});

var test6 = [3,2,5,3,8,6,4];

test("tamanho do vetor nao satisfaz", () => {
    expect(() => { funcao.ehCPFValido(test6); }).toThrow(RangeError);
});

var test7 = [3,2,5,3,8,6,4,9,8,7,10];

test("tamanho do vetor nao satisfaz", () => {
    expect(() => { funcao.ehCPFValido(test7); }).toThrow(RangeError);
});

var test8 = [3,2,5,3,8,6,4,9,8,7,-1];

test("tamanho do vetor nao satisfaz", () => {
    expect(() => { funcao.ehCPFValido(test8); }).toThrow(RangeError);
});

test("argumento null/undefined", () => {
    expect(() => { funcao.ehCPFValido(); }).toThrow(TypeError);
});

test("argumento nao é um vetor", () => {
    expect(() => { funcao.ehCPFValido(1); }).toThrow(TypeError);
});