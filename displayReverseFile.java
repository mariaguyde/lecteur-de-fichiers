package file_reader;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

// CLASSE POUR AFFICHER LE TEXTE À L'ENVERS 
public class displayReverseFile extends DisplayTxt {

	public displayReverseFile  (BufferedReader Lecteur){
		super(Lecteur);
	}
	
	public static String inverseLignes (ArrayList<String> texte2) {
		//AFIN DE LIRE LE FICHIER À L'ENVERS, ON INVERSE L'ORDRE DES ÉLÉMENTS DE L'OBJET D'OU LE CHOIX DE STOCKER LES LIGNES DANS UNE ARRAYLIST
		// GRÂCE À LA MÉTHODE REVERSE, ON COMMENCE DONC PAR AFFICHER D'ABORD LA DERNIÈRE LIGNE DU TEXTE ET AINSI DE SUITE
		 Collections.reverse(texte2);
		 texte2.forEach(ligne -> System.out.println(ligne));
		return null;
    }

}

