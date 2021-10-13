package file_reader;
import java.io.BufferedReader;
import java.io.IOException;


public class displayFile {
	
	// PROPRIÉTÉS
	String path; 
	String line; 
	file file; 
	BufferedReader Lecteur; 
	
	public displayFile (BufferedReader Lecteur) {
		this.Lecteur = Lecteur; 
		//this.file = file; 
	}


	public void afficheLignes (String line, BufferedReader Lecteur) { 
		try {
			for(line = Lecteur.readLine(); line != null ; line = Lecteur.readLine()) {
			    System.out.println(line);
;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
