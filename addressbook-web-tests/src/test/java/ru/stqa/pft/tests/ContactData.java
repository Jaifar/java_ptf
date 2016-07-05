package ru.stqa.pft.tests;

public class ContactData {
  private final String firstname;
  private String middlename;
  private String lastname;
  private String nickname;
  private String company;
  private String address;
  private String mobile;
  private String workphone;
  private String homephone;
  private String fax;
  private String email;
  private String homeaddress;
  private String notes;
  private String group;

  public ContactData(String middlename, String homepage, String firstname) {
    this.firstname = firstname;
    this.middlename = this.middlename;
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
    this.group = group;
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

  public String getGroup() {
    return group;
  }
}
