import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mushrooms {

	public static void main(String args[]) throws FileNotFoundException {
		File mushroomData = new File("mushroomproject");
		Scanner mushroomReader = new Scanner(mushroomData);
		int[] poisonous = new int[8125];
		int[] edible = new int[8125];
		canEat(poisonous, edible, mushroomReader);
	}

	public static void canEat(int[] poisonous, int[] edible, Scanner mushroomReader) {

		while (mushroomReader.hasNextLine()) {
			int counterA = 0;
			int counterB = 0;
			int mushroomId = 0;
			String line = mushroomReader.nextLine();
			for (int i = 0; i <= line.length(); i = i + 5) {
				char currentChar = line.charAt(i);
				if (currentChar == 'p') {
					poisonous[counterA] = mushroomId;
					counterA++;
					mushroomId++;
				} else if (currentChar == 'e') {
					edible[counterB] = mushroomId;
					counterB++;
					mushroomId++;
				}
			}
		}
	}
}
