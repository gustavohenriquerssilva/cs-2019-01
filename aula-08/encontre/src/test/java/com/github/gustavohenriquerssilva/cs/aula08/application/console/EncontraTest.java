package com.github.gustavohenriquerssilva.cs.aula08.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class EncontraTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
    
    @Test
    void testObtenhaQtdOcorrencia() throws IOException {
        assertEquals("Encontradas: 7.",
                EncontreUtils.obtenhaQtdOcorrencia(getFilename("7ocorrencias.txt"), "aqui"));
        assertEquals("Encontradas: 2.",
                EncontreUtils.obtenhaQtdOcorrencia(getFilename("2ocorrenciasLinhaVazia.txt"), "aqui"));
        assertEquals("Encontradas: 2.",
                EncontreUtils.obtenhaQtdOcorrencia(getFilename("umaLinha.txt"), "teste"));
        assertEquals("Encontradas: 0.",
                EncontreUtils.obtenhaQtdOcorrencia(getFilename("umaLinha.txt"), ""));
        assertEquals("Encontradas: 2.",
                EncontreUtils.obtenhaQtdOcorrencia(getFilename("espacoNoFim.txt"), "aqui"));
        assertEquals("Encontradas: 0.",
                EncontreUtils.obtenhaQtdOcorrencia(getFilename("zeroOcorrencias.txt"), "aqui"));
    }

    @Test
    void testExcepObtenhaQtdOcorrencia() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> 
        EncontreUtils.obtenhaQtdOcorrencia(getFilename("vazio.txt"), "aqui"));
    }

    @Test
    void testObtenhaLinhasEColunas() throws IOException {
        String teste = "Encontradas: 2.\n" + 
                "L1 C10: frase de teste teste";
        assertEquals(teste,
                EncontreUtils.obtenhaResultado(getFilename("umaLinha.txt"), "teste"));
    }

    @Test
    void testExcepObtenhaLinhasEColunas() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> 
        EncontreUtils.obtenhaLinhasEColunas(getFilename("vazio.txt"), "aqui"));
    }

    @Test
    void testObtenhaResultado() throws IOException {
        String teste = "Encontradas: 7.\n" + 
                "L1 C1: aqui\n" + 
                "L2 C10: testando aqui aqui aqui\n" + 
                "L3 C12: esse teste aqui\n" + 
                "L4 C1: aqui\n" + 
                "L7 C1: aqui";
        assertEquals(teste,
                EncontreUtils.obtenhaResultado(getFilename("7ocorrencias.txt"), "aqui"));
    }
}
