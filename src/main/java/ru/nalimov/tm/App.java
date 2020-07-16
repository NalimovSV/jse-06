package ru.nalimov.tm;

import java.util.Scanner;

import static ru.nalimov.tm.constant.TerminalConst.*;

/*Создали через Apache Maven + цикл while (с условием)*/

public class App {

    public static void main(final String[] args) {
       run(args);
       displayWelcome();
       final Scanner scanner = new Scanner(System.in);
        String command = "";
       while (!EXIT.equals(command)) {
           command = scanner.nextLine();
           run(command);

       }
    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        final int result = run(param);
        System.exit(result);
    }

    private static int run(final String param) {
    if (param == null) return -1;
    switch (param) {
            case VERSION: return displayVersion();
            case ABOUT: return displayAbout();
            case HELP: return displayHelp();
            case EXIT: return displayExit();
            default: return displayErr();
        }
    }

    private  static int displayVersion() {
        System.out.println("ver 1.0.3");
        return 0;
    }

    private  static int displayAbout() {
        System.out.println("nalimov_sv@nlmk.com");
        return 0;
    }

    private  static int displayHelp() {
        System.out.println("version - Display program version.");
        System.out.println("about - Display developer info.");
        System.out.println("help - Display list of terminal commands.");
        return 0;
    }

    private static int displayExit() {
        System.out.println("Exit...");
        return 0;
    }

    private  static void displayWelcome() {
        System.out.println("Welcome");
    }

    private  static int displayErr() {
        System.out.println("Error! Unknow key...");
        return -1;
    }
}
