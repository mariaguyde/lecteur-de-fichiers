package file_reader;

import java.io.BufferedReader;
import java.io.IOException;

// CLASSE POUR LES DIFFÉRENTS AFFICHAGES DU TEXTE (on a étendue cette classe dans les trois autres classes affichant le texte (à l'endroit, à l'envers, palindromique) 
public abstract class DisplayTxt extends displayFile implements lecteurFichiers {

	public DisplayTxt(BufferedReader Lecteur) {
		super(Lecteur);
	}
	

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void open() {
		// TODO Auto-generated method stub
		return null;
	}
 

}
