package file_reader;

abstract class docxFile extends file {

	public docxFile(String path, String nameFile) {
		super(path, nameFile);
	}
	
	public String display() {
		return textContainertoDisplay;
	}
	
	
}

