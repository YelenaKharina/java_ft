package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;
import ru.qa.ft.addressbook.module.GroupData;

import java.util.concurrent.TimeUnit;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    //проверка существования контактов, при отсутствии контакт создается
    if (! app.getNavigationHelper().isThereAElement()) {
      app.getContactHelper().createContact(new ContactData("firstname", "lastname", "address2", "email", "home", "name"), true);
    }
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().selectElement(0);
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().confirmContactDeletion();
    app.getContactHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }
}
