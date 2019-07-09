
package com.github.gustavohenriquerssilva.cs.aula11.aplication.DTO;

/**
 * Data Transfer Object (DTO) usado para transferir dados entre subsistemas de um software.
 * Criada exclusivamente para ilustrar a resposta via RESTFul API. 
 */
public class DTODiferenca {

    /**
     * Armazena valor da diferença entre duas datas.
     */
    private long diferenca;

    /**
     * Armazena o valor da diferenca entre duas datas.
     * @param diferecaDias
     */
    public DTODiferenca(long diferecaDias) {
        this.diferecaDias = diferecaDias;
    }

    public long obtenhaDTODiferencaDias() {
        return this.diferecaDias;
    }

}
