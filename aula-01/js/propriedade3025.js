function ehPropriedade3025(valorTestado) {
    if (typeof numero != "number") {
        return TypeError("Este parâmetro não é um número.");
    }

    if (numero < 0 || numero > 9999) {
        return RangeError("Valor inserido não pode ser menor que zero ou maior que 9999.");
    }

    const centena = valorTestado / 100;
    const dezena = valorTestado % 100;
    const resultadoFinal = (centena + dezena) * (centena + dezena);
    return valorTestado == resultadoFinal;
}