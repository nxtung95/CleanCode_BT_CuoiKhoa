package com.luvina;

public class JPG implements IFile {

	@Override
	public void openFile(String path) {
		System.out.println("Open file JPG");
	}

	@Override
	public void parseFile(IFile file) {
		System.out.println("Parse File JPG");
	}

	@Override
	public void saveFile() {
		System.out.println("Save File JPG");
	}
}
