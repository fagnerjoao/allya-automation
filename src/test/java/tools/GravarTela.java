package tools;

import java.applet.Applet;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import atu.testrecorder.ATUTestRecorder;

public class GravarTela {
/*
	@BeforeMethod
	public synchronized void beforeMethod (Method method) throws MalformedURLException{
		appLogs.debug("Starting exection of test case: "+method.getName());
		DateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();
		try{
		recorder = new ATUTestRecorder(System.getProperty("user.dir") + "\\ScriptVideos\\", method.getName() + "-" + dateFormat.format(date), false);
		} catch (Exception e){
		Applet.debug("Error in findin the location of video.");
		}

		//start recording
		try{
		recorder.start();
		} catch (Exception e){
		appLogs.debug("Erro ao localizar o video.");
	}

	@BAfterMethod
	public void afterMethod(ITestResult result) {
		try {
			recorder.stop();
		} catch (Exception e) {
			appLogs.debug("Incapaz de parar a gravação");
		}
	}
*/
}
