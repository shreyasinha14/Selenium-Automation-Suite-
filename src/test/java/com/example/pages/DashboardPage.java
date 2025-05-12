package com.example.pages;

import com.example.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    
    public boolean isDashboardDisplayed() {
        return waitForElement(resolveSelector("dashboard.selector")).isDisplayed();
    }
    
    private By resolveSelector(String key) {
        String value = ConfigReader.get(key);
        if (value.startsWith("id:")) return By.id(value.substring(3));
        if (value.startsWith("xpath:")) return By.xpath(value.substring(6));
        if (value.startsWith("css:")) return By.cssSelector(value.substring(4));
        throw new IllegalArgumentException("Unsupported selector: " + value);
    }
}