package hangman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class main {

	public static void main(String[] args) throws IOException  { 
		
		// create 5 words to play the game with
		String[] wordChoose = {"test","hangman","impossible",
							    "Youtube","skyrim"};
		// choose a random word
		char[] word = randomNumber(wordChoose).toCharArray();
		
		// create hidden word that is given to the player
		List<String> wordGiven = createEmptyWord(word);
		
		// Start the game
		playGame(word,wordGiven);
		
	
		
	
	}
	
	public static String randomNumber(String[] List) {
		// creates a random number of length 5, and picks a word based on that random number
		Random generator = new Random();
		int randomIndex = generator.nextInt(List.length);
		return List[randomIndex];
	}
	
	public static void playGame(char[] word, List<String> wordGiven) throws IOException {
		// create objects needed for the game
		boolean game = true;
		int LetterNotInWord = 0;
		List<String> MissedLetters = new ArrayList<String>();
		
		// start the loop for the game
		while (game == true) {
			int temp_number = 0;
			printWord(wordGiven);
			char letter = getLetter();
			int i;
			for (i = 0; i < word.length; i++) {
				if (word[i] == letter) {
					String str = String.valueOf(letter);
					wordGiven.set(i, str);
					temp_number++;
					
				}
			}
			// check whether a letter was added or not
			if (temp_number == 0) {
				LetterNotInWord++;
				String temp = String.valueOf(letter);
				MissedLetters.add(temp);
			}
			System.out.println(10 - LetterNotInWord + " Guesses left." + " Missed letters: " +
					MissedLetters);
			// check if the player has won
			if (wordGiven.contains("_") == false){
				printWord(wordGiven);
				System.out.println("You win!");
				game = false;
			}
			// check if the player has lost
			if (LetterNotInWord == 10) {
				System.out.println("You lose!");
				game = false;
			}
			
		}
		
	}
	public static void printWord(List<String> word) {
		// print the word that the player sees 
		String str="";
		for(String s : word){
			str=str + s + " ";
		}
		System.out.println(str);
	}
	
	public static char getLetter() throws IOException {
		// get the input from the user 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a letter"); 
		
		while (!scanner.hasNext	()) {
			scanner.nextLine();
			System.out.println("Give a letter");
		}
		//BufferedReader reader =  
        //  new BufferedReader(new InputStreamReader(System.in)); 
      
		// Reading data using readLine 
		//String letter = reader.readLine(); 
		String letter = scanner.next();
		if (letter.length() > 1) {
			System.out.println("Took only the first character given");
		}
		return letter.charAt(0);
		
		
	}
	
	public static List<String> createEmptyWord(char[] word) {
		// create hidden word that is given to the player with the correct
		// number of symbols 
		List<String> wordPlay = new ArrayList<String>();
		int i;
		for (i = 0; i < word.length; i++) {
			wordPlay.add("_");
		}
		return wordPlay;
	}
	
	public static void checkWin(List<String> wordGiven) {
		// check if the player has won (no more "_" in the givenWord)
		if (wordGiven.contains("_") == false) {
			
		}
		
	}
}
