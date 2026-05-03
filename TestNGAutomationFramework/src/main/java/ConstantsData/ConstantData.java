package ConstantsData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConstantData {
	
	
	public static final String PROP_FILE_PATH ="src/main/java/Global.properties";
	
	public static final String EXCEl_PATH = "src/main/java/TestData/LoginCred.xlsx";
	
	public static final String SCREENSHOT_IMAGE_PATH= "target/FailedImage/" + LocalDateTime.now().format(DateTimeFormatter.
			ofPattern("yyyyMMdd_HHmmss"))+ "_Test.png";
	

}