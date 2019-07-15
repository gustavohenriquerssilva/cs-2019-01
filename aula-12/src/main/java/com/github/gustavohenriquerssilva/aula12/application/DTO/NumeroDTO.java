package com.github.gustavohenriquerssilva.aula12.application.dto;
/**
 * Data Transfer Object (DTO) usado para transferir dados entre subsistemas de
 * um software. Criada exclusivamente para ilustrar a resposta via RESTFul API.
 * 
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
public class NumeroDTO {

    /**
     * Armazena valor da diferença entre duas datas.
     */
    private String numero;

    /**
     * Armazena o valor da diferenca entre duas datas.
     *
     * @param numero Valor que deve ser armazenado.
     */
    public NumeroDTO(final String numero) {
        this.numero = numero;
    }

    /**
     * Obtém valor armazenado.
     *
     * @return Valor armazenado.
     */
    public String getNumero() {
        return numero;
    }

}