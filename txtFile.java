package file_reader;

abstract class txtFile extends file {

	public txtFile(String path, String nameFile)  {
		super(path, nameFile);
		
	}
	
	public String display() {
		return textContainertoDisplay;
	}
	
}