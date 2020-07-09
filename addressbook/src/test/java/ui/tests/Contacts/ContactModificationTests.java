package ui.tests.Contacts;

import org.testng.annotations.Test;
import ui.model.ContactData;
import ui.tests.TestBase;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContractModification() {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData(
                    "qwe", "qwe", "qwe", "qwe",
                    "qwe", "qwe", "qwe", "qwe", "qwe",
                    "mobile", "qwe", "qwe", "qwe", "qwe",
                    "qwe", "qwe", "18", "February",
                    "1222", "29", "January", "1234",
                    "[none]", "test", "test", "test"));
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData(
                "test", "test", "test",
                "test", "test", "test", "test",
                "test", "test", "mobile", "test",
                "test", "test", "test", "test",
                "test", "10", "February", "2000",
                "13", "February", "2000", null, "test",
                "test", "test"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactsPage();
    }
}
