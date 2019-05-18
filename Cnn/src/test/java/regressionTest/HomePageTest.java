package regressionTest;

import base.CommonAPI;
import org.testng.annotations.Test;
import regression.HomePage;

public class HomePageTest extends CommonAPI {

    HomePage homePage;

    @Test
    public void TestHome(){
        homePage.Homepage1();
        System.out.println(driver.getTitle());
    }



}
