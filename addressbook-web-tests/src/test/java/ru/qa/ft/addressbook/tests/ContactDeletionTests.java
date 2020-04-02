package ru.qa.ft.addressbook.tests;

import org.testng.annotations.Test;
import ru.qa.ft.addressbook.module.ContactData;
import ru.qa.ft.addressbook.module.GroupData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    //проверка существования контактов, при отсутствии контакт создается
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("firstname", "middlename", "lastname", "address2", "email", "home", "name1"), true);
    }
    app.getNavigationHelper().selectElement();
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().confirmContactDeletion();
    app.getNavigationHelper().returnToHomePage();
  }
}
