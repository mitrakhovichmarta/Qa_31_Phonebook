package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if (!app.getHelperUser().isLogged()) {
            app.getHelperUser().login(new User().withEmail("mitrakhovichmarta@gmail.com")
                    .withPassword("Qwerty2025!"));
        }


    }


    @Test
    public void removeFirstContact() {
        if (app.getHelperContact().provideContacts()){
            app.getHelperContact().removeFirstContact();
        }
        Assert.assertTrue(app.getHelperContact().provideContacts());

    }

    @Test
    public void removeAllContacts() {
      if (app.getHelperContact().provideContacts()){
          app.getHelperContact().removeAllContacts();
      }
      Assert.assertTrue(app.getHelperContact().provideContacts());
    }

}
