package connectdatabase;
import java.util.logging.*;
import java.io.*;


public class LogConfig {

		private final static Logger logger = Logger.getLogger(LogConfig.class.getName());
		private final static ConsoleHandler consoleHandler = new ConsoleHandler();
		
		public static Logger getLogger() {
			LoggerStart();
			return logger;
		}
		
		public static void LoggerStart() {

			LogManager.getLogManager().reset();
			logger.addHandler(consoleHandler);
			logger.setLevel(Level.ALL);
			consoleHandler.setLevel(Level.ALL);
		}
		
			public static void setHandlerLevel(Level level) {
			consoleHandler.setLevel(level);
			
		}

	}