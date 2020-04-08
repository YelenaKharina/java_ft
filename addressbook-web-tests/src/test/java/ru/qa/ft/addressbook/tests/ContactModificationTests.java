package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    //проверка существования контактов, при отсутствии контакт создается
    if (! app.getNavigationHelper().isThereAElement()) {
      app.getContactHelper().createContact(new ContactData("lastname", "firstname", "address2", "email", "home", "name"), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().selectElement(before.size() - 1);
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("lastname2", "firstname1", "address1", "email1", "home1", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());
  }
}
