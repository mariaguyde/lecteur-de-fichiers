package file_reader;

class file implements lecteurFichiers {

	String pathFile; 
	String nameFile; 
	String textContainertoDisplay; 
	
	public file (String path, String name) {
		this.pathFile = path;
		this.nameFile = name;
	}
	
	public String display() {
		return textContainertoDisplay;
	}
	

}

