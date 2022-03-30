package com.nik.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    private final static String FILE_PATH = "src\\main\\resources\\users";
    private final static int COUNT_FIELDS = 3;

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.lines(Path.of(FILE_PATH)).collect(Collectors.toList());
        int countLines = lines.size();

        Iterator<String> linesIterator = lines.iterator();

        List<User> users = new ArrayList<>();

        int countOfUsers = countLines / COUNT_FIELDS;

        for (int i = 0; i < countOfUsers; i++) {
            users.add(new User()
                    .setLastName(linesIterator.next())
                    .setFirstName(linesIterator.next())
                    .setAge(Integer.parseInt(linesIterator.next()))
            );
        }

    }
}
