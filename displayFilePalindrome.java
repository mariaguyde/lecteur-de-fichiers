package file_reader;

public class displayFilePalindrome {

	
public displayFilePalindrome () {
	
}

public static String reverse (String line) {
		
	    // ON RÉCUPÈRE LA LIGNE, ON DÉCOMPOSE CHAQUE LETTRE ET ON LES INVERSE LORS DE L'AFFICHAGE (DANS LA SECONDE BOUCLE FOR)
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
