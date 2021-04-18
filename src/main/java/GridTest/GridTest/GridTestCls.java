package GridTest.GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTestCls {

	public static void main(String[] args) throws MalformedURLException {
	
		//1)Desired Capabilities tanimlama: Browser,isletim sistemi
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//2)Chrome Options dan obje olustur
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		//3)Hub adresini ver
		
		String hubUrl="http://192.168.1.6:4443/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		
		
		driver.close();
		

	}

}
