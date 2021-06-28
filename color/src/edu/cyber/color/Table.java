package edu.cyber.color;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Table
{
    public static final String MATERIAL;

    public final int FIRM_ID = 119;

    static {
        List<String> strings = Arrays.asList("OAK");
        try {
            strings = Files.readAllLines(Paths.get("init.txt"));
        } catch (Exception e) {
        }
        MATERIAL = strings.get(0);
    }

    public String driverName() {
        return "1231";
    }

    public static String getModelName() {
        System.out.println(MATERIAL);
        return "Super table model";
    }
}
