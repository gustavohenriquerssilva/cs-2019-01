/**
 * Data Transfer Object (DTO) usado para transferir dados entre subsistemas de um software.
 * Criada exclusivamente para ilustrar a resposta via RESTFul API.
 */
public class NumeroDTO {

    /**
     * Armazena valor da diferença entre duas datas.
     */
    private String numero;

    /**
     * Armazena o valor da diferenca entre duas datas.
     *
     * @param numero Valor que deve ser armazenado
     */
    public NumeroDTO(String numero)
    {
        this.numero = numero;
    }

    /**
     * Obtém valor armazenado
     *
     * @return Valor armazenado
     */
    public String obtenhaNumeroDTO() {
        return this.numero;
    }

    @Override
    public boolean equals(Object o) {
        NumeroDTO that = (NumeroDTO) o;

        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(numero);
    }
}