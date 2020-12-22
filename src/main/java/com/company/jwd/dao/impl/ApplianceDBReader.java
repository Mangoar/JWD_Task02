package com.company.jwd.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ApplianceDBReader {

    private String filename;
    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    public ApplianceDBReader(String filename) {
        this.filename = filename;
        stringList = new ArrayList<>();
    }

    public void readFromDB() {
        StringBuilder result = new StringBuilder(this.filename + "\n");

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(filename)).getFile());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()) {
                    result.append(line).append("\n");
                    stringList.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(result);

    }
}
