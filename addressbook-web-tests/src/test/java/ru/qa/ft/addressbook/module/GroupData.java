package ru.qa.ft.addressbook.module;

public class GroupData {
  private final String name;
  private final String header;
  private final String footer;

  public GroupData(String name, String hearder, String footer) {
    this.name = name;
    this.header = hearder;
    this.footer = footer;
  }

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }
}
