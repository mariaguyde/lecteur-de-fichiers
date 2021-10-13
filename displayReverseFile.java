package file_reader;

import java.util.ArrayList;
import java.util.Collections;


public class displayReverseFile {

	public displayReverseFile  (){
		
	}
	
	public static void inverseLignes (ArrayList<String> texte2) {
		//AFIN DE LIRE LE FICHIER À L'ENVERS, ON INVERSE L'ORDRE DES ÉLÉMENTS DE L'OBJET 
		// GRÂCE À LA MÉTHODE REVERSE, ON COMMENCE DONC PAR AFFICHER D'ABORD LA DERNIÈRE LIGNE DU TEXTE
		 Collections.reverse(texte2);
		 texte2.forEach(ligne -> System.out.println(ligne));
    }

}

