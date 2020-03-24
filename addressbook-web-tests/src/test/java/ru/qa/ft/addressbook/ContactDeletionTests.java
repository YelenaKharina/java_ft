package ru.qa.ft.addressbook;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    selectContact();
    deleteSelectedContacts();
    assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    returnToHomePage();
  }

}
