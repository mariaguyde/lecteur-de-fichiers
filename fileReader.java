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
	    String TextContainerPourComparaison = "";

		// file Fichier = new file ("/Users/guydefontgalland/Desktop/read.meMaria.txt", "read.meMaria.txt");
        
        /*----------------------------------------- MESSAGE DE BIENVENUE ---------------------------------------------------*/
		System.out.println("================================= Lecteur de fichiers ==============================================");
		System.out.println(" \n" + "Veuillez choisir un fichier que vous souhaitez lire. ");

		
		
	    /*--------------------------------------------- CHOIX DU FICHIER ------------------------------------------------*/
		JFileChooser ChoixFichier = new JFileChooser();
		int returnVal = ChoixFichier.showOpenDialog(ChoixFichier);
		System.out.println("Vous avez choisi le fichier suivant : " + ChoixFichier.getSelectedFile().getName() + " \n");
		file fileName = new file(ChoixFichier.getSelectedFile().getAbsolutePath(), ChoixFichier.getSelectedFile().getName());
		
		
		
		
		
		/* -------------------------------------- FICHIER AFFICHÉ À L'ENDROIT  -------------------------------------------*/
		System.out.println(" \n" + "================================= Fichier lu à l'endroit ===========================================" + " \n");
		BufferedReader LecteurFile = new  BufferedReader (new InputStreamReader(new FileInputStream (fileName.pathFile), StandardCharsets.UTF_8));
	    displayFile Lecteur = new displayFile (LecteurFile); 
		// APPEL DE LA FONCTION PERMETTANT D'AFFICHER LE TEXTE À L'ENDROIT
	    Lecteur.afficheLignes(Line, LecteurFile); 

	    
			
	    
	    
		/* ---------------------------------  FICHIER AFFICHÉ À L'ENVERS (EN TERME DE LIGNES) -----------------------------*/
		System.out.println(" \n" + " \n" + " \n" + "================================= Fichier lu à l'envers ============================================="+ " \n");
		BufferedReader LecteurFile2 = new  BufferedReader (new InputStreamReader(new FileInputStream (fileName.pathFile), StandardCharsets.UTF_8));
		displayReverseFile Lecteur2 = new displayReverseFile ();  		
		// ON STOCKE CHAQUE LIGNE RÉCUPÉRÉE DU FICHIER DANS UNE ARRAYLIST 
		for(Line = LecteurFile2.readLine(); Line != null ; Line = LecteurFile2.readLine()) {	
			texteAlEndroit.add(Line);
		}
		// APPEL DE LA FONCTION PERMETTANT D'AFFICHER LE TEXTE À L'ENVERS 
	    Lecteur2.inverseLignes(texteAlEndroit);
	   
	    
	    
			
		/* ----------------------FICHIER AFFICHÉ À L'ENVERS DE MANIÈRE PALINDROMIQUE  -------------------------------------*/
		System.out.println(" \n" + " \n" + " \n" +  "=============================== Fichier lu de manière palindromique =================================="+ " \n");
		BufferedReader LecteurFile3 = new  BufferedReader (new InputStreamReader(new FileInputStream (fileName.pathFile), StandardCharsets.UTF_8));
		displayFilePalindrome fileReverse = new displayFilePalindrome();
		String textRightSide = ""; 
        String space = " \n";
		for(Line = LecteurFile3.readLine(); Line != null ; Line = LecteurFile3.readLine()) {	
			// ON AFFICHE D'ABORD L TEXTE DU À L'ENDROIT 
			System.out.println(Line);
			TextContainerPourComparaison += Line;
			textRightSide += Line + space;
		}
		String LineReversed = fileReverse.reverse(textRightSide);
		System.out.println(LineReversed);
	   // System.out.println(TextContainerPourComparaison);
			
		
			
		/*---------------------------------------------- COMPARATEUR DE FICHIERS -------------------------------------------*/
		System.out.println(" \n" + " \n" + " \n" +  "================================= Comparateur de fichiers ====================================="+ " \n");
		System.out.println(" \n" + "On va comparer les deux fichiers que vous avez choisi plus tôt.");
		CompareFiles(TextContainerPourComparaison);

	}
	
	
	public static void CompareFiles (String ContainerText) throws IOException {
		
		 /*--------------------------------------------- CHOIX DU DEUXIÈME FICHIER POUR COMPARER  ------------------------------------------------*/
		JFileChooser ChoixFichier2 = new JFileChooser();
		int returnVal = ChoixFichier2.showOpenDialog(ChoixFichier2);
		System.out.println( " \n" + "Vous avez choisi le fichier suivant : " + ChoixFichier2.getSelectedFile().getName() + " \n");
		file fileName2 = new file(ChoixFichier2.getSelectedFile().getAbsolutePath(), ChoixFichier2.getSelectedFile().getName());
	
		 /*--------------------------------------------- AFFICHAGE DU CONTENU DU SECOND FICHIER  ------------------------------------------------*/
		System.out.println(" \n" + "================================= Contenu du fichier n°2 ===========================================" + " \n");
		BufferedReader LecteurForFile2 = new  BufferedReader (new InputStreamReader(new FileInputStream (fileName2.pathFile), StandardCharsets.UTF_8));
	    displayFile Lecteur2 = new displayFile (LecteurForFile2); 
	    String LineFichier2 = "";
	    String space = "\n";
		String ContainerText2 = ""; 
		
		for(LineFichier2 = LecteurForFile2.readLine(); LineFichier2 != null ; LineFichier2 = LecteurForFile2.readLine()) {	
			System.out.println(LineFichier2);		
			ContainerText2 += LineFichier2 ;
		}
		
		//System.out.println(ContainerText2);
		//System.out.println(ContainerText2.compareTo(ContainerText));
	
	    
	    /*------------------------------------------ COMPARE LES CONTENUES DES DEUX FICHIERS CHOISIS --------------------------------------------*/
		// GRÂCE À compareTo, ON PEUT DÉTECTER LES DIFFÉRENCES ENTRE LES CONTENUS DES DEUX TEXTES STOCKÉES DANS DES STRINGS
		// SI LE RESULTAT DE CETTE DIFFERENCE EST EGAL À 0, ALORS IL N'Y A PAS DE DIFFÉRENCES DONC LES FICHIERS SONT IDENTIQUES
	    if (ContainerText2.compareTo(ContainerText) == 0) {
			System.out.println(" \n" + "Le contenu du fichier que vous avez choisi en premier et le contenu du deuxième fichier sont identiques ! ");
		}
	    // DANS LE CAS CONTRAIRE, LE RESULTAT NOUS RENVOIE UNE VALEUR DIFFÉRENTE DE 0
		else if (ContainerText2.compareTo(ContainerText) != 0){
			System.out.println(" \n" + "Le contenu du fichier que vous avez choisi en premier et le contenu du deuxième fichier sont différents !");
		}
		
		
	}
}
