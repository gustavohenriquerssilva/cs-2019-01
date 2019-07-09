/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula11.application.api;

import com.github.gustavohenriquerssilva.aula11.domain.CalendarioUtils;
import com.github.gustavohenriquerssilva.aula11.application.DTO.DTODiferenca;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class DiferencaController {

    @CrossOrigin
    @RequestMapping("ds")
    public DiaDaSemana diaDaSemana(@RequestParam(value="inicio", defaultValue =
            "não fornecida") String di, @RequestParam(value="fim", defaultValue =
            "não fornecida") String df, ) {

        LocalDate dataIncial = localDateFromString(di);
        LocalDate dataFinal = localDateFromString(df);

        // Se data não é fornecida, ou é inválida, use o dia corrente.
        if (dataInicial == null || dataFinal == null) {
            dataInicial = LocalDate.now();
            dataFinal = LocalDate.now();
        }
        
        long diferenca = CalendarioUtils.getDiferencaEntreDatas(dataInicial,
                dataFinal);

         return new DTODiferenca(diferenca);
    }

    /**
     * Recupera a instância de {@link LocalDate} correspondente à sequência
     * de caracteres.
     * @param data Sequência de caracteres no formato dd-MM-yyyy.
     *
     * @return Instância de {@link LocalDate} ou {@code null}, se a sequência
     * não está no formato esperado (por aula11, "01-01-2018")
     */
    public LocalDate localDateFromString(String data) {
        try {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return LocalDate.parse(data, fmt);
        } catch (Exception exp) {
            return null;
        }
    }
}
