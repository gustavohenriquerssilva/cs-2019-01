package com.github.gustavohenriquerssilva.cs.aula08.application.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.github.gustavohenriquerssilva.cs.aula08.domain.InteiroUtils;

public class InteiroTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }

    @Test
    void testByteFile() throws IOException {        
        assertEquals("436f6e73",
                InteiroUtils.byteFile(getFilename("436f6e73.txt")));
    }

    @Test
    void testByteFileClass() throws IOException {
        assertEquals("cafebabe",
                InteiroUtils.byteFile(getFilename("cafebabe.class")));
    }

    @Test
    void testArquivoIncorreto() throws IOException {
        assertThrows(IllegalArgumentException.class,() -> InteiroUtils.byteFile(getFilename("vazio.txt")));
    }
    
}
