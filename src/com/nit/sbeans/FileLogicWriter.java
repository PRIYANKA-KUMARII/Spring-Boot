package com.nit.sbeans;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogicWriter  implements LogWriter{

	@Override
	public void write(String message) {
	System.out.println("FileLogWriter:"+message);
		
	}


}
