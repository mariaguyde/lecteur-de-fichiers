package file_reader;

public interface lecteurFichiers {
	
	// les différentes fonctions dont on aura besoin pour lire notre fichier 
	Object open ();
	Object close (); 
	Object select ();
	Object display ();
	
}
