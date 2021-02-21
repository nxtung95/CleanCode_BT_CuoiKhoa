package com.luvina;

public class BMP implements IFile {

	@Override
	public void openFile(String path) {
		System.out.println("Open file BMP");
	}

	@Override
	public void parseFile(IFile file) {
		System.out.println("Parse File BMP");
	}

	@Override
	public void saveFile() {
		System.out.println("Save File BMP");
	}

}
