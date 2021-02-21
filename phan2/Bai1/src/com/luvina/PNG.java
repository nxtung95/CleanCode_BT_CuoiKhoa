package com.luvina;

public class PNG implements IFile {

	@Override
	public void openFile(String path) {
		System.out.println("Open file PNG");
	}

	@Override
	public void parseFile(IFile file) {
		System.out.println("Parse File PNG");
	}

	@Override
	public void saveFile() {
		System.out.println("Save File PNG");
	}

}
