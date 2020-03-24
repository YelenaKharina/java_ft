package ru.qa.ft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    goToAddNewContactPage();
    fillContactForm(new ContactData("firstname", "middlename", "lastname", "address2", "email", "home"));
    submitContactCreation();
    returnToHomePage();
  }

}
