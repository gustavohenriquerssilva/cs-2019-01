
package com.github.gustavohenriquerssilva.aula11.application.dto;

/**
 * Data Transfer Object (dto) usado para transferir
 * dados entre subsistemas de um software.
 * Criada exclusivamente para ilustrar a resposta via RESTFul API.
 *
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
public class DiferencaDTO {

    /**
     * Armazena valor da diferença entre duas datas.
     */
    private long diferencaDias;

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private DiferencaDTO() {

    }

    /**
     * Armazena o valor da diferenca entre duas datas.
     *
     * @param diferencaDias Valor que deve ser armazenado.
     */
    public DiferencaDTO(final long diferencaDias) {
        this.diferencaDias = diferencaDias;
    }

    /**
     * Obtém o valor armazenado.
     *
     * @return A diferencia dos dias armazenada
     */
    public long getDiferencaDias() {
        return diferencaDias;
    }
}
