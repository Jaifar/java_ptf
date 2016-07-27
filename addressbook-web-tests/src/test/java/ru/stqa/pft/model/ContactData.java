package ru.stqa.pft.model;

public class ContactData {
 private  int id;
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private String group;


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;

  }

  @Override
  public int hashCode() {
    return lastname != null ? lastname.hashCode() : 0;
  }

  public ContactData(String firstname, String middlename, String lastname, String nickname, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.group = group;}

    public ContactData(int id, String firstname, String middlename, String lastname, String nickname, String group) {
      this.id = id;
      this.firstname = firstname;
      this.middlename = middlename;
      this.lastname = lastname;
      this.nickname = nickname;
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


  public String getGroup() {
    return group;
  }





  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;

  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", firstname='" + firstname + '\'' +
            ", middlename='" + middlename + '\'' +
            ", lastname='" + lastname + '\'' +
            ", nickname='" + nickname + '\'' +
            ", group='" + group + '\'' +
            '}';
  }
}

