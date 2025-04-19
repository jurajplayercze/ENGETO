package util;

public class DebugManager {
    public static boolean DEBUG = false;

    public static void setDebug(boolean debug) {
        DEBUG = debug;
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void print(String message) {
        if (DEBUG) {
            System.out.println(message + ConsoleColor.RESET);
        }
    }

    public static void printError(String message) {
        System.out.println(ConsoleColor.RED + message + ConsoleColor.RESET);
    }
}
