package ru.qa.ft.addressbook.module;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String address2;
  private final String email;
  private final String home;
  private String group;

  public ContactData(String firstname, String lastname, String address2, String email, String home, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.address2 = address2;
    this.email = email;
    this.home = home;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address2;
  }

  public String getEmail() {
    return email;
  }

  public String getHome() {
    return home;
  }

  public String getGroup() {
    return group;
  }
}
