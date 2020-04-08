package ru.qa.ft.addressbook.module;

public class ContactData {
  private final String lastname;
  private final String firstname;
  private final String address2;
  private final String email;
  private final String home;
  private String group;
  private String name;

  public ContactData(String lastname, String firstname, String address2, String email, String home, String group) {
    this.name = null;
    this.lastname = lastname;
    this.firstname = firstname;
    this.address2 = address2;
    this.email = email;
    this.home = home;
    this.group = group;
  }

  public ContactData(String name, String lastname, String firstname, String address2, String email, String home, String group) {
    this.name = name;
    this.lastname = lastname;
    this.firstname = firstname;
    this.address2 = address2;
    this.email = email;
    this.home = home;
    this.group = group;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFirstname() {
    return firstname;
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

  @Override
  public String toString() {
    return "ContactData{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    return name != null ? name.equals(that.name) : that.name == null;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}
