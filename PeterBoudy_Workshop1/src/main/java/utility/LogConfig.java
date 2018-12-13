package utility;
import java.util.logging.*;

public class LogConfig {

		private final static Logger logger = Logger.getLogger(LogConfig.class.getName());
		private final static ConsoleHandler consoleHandler = new ConsoleHandler();
		
		public static Logger getLogger() {
			LoggerStart();
			return logger;
		}
		
		public static void LoggerStart() {
			
			logger.setLevel(Level.ALL);
			LogManager.getLogManager().reset();
			
			logger.addHandler(consoleHandler);
			consoleHandler.setLevel(Level.ALL);
		}
		
			public static void setHandlerLevel(Level level) {
			consoleHandler.setLevel(level);
			
		}

	}