package ru.qa.ft.addressbook.tests;

import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().selectElement();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("firstname1", "middlename1", "lastname1", "address1", "email1", "home1", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
  }
}
