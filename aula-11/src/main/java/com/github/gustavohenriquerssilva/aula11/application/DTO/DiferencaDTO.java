
package com.github.gustavohenriquerssilva.aula11.application.DTO;

/**
 * Data Transfer Object (DTO) usado para transferir dados entre subsistemas de um software.
 * Criada exclusivamente para ilustrar a resposta via RESTFul API. 
 */
public class DiferencaDTO {

    /**
     * Armazena valor da diferença entre duas datas.
     */
    private long diferencaDias;

    /**
     * Armazena o valor da diferenca entre duas datas.
     * @param diferencaDias
     */
    public DiferencaDTO(long diferencaDias) {
        this.diferencaDias = diferencaDias;
    }

    public long obtenhaDTODiferencaDias() {
        return this.diferencaDias;
    }

}
