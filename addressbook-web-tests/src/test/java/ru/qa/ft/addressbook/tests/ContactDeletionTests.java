package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    //проверка существования контактов, при отсутствии контакт создается
    if (! app.getNavigationHelper().isThereAElement()) {
      app.getContactHelper().createContact(new ContactData("lastname", "firstname", "address2", "email", "home", "name"), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().selectElement(before.size() - 1);
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().confirmContactDeletion();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);

  }
}
