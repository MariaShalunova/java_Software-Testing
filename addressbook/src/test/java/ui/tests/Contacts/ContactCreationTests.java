package ui.tests.Contacts;

import org.testng.annotations.*;
import ui.model.ContactData;
import ui.tests.TestBase;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().goToContactsPage();
        app.getContactHelper().fillContactForm(new ContactData(
                "qwe", "qwe", "qwe", "qwe",
                "qwe", "qwe", "qwe", "qwe", "qwe",
                "mobile", "qwe", "qwe", "qwe", "qwe",
                "qwe", "qwe", "18", "February",
                "1222", "29", "January", "1234",
                "test", "qweqwe", "qweqwe", "qweqwe"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactsPage();
    }

}
