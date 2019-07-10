/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula12.application.api;

import com.github.gustavohenriquerssilva.aula12.application.DTO.DiferencaDTO;
import com.github.gustavohenriquerssilva.aula12.domain.CalendarioUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class DiferencaController {

    /**
     * Construtor privado da classe.
     */
    private DiferencaController() {

    }

    @CrossOrigin
    @RequestMapping("ds")

    /**
     * Obtém objeto que informa a diferença em dias entre duas datas.
     *
     * @param di A data inicial informada na tela.
     * @param df A data final informada na tela.
     *
     * @return Instância de {@link DiferencaDTO}.
     *
     * @throws IllegalArgumentException Se data inicial ou final não for informada.
     */
    public static DiferencaDTO diferencaDias(@RequestParam(value = "inicio",
            defaultValue = "não fornecida") String di,
            @RequestParam(value = "fim", defaultValue = "não fornecida")
            String df) {

        LocalDate dataInicial = localDateFromString(di);
        LocalDate dataFinal = localDateFromString(df);

        // Se data não é fornecida, ou é inválida, use o dia corrente.
        if (dataInicial == null || dataFinal == null) {
            throw new IllegalArgumentException(
                    "Datas não informadas");
        }

        long diferenca = CalendarioUtils.getDiferencaEntreDatas(dataInicial,
                dataFinal);

        return new DiferencaDTO(diferenca);
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência
     * de caracteres.
     *
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     * @return Instância de {@link LocalDate} ou {@code null}, se a sequência
     * não está no formato esperado (por aula12, "01-01-2018")
     */
    public static LocalDate localDateFromString(String data) {
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
