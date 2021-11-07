package Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*Welcome to Patrik's Epic hangman royale!*");
        System.out.println();

        System.out.println("1 or 2 players?");
        String players = keyboard.nextLine();

        String word;

        if (players.equals("1")) {

            Scanner scanner = new Scanner(new File("wordlist.txt"));

            List<String> words = new ArrayList<>();

            while (scanner.hasNext()) {
                words.add(scanner.nextLine());
            }

            Random rand = new Random();
            word = words.get(rand.nextInt(words.size()));
        } else {
            System.out.println("Player 1, please enter your word: ");
            word = keyboard.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Ready for player 2! good luck!");
        }

        //System.out.println(word);

        List<Character> playerGuesses = new ArrayList<>();


        int wrongCount = 0;
        while (true) {

            HangManPrinter hangMan = new HangManPrinter();
            hangMan.printHangedMan(wrongCount);

            if (wrongCount >= 6) {
                System.out.println("You loose! N00B");
                System.out.println("The word was: " + word);
                break;
            }


            printWordState(word, playerGuesses);
            if (!getPlayerGuess(keyboard, word, playerGuesses)) {
                wrongCount++;
                System.out.println("Wrong guess!");
            }

            if (printWordState(word, playerGuesses)) {
                System.out.println("You win!!");
                break;
            }
            System.out.println("Please enter your guess for the word");
            if (keyboard.nextLine().equals(word)) {
                System.out.println(word + " Was the right word!");
                System.out.println("You win!!");
                break;
            } else {
                System.out.println("Wrong word bro, try again!");
            }
        }

    }

    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter: ");
        System.out.println("You have guessed on the following letters: " + Color.TEXT_CYAN + playerGuesses + Color.TEXT_RESET);
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));


        return word.contains(letterGuess);

    }

    private static boolean printWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(Color.TEXT_GREEN + word.charAt(i) + Color.TEXT_RESET);
                correctCount++;
            } else {
                System.out.print(Color.TEXT_GREEN + "_" + Color.TEXT_RESET);
            }
        }
        System.out.println();

        return (word.length() == correctCount);
    }
}
