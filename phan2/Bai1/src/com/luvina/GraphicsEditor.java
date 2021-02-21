package com.luvina;

public class GraphicsEditor {

	public static void main(String[] args) {
		String path = "./text.txt";
		IFile BMP = new BMP();
		BMP.openFile(path);
		BMP.saveFile();
		
		IFile JPG = new JPG();
		JPG.parseFile(BMP);
	}

}
