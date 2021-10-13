package file_reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;


public class fileReader {

	public static void main(String[] args) throws IOException {
		
		// PROPRIÉTÉS 
		String Line = ""; 
		ArrayList<String>  texteAlEndroit = new ArrayList<String>();
        String textContainerPalindrome = "";
		// file Fichier = new file ("/Users/guydefontgalland/Desktop/read.meMaria.txt", "read.meMaria.txt");
		
		
        
	    /*--------------------------------------------- CHOIX DU FICHIER ------------------------------------------------*/
		JFileChooser ChoixFichier = new JFileChooser();
		int returnVal = ChoixFichier.showOpenDialog(ChoixFichier);
		System.out.println("Choix de votre fichier fichier : " + ChoixFichier.getSelectedFile().getName() + " \n");
		file fileName = new file(ChoixFichier.getSelectedFile().getAbsolutePath(), ChoixFichier.getSelectedFile().getName());
		
		
		
		
		/* -------------------------------------- FICHIER AFFICHÉ À L'ENDROIT  -------------------------------------------*/
		System.out.println("============= Fichier lu à l'endroit  ==================");
		BufferedReader LecteurFile = new  BufferedReader (new InputStreamReader(new FileInputStream (fileName.pathFile), StandardCharsets.UTF_8));
	    displayFile Lecteur = new displayFile (LecteurFile); 
	    String ContainerText = "";
		// APPEL DE LA FONCTION PERMETTANT D'AFFICHER LE TEXTE À L'ENDROIT
		Lecteur.afficheLignes(Line, LecteurFile); 
	  
		
		
			
		/* ---------------------------------  FICHIER AFFICHÉ À L'ENVERS (EN TERME DE LIGNES) -----------------------------*/
		System.out.println(" \n" + " \n" + "============= Fichier lu à l'envers  ==================");
		BufferedReader LecteurFile2 = new  BufferedReader (new InputStreamReader(new FileInputStream (fileName.pathFile), StandardCharsets.UTF_8));
		displayReverseFile Lecteur2 = new displayReverseFile ();  		
		// ON STOCKE CHAQUE LIGNE RÉCUPÉRÉE DU FICHIER DANS UNE ARRAYLIST 
		for(Line = LecteurFile2.readLine(); Line != null ; Line = LecteurFile2.readLine()) {	
			texteAlEndroit.add(Line);
		}
		// APPEL DE LA FONCTION PERMETTANT D'AFFICHER LE TEXTE À L'ENVERS 
		Lecteur2.inverseLignes(texteAlEndroit);
	
		
		
			
		/* ----------------------FICHIER AFFICHÉ À L'ENVERS DE MANIÈRE PALINDROMIQUE  -------------------------------------*/
		System.out.println(" \n" + " \n" + "============= Fichier lu de manière palindromique  ==================");
		BufferedReader LecteurFile3 = new  BufferedReader (new InputStreamReader(new FileInputStream (fileName.pathFile), StandardCharsets.UTF_8));
		displayFilePalindrome fileReverse = new displayFilePalindrome();
		for(Line = LecteurFile3.readLine(); Line != null ; Line = LecteurFile3.readLine()) {	
			// ON AFFICHE D'ABORD L TEXTE DU À L'ENDROIT 
			System.out.println(Line);
			// APPEL DE LA FONCTION PERMETTANT D'INVERSER LES LETTRES DE LA LIGNE
			String LineReversed = fileReverse.reverse(Line);
			// ON STOCKE CHAQUE LIGNE DANS UNE VARIABLE 
			textContainerPalindrome += LineReversed;
		}
		// AFFICHAGE DU TEXTE DE MANIÈRE PALINDROMIQUE 
		System.out.println(textContainerPalindrome);
			
			
			
		
			
		/*-------------------------------------- COMPARATEUR DE FICHIERS --------------------------------------*/
		System.out.println(" \n" + " \n" + "============= Comparateur de fichiers  ==================");
		// Voici le contenu d'un string
		String texte3 = "TP Bootstrap\n"
				+ "\n"
				+ "J’ai bien pu recréer la page grâce à Bootstrap donc en utilisant les colonnes pour structurer la page. Ensuite, j’ai créer mes propres classes pour faire la mise en page et utiliser des notions qu’on a vu en cours comme le flexbox, les pseudo-classes dynamiques, le viewport ou des sélécteurs avancés.\n"
				+ ""; 
		
		if (texte3 == ContainerText) {
			System.out.println("Le contenu du fichier que vous avez choisi et le contenu du string sont identiques ! ");
		}
		else {
			System.out.println("Le contenu du fichier que vous avez choisi et le contenu du string sont différents !");
		}
	}
}
