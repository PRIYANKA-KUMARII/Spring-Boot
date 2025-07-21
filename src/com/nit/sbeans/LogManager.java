package com.nit.sbeans;

public class LogManager {
	private LogWriter logWriter;
	public void setLogWriter(LogWriter logWriter) {
		 this.logWriter= logWriter;
	}
	public void log(String msg) {
		if(logWriter== null) {
			 throw new IllegalStateException("LogWriter not cofigured!");
		}
		logWriter.write(msg);
	}

}
