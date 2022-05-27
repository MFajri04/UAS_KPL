import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class informasi_mobil extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver =capabilities();
		
		//flow informasi mobil -> mobil 
		driver.findElementById("com.azhar.rentalmobil:id/btn_info_mobil").click();
		driver.findElementByXPath("//android.widget.TextView[4]").click();
	}

}
