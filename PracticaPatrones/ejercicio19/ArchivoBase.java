package io.github.unlp_oo.archetype;

//concrete component 
public class ArchivoBase implements Archivo {
	private FileOO2 file;

	public ArchivoBase(FileOO2 file) {
		this.file = file;
	}
	
	@Override
	public String prettyPrint() {
		return file.getNombre();
	}
	
	@Override
	public FileOO2 getFile() {	
		return file;
	}
	
}
