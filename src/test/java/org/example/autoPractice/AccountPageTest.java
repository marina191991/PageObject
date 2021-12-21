package org.example.autoPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountPageTest extends AbstractTest {

   @Test
   void submitLogOut() {
      new LoginPage(getWebDriver()).emailSend("martiniz1901@gmail.com").passwordSend("Test124Test").submitLoginClick();
      Assertions.assertTrue(new AccountPage(getWebDriver()).submitLogOutChek().equals("Log me out"),"");
   }

   @Test
   void submitViewCart () {
      new LoginPage(getWebDriver()).emailSend("martiniz1901@gmail.com").passwordSend("Test124Test").submitLoginClick();
      Assertions.assertTrue(new AccountPage(getWebDriver()).submitViewCartChek().equals("View my shopping cart"),"");
   }

   @Test
   void submitCreditSlips() {
      new LoginPage(getWebDriver()).emailSend("martiniz1901@gmail.com").passwordSend("Test124Test").submitLoginClick();
      Assertions.assertTrue(new AccountPage(getWebDriver()).submitCreditSlipsClick().equals("Credit slips"),"");
   }

}
