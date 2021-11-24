package Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) throws FileNotFoundException {
        Game game = new Game();
        game.startGame();
    }

    public static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {
        System.out.println("Please enter a letter: ");
        System.out.println("You have guessed on the following letters: " + Color.TEXT_CYAN + playerGuesses + Color.TEXT_RESET);
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));


        return word.contains(letterGuess);

    }

    public static boolean printWordState(String word, List<Character> playerGuesses) {
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
