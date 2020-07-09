package ui.tests.Contacts;

import org.testng.annotations.Test;
import ui.model.ContactData;
import ui.tests.TestBase;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContractDeletion () {
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
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.closeAlert();
        app.getNavigationHelper().goToHomePage();
    }
}
