package utilities;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverManager {
    private static DriverManager instance=null;

    private Page driver;

    private DriverManager(){
        Playwright playwright = Playwright.create();
        Page page = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500)).newPage();
        page.setViewportSize(1920, 1080);
        this.driver=page;
    }

    public static  DriverManager getInstance(){
        if(instance==null){
            instance = new DriverManager();
        }
        return instance;
    }

    public Page getDriver(){
        return driver;
    }
}
