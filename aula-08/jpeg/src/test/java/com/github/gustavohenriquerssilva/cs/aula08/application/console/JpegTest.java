package com.github.gustavohenriquerssilva.cs.aula08.application.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import com.github.gustavohenriquerssilva.cs.aula08.domain.ConfereArquivoUtils;
 
public class JpegTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    public void confereArquivoTrue() throws IOException {
        assertTrue(ConfereArquivoUtils.ehArquivoJpeg(getFilename("imagemTrue.jpg")));
    }

    @Test
    public void confereArquivoFalse() throws IOException {
        assertFalse(ConfereArquivoUtils.ehArquivoJpeg(getFilename("imagemFalse.txt")));
    }

    @Test
    public void confereArquivoVazio() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> ConfereArquivoUtils.ehArquivoJpeg(getFilename("vazio.txt")));
        assertThrows(IllegalArgumentException.class,() -> ConfereArquivoUtils.ehArquivoJpeg("a.txt"));
    }

    @Test
    public void teste() throws IOException {
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("---------");
        FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(permissions);
        Path dir = Files.createTempDirectory("testDir");
        Path path = dir.resolve("naoPodeLer.txt");
        Path teste = Files.createFile(path, fileAttributes);
        PosixFileAttributes attr = Files.readAttributes(path, PosixFileAttributes.class);
        attr.permissions().clear();
        Files.setPosixFilePermissions(path, permissions);

        assertThrows(IllegalArgumentException.class,() -> ConfereArquivoUtils.ehArquivoJpeg(teste.toString()));
    }

    @Test 
    public void confereRetornoTrue() throws IOException{
        assertEquals("O arquivo passado é um jpeg.", ConfereArquivoUtils.arquivoJpeg(ConfereArquivoUtils.ehArquivoJpeg(getFilename("imagemTrue.jpg"))));
    }
    
    @Test 
    public void confereRetornoFalse() throws IOException{
        assertEquals("O arquivo passado não é um jpeg.", ConfereArquivoUtils.arquivoJpeg(ConfereArquivoUtils.ehArquivoJpeg(getFilename("imagemFalse.txt"))));
    }

    @Test
    public void testMain() throws IOException{
        String[] args = {getFilename("imagemTrue.jpg")};
        ProgramaJpeg.main(args);
    }
}
