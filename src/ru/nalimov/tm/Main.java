package ru.nalimov.tm;


import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {
       System.out.println(Arrays.toString(args));
       run(args);
       displayWelcome();
    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        if ("ver".equals(param)) displayVer();

    }
    private  static void displayVer() {
        System.out.println("ver1");
        System.exit(0);
    }

    private  static void displayWelcome() {
        System.out.println("Welcome");
    }
}


