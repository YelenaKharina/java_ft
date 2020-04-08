package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    //проверка существования контактов, при отсутствии контакт создается
    if (! app.getNavigationHelper().isThereAElement()) {
      app.getContactHelper().createContact(new ContactData("firstname", "lastname", "address2", "email", "home", "name"), true);
    }
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().selectElement(0);
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("firstname1", "lastname1", "address1", "email1", "home1", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }
}
