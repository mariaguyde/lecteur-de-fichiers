package file_reader;

abstract class odtFile extends file {

	public odtFile(String path, String nameFile) {
		super(path, nameFile);
	}
	
	public String display() {
		return textContainertoDisplay;
	}
	
	
}

