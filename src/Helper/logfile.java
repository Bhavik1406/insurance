package Helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logfile {

public static Logger logme(String classname,String path){
		
		Logger logger = Logger.getLogger(classname);
		PropertyConfigurator.configure(path);
		return logger;
	}
	
	public static void debugme(Logger logger,String message){
		
		logger.debug(message);
	}
	public static void infome(Logger logger,String message){
		
		logger.info(message);
	}
	public static void warnme(Logger logger,String message){
		
		logger.warn(message);
	}
	public static void errorme(Logger logger,String message){
		
		logger.error(message);
	}
	public static void fatalme(Logger logger,String message){
		
		logger.fatal(message);
	}
}
