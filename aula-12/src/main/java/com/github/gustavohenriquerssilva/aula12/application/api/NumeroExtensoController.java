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
     * Obtém objeto que informa o número por extenso.
     *
     * @param numeroParam O número informada na tela.
     *
     * @return Instância de {@link NumeroDTO}.
     *
     * @throws IllegalArgumentException Se número for inválido.
     * 
     */
    @CrossOrigin
    @RequestMapping("ds")
    public static NumeroDTO numeroExtenso(
            @RequestParam("numero") final String numeroParam) {

        validaEntrada(numeroParam);

        final int numero = Integer.parseInt(numeroParam);
        final String numeroPorExtenso = new TransformaValorUtils().getValorPorExtenso(numero);

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
        try {
            Integer.parseInt(numero);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("O número inserido não é válido.", ex);
        }
    }
}