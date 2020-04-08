package ru.qa.ft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("firstname", "lastname", "address2", "email", "home", "name"), true);
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
  }

}
