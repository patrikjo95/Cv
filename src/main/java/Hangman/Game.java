package Hangman;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner keyboard = new Scanner(System.in);
    String word;
    Scanner scanner;

    public void startGame(){
        setupGameWord();

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


            Hangman.printWordState(word, playerGuesses);
            if (!Hangman.getPlayerGuess(keyboard, word, playerGuesses)) {
                wrongCount++;
                System.out.println("Wrong guess!");
            }

            if (Hangman.printWordState(word, playerGuesses)) {
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

    public void setupGameWord(){
        System.out.println("*Welcome to Patrik's Epic hangman royale!*");
        System.out.println();

        System.out.println("1 or 2 players?");

        String players = keyboard.nextLine();
        if (players.equals("1")) {
            try{
                scanner = new Scanner(new File("C:\\Users\\patri\\IdeaProjects\\Cv\\src\\main\\java\\Hangman\\wordlist.txt"));
            }catch(Exception e) {
                e.printStackTrace();
            }
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
    }
}
