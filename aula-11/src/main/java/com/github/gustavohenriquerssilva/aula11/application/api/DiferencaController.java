/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula11.application.api;

import com.github.gustavohenriquerssilva.aula11.application.dto.DiferencaDTO;
import com.github.gustavohenriquerssilva.aula11.domain.CalendarioUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Tem a finalidade de execução do Controller.
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
@RestController
public class DiferencaController {

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
     * @throws IllegalArgumentException Se data inicial ou final
     * não for informada.
     */
    public static DiferencaDTO diferencaDias(@RequestParam(value = "dataInicial",
            defaultValue = "não fornecida") final String di,
                                             @RequestParam(value = "dataFinal", defaultValue = "não fornecida") final String df) {

        final LocalDate dataInicial = localDateFromString(di);
        final LocalDate dataFinal = localDateFromString(df);

        // Se data não é fornecida, ou é inválida, use o dia corrente.
        if (dataInicial == null || dataFinal == null) {
            throw new IllegalArgumentException(
                    "Datas não informadas");
        }

        final long diferenca = CalendarioUtils.getDiferencaEntreDatas(dataInicial,
                dataFinal);

        return new DiferencaDTO(diferenca);
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência
     * de caracteres.
     *
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     * @return Instância de {@link LocalDate} ou {@code null}, se a sequência
     * não está no formato esperado (por aula11, "01-01-2018")
     */
    public static LocalDate localDateFromString(final String data) {
        try {
            final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
