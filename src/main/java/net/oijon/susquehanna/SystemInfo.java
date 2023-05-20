package net.oijon.susquehanna;

//last edit: 2/13/23 -N3

/**
 * Allows access to version numbers throughout the program.
 * 
 * Edit version information here to have it propogate throughout the entire program.
 * @author alex
 *
 */
public class SystemInfo {

    public static String javaVersion() {
        return System.getProperty("java.version");
    }

    public static String javafxVersion() {
        return System.getProperty("javafx.version");
    }
    
    public static String susquehannaVerNum() {
    	return "0.0.3";
    }
    
    public static String susquehannaVerName() {
    	return "Otsego";
    }
    
    public static boolean isSnapshot() {
    	return true;
    }
    
    public static String buildName() {
    	if (isSnapshot()) {
    		return "23w20a";
    	} else {
    		return susquehannaVerName() + ", " + susquehannaVerNum();
    	}
    }
    
    public static String utilsVersion() {
    	return net.oijon.utils.info.Info.getVersion();
    }
    
    public static String utilsVersionNum() {
    	return net.oijon.utils.info.Info.getVersionNum();
    }
    
    public static String susquehannaVersion() {
    	
    	String returnString = susquehannaVerNum() + " \"" + susquehannaVerName() + "\"";
    	
    	if (isSnapshot()) {
    		returnString += ", build " + buildName() + " ***SNAPSHOT VERSION***";
    	}
    	return returnString;
    }

}