package ru.stqa.pft.model;

public class ContactData {

  private int id;
  private String firstname;
  private String middlename;
  private String lastname;
  private String address;
  private String mobilePhones;
  private String workPhone;
  private String allPhones;

  private String getAllPhones() {
    return allPhones;
  }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String Allemails;
  private String nickname;
  private String group;
  private String homephone;
  private String mobilephone;
  private String workphone;


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
  public String getHomephone() {return homephone;}
  public String getMobilephone(){ return mobilephone;}
  public String getWorkphone(){ return workphone;}


  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withFirstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  public ContactData withMiddlename(String middlename) {
    this.middlename = middlename;
    return this;
  }

  public ContactData withLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }
  public ContactData withNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }
 public ContactData withHomePhone( String homephone){
   this.homephone = homephone;
   return  this;


 }
  public ContactData withMobilePhone (String mobilephone){
    this.mobilephone = mobilephone;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }

  public int getId() {
    return id;


  }
  public ContactData withAlladdress(String Alladdress) {
    this.address = Alladdress;
    return this;


  }
  public ContactData withAllemails(String Allemails) {
    this.Allemails = Allemails;
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
    return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;

  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    return result;
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

