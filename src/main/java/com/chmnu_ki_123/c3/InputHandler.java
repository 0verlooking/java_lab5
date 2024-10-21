package com.chmnu_ki_123.k3;

import java.util.Locale;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler() {
        Locale.setDefault(Locale.US);
        this.scanner = new Scanner(System.in);
    }

    public double getDouble(String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.err.println("You must enter a valid double (use a dot as the decimal separator)!");
                scanner.next();
            }
        }
        return value;
    }
}
