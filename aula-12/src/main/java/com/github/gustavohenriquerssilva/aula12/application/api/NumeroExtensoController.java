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
     * @param numeroParam O número informada na tela que será
     * transformado para tipo inteiro absoluto.
     *
     * @return Instância de {@link NumeroDTO}.
     *
     * @throws IllegalArgumentException Se número contiver mais de 4 dígitos
     */
    public static NumeroDTO numeroExtenso(
            @RequestParam(value = "numero", defaultValue = "não fornecida") final String numeroParam) {

        if (numeroParam.length() > 4) {
            throw new IllegalArgumentException("Valor informado contém mais de 4 dígitos");
        }

        String numeroAbsoluto = numeroParam.replace("-", "");
        final int numero = Integer.parseInt(numeroAbsoluto);
        TransformaValorUtils transValor = new TransformaValorUtils();
        String numeroPorExtenso = transValor.getValorPorExtenso(numero);

        return new NumeroDTO(numeroPorExtenso);
    }
}