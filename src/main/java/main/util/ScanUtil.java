package main.util;


import java.io.InputStreamReader;
import java.util.Scanner;

public class ScanUtil {
    private static final Scanner scanner = new Scanner(new InputStreamReader(System.in));

    public static String scan(String massage) {
        System.out.println(massage);
        return scanner.next();

    }

    public static boolean confirm(String message) {
        message += "\nConfirm? Y/N";
        return scan(message).toLowerCase().contains("y");
    }

}
