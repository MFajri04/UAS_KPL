import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class sewa_mobil extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver =capabilities();
		
		//flow sewa mobil->dahtar sewa => masuk data sewa => tambah
		driver.findElementById("com.azhar.rentalmobil:id/btn_sewa").click();
		driver.findElementByXPath("//android.widget.Button[@text='TAMBAH PENYEWA']").click();
		driver.findElementById("com.azhar.rentalmobil:id/eTNama").sendKeys("JERY");
		driver.findElementById("com.azhar.rentalmobil:id/eTAlamat").sendKeys("Nagan Raya");
		driver.findElementById("com.azhar.rentalmobil:id/eTHP").sendKeys("082299297465");
		driver.findElementById("com.azhar.rentalmobil:id/eTLamaSewa").sendKeys("2");
		driver.findElementById("com.azhar.rentalmobil:id/selesaiHitung").click();
		
	}

}
