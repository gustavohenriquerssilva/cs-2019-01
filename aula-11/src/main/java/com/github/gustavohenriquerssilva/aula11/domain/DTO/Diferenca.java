
package com.github.gustavohenriquerssilva.cs.aula11.domain;

/**
 * Data Transfer Object (DTO) usado para transferir dados entre subsistemas de um software.
 * Criada exclusivamente para ilustrar a resposta via RESTFul API. 
 */
public class DTODiferenca {

    private long diferenca;

    public DTODiferenca(long diferecaDias) {
        this.diferecaDias = diferecaDias;
    }

    public long obtenhaDTODiferencaDias() {
        return this.diferecaDias;
    }

}
