package com.java.automation.lab.fall.antonyuk.core22.domain;

import com.java.automation.lab.fall.antonyuk.core22.domain.cheker.Validator;
import com.java.automation.lab.fall.antonyuk.core22.domain.exception.IncorrectNameFileException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Util {

    private static void write(Path path, String content, boolean isAppend) throws IncorrectNameFileException {
        if (!Validator.isValidFileName(path)) {
            throw new IncorrectNameFileException();
        }
        try {
            if (isAppend) {
                Files.writeString(path.toAbsolutePath(), content + '\n', StandardOpenOption.APPEND);
            } else {
                Files.writeString(path.toAbsolutePath(), content + '\n', StandardOpenOption.WRITE);
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static String read(Path path) throws IOException, IncorrectNameFileException {
        if (!Validator.isValidFileName(path)) {
            throw new IncorrectNameFileException();
        }
        List<String> lines =  Files.readAllLines(path.toAbsolutePath());
        StringBuffer stringBuffer = new StringBuffer();
        for (String line:
             lines) {
            stringBuffer.append(line);
        }
        return stringBuffer.toString();
    }

    public static void append(Path path, String content) throws IncorrectNameFileException {
            Util.write(path, content, true);
    }

    public static void overwrite(Path path, String content) throws IncorrectNameFileException {
        Util.write(path, content, false);
    }
}
