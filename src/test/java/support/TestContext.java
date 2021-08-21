package support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TestContext {
    static AppiumDriver driver;

    public static void initContext() {
        File app  = new File("src/test/resources/apk/app-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "@Pixel3a");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        //you are free to set additional capabilities
        try {
            driver = new AppiumDriver<MobileElement>(
                    new URL("http://0.0.0.0:4723/wd/hub"),
            //if it needs to use locally started server
            //then the target_ip is 127.0.0.1 or 0.0.0.0
            //the default port is 4723
                    capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
