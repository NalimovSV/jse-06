package ru.nalimov.tm;

import static ru.nalimov.tm.constant.TerminalConst.*;

/*Тестовое*/

public class Main {
    public static void main(final String[] args) {
       run(args);
       displayWelcome();
    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        switch (param) {
            case VERSION: displayVer();
            case ABOUT: displayAbout();
            case HELP: displayHelp();
            default: displayErr();
        }

    }
    private  static void displayVer() {
        System.out.println("ver 1.0");
        System.exit(0);
    }

    private  static void displayAbout() {
        System.out.println("nalimov_sv@nlmk.com");
        System.exit(0);
    }

    private  static void displayHelp() {
        System.out.println("version - Display program version.");
        System.out.println("about - Display developer info.");
        System.out.println("help - Display list of terminal commands.");
        System.exit(0);
    }

    private  static void displayWelcome() {
        System.out.println("Welcome");
    }

    private  static void displayErr() {
        System.out.println("Error! Unknow key...");
        System.exit(-1);
    }

}


