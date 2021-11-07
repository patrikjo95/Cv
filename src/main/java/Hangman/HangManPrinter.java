package Hangman;

public class HangManPrinter {

    public void printHangedMan(int wrongCount) {
        System.out.println(Color.TEXT_RED + " -------" + Color.TEXT_RESET);
        System.out.println(Color.TEXT_RED + " |     |" + Color.TEXT_RESET);
        if (wrongCount >= 1) {
            System.out.println(Color.TEXT_RED + " o" + Color.TEXT_RESET);
        }
        if (wrongCount >= 2) {
            System.out.print(Color.TEXT_RED + "\\ " + Color.TEXT_RESET);
            if (wrongCount >= 3) {
                System.out.println(Color.TEXT_RED + "/" + Color.TEXT_RESET);
            } else {
                System.out.println();
            }
        }
        if (wrongCount >= 4) {
            System.out.println(Color.TEXT_RED + " |" + Color.TEXT_RESET);
        }
        if (wrongCount >= 5) {
            System.out.print(Color.TEXT_RED + "/ " + Color.TEXT_RESET);
            if (wrongCount >= 6) {
                System.out.println(Color.TEXT_RED + "\\" + Color.TEXT_RESET);
            } else {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();
    }
}
