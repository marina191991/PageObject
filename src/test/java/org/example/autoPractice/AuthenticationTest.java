package org.example.autoPractice;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;



public class AuthenticationTest extends AbstractTest {



        @Test
        void testAuthentication() {
                new LoginPage(getWebDriver()).emailSend("martiniz1901@gmail.com").passwordSend("Test124Test").submitLoginClick();
                Assertions.assertEquals("My account - My Store", webDriver.getTitle(),"Страница акаунта недосупна");
        }

         @Test
          void testAuthenticationActions() {
                 new LoginPage(getWebDriver()).authentication("martiniz1901@gmail.com","Test124Test");
                 Assertions.assertEquals("My account - My Store", webDriver.getTitle(),"Страница акаунта недосупна");
        }


        @Test
        void testAuthenticationInvalid() {
                new LoginPage(getWebDriver()).emailSend("martiniz1901@gmail.com").passwordSend("Fail").submitLoginClickInvalid();
                Assertions.assertNotNull(webDriver.findElement(By.xpath("//*[@id='center_column']/div[@class='alert alert-danger']")),"Вход выполнен с некорректными данными");
        }


}
