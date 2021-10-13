package file_reader;

public class displayFilePalindrome {

	
public displayFilePalindrome () {
	
}

public static String reverse (String line) {
		
		char [] lettres = new char [line.length()];
		
		int letterIndex = 0;
		for (int i = line.length() -1; i>= 0; i--) {
			lettres[letterIndex] = line.charAt(i);
			letterIndex++;
		}
		
		String reverse = " "+" \n";
		for (int i =0; i < line.length(); i++) {
			reverse = reverse + lettres[i];
		}
		return reverse;
		
	}

}
