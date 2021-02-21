package com.luvina;

public class GIF implements IFile {

	@Override
	public void openFile(String path) {
		System.out.println("Open file GIF");
	}

	@Override
	public void parseFile(IFile file) {
		System.out.println("Parse File GIF");
	}

	@Override
	public void saveFile() {
		System.out.println("Save File GIF");
	}

}
