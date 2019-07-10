
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

    public long obtenhaDTODiferencaDias() {
        return this.diferencaDias;
    }

    @Override
    public boolean equals(Object o) {
        DiferencaDTO that = (DiferencaDTO) o;

        return diferencaDias == that.diferencaDias;
    }

    @Override
    public int hashCode() {
        return (int)diferencaDias;
    }
}
