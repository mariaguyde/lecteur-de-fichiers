package file_reader;

class file implements lecteurFichiers {

	String pathFile; 
	String nameFile; 
	
	public file (String path, String name) {
		this.pathFile = path;
		this.nameFile = name;
	}
	
	public Object open () {
		return nameFile;
		
	}
	
	public Void close () {
		return null;		
	}
	
	public Object select () {
		return nameFile;
	}
	
	public Object display() {
		return nameFile;
		
	}
	

}

