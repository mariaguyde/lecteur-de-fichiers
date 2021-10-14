package file_reader;

import java.io.BufferedReader;
import java.io.IOException;

// CLASSE POUR AFFICHER LE TEXTE DANS LE BON SENS 
public class displayRightSide extends DisplayTxt  {

	public displayRightSide(BufferedReader Lecteur) {
		// TODO Auto-generated constructor stub
		super(Lecteur);
	}
	
	
	public void afficheLignes (String line, BufferedReader Lecteur) { 
		try {
			for(line = Lecteur.readLine(); line != null ; line = Lecteur.readLine()) {
			    System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
