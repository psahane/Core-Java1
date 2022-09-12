package String;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "is ab";
		String word = "is";
		String temp[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			
		if (word.equals(temp[i]))
			
		count++;
		}
		System.out.println("The string is: " + string);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");
		}
	}


