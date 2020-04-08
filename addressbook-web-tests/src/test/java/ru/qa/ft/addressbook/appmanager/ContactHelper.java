package ru.qa.ft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.qa.ft.addressbook.module.ContactData;

public class ContactHelper extends BaseHelper {

  public ContactHelper(WebDriver wd) {
    super (wd);
  }

  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address2"), contactData.getAddress());
    type(By.name("email"), contactData.getEmail());
    type(By.name("home"), contactData.getHome());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void goToAddNewContactPage() {
    //проверяем наличие заголовка и имя заголовка для страницы создания нового контакта
    //если выполняется, то выполняем выход из метода
    //если нет, то совершаем клик для перехода на страницу создания контакта
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")) {
      return;
    }
    click(By.linkText("add new"));
  }

  public void returnToHomePage() {
    //проверяем наличие таблицы
    //если выполняется, то выполняем выход из метода
    //если нет, то совершаем клик для перехода на домашнюю страницу
    //ПРОВЕРКУ УБРАЛА, т.к. тест для удаления контактов падает при подсчете после удаления
    //после выполнения этого метода с проверкой
    //if (isElementPresent(By.id("maintable"))) {
      //return;
    //}
    click(By.linkText("home"));
  }

  public void deleteSelectedContacts() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void confirmContactDeletion() {
    wd.switchTo().alert().accept();
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.xpath("(//input[@name='update'])[2]"));
  }

  public void createContact(ContactData contact, boolean creation) {
    goToAddNewContactPage();
    fillContactForm(contact, creation);
    submitContactCreation();
    returnToHomePage();
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}
