package com.nt.sbeans;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogicWriter implements LogWriter {
	private String filePath;
	public  FileLogicWriter(String filePath) {
		this.filePath=filePath;
		
	}

	@Override
	public void write(String message) {
		try(FileWriter fw= new FileWriter(filePath, true)){
			fw.write(message +System.lineSeparator());
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
