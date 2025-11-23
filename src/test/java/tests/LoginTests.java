package tests;

import org.testng.annotations.Test;

import static tests.TestBase.app;

public class LoginTests extends TestBase {

        @Test
        public void loginSuccess(){
        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("mitrakhovichmarta@gmail.com", "Qwerty2025!");
        app.getHelperUser().submitLogin();


        //Assert

        }
    }

