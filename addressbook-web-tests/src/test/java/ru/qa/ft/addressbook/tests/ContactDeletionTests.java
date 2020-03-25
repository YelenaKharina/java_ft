package ru.qa.ft.addressbook.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().selectElement();
    app.getContactHelper().deleteSelectedContacts();
    assertTrue(app.getContactHelper().closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    app.getNavigationHelper().returnToHomePage();
  }

}
