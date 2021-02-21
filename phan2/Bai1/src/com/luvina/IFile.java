package com.luvina;

public interface IFile {
	public void openFile(String path);
	public void parseFile(IFile file);
	public void saveFile();
}
