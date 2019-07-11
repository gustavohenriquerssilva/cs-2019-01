
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
     *
     * @param diferencaDias Valor que deve ser armazenado
     */
    public DiferencaDTO(long diferencaDias)
    {
        this.diferencaDias = diferencaDias;
    }

    public long getDiferencaDias() {
        return diferencaDias;
    }

    public void setDiferencaDias(long diferencaDias) {
        this.diferencaDias = diferencaDias;
    }

    /**
     * Obtém valor armazenado
     *
}
