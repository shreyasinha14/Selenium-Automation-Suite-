package com.example.tests;

import com.example.pages.LoginPage;
import com.example.pages.DashboardPage;
import com.example.utils.ConfigReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        
        DashboardPage dashboardPage = loginPage.login(
            ConfigReader.get("login.username"),
            ConfigReader.get("login.password")
        );
        
        Assertions.assertTrue(dashboardPage.isDashboardDisplayed(), 
            "Dashboard should be displayed after successful login");
    }
}