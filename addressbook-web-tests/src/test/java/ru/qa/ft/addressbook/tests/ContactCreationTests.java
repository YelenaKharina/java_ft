package ru.qa.ft.addressbook.tests;

import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().createContact(new ContactData("firstname", "middlename", "lastname", "address2", "email", "home", "name1"), true);
  }

}
