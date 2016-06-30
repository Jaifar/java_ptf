package ru.stqa.pft.tests;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String company;
  private final String address;
  private final String mobile;
  private final String workphone;
  private final String homephone;
  private final String fax;
  private final String email;
  private final String homeaddress;
  private final String notes;

  public ContactData(String firstname, String middlename, String lastname, String nickname, String company, String address, String mobile, String workphone, String homephone, String fax, String email, String homeaddress, String notes) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.address = address;
    this.mobile = mobile;
    this.workphone = workphone;
    this.homephone = homephone;
    this.fax = fax;
    this.email = email;
    this.homeaddress = homeaddress;
    this.notes = notes;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getMobile() {
    return mobile;
  }

  public String getWorkphone() {
    return workphone;
  }

  public String getHomephone() {
    return homephone;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getHomeaddress() {
    return homeaddress;
  }

  public String getNotes() {
    return notes;
  }
}
