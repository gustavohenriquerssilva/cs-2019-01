/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula12.application.api;

import com.github.gustavohenriquerssilva.aula12.application.dto.NumeroDTO;
import com.github.gustavohenriquerssilva.aula12.domain.TransformaValorUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroExtensoController {

    /**
     * Construtor privado da classe.
     */
    private NumeroExtensoController() {

    }

    @CrossOrigin
    @RequestMapping("ds")

    /**
     * Obtém objeto que informa o número por extenso.
     *
     * @param numeroParam O número informada na tela.
     *
     * @return Instância de {@link NumeroDTO}.
     *
     * @throws IllegalArgumentException Se número contiver mais de 4 dígitos
     * @throws IllegalArgumentException Se número for negativo
     * 
     */
    public static NumeroDTO numeroExtenso(
            @RequestParam(value = "numero", defaultValue = "não fornecida") final String numeroParam) {

        validaEntrada(numeroParam);

        String numeroAbsoluto = numeroParam.replace("-", "");
        final int numero = Integer.parseInt(numeroAbsoluto);
        TransformaValorUtils transValor = new TransformaValorUtils();
        String numeroPorExtenso = transValor.getValorPorExtenso(numero);

        return new NumeroDTO(numeroPorExtenso);
    }

    /**
     * Valida a entrada obtida e encerra a requisição com 'IllegalArgumentException'
     * caso a entrada não for válida.
     * 
     * @param numero O número a ser validado
     * 
     * @throws IllegalArgumentException Se a entrada não for válida.
     */
    protected static void validaEntrada(final String numero) throws IllegalArgumentException {

        if (numero.length() > 4) {
            throw new IllegalArgumentException("Valor informado contém mais de 4 dígitos");
        }

        if (numero.contains("-")) {
            throw new IllegalArgumentException("Valor informado é negativo.");
        }
    }
}