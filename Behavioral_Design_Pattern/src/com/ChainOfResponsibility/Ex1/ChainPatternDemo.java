package com.ChainOfResponsibility.Ex1;

public class ChainPatternDemo {
	    private static Logger getChainOfLoggers() {

	        Logger errorLogger = new ErrorLogger(Logger.ERROR);
	        Logger fileLogger = new FileLogger(Logger.INFO);
	        Logger consoleLogger = new ConsoleLogger(Logger.DEBUG);

	        errorLogger.setNextLogger(fileLogger);
	        fileLogger.setNextLogger(consoleLogger);

	        return errorLogger;
	    }

	    public static void main(String[] args) {
	        Logger loggerChain = getChainOfLoggers();

	        loggerChain.logMessage(Logger.DEBUG, "This is a DEBUG level message.");
	        loggerChain.logMessage(Logger.INFO, "This is an INFO level message.");
	        loggerChain.logMessage(Logger.ERROR, "This is an ERROR level message.");
	    }
}
