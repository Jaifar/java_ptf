package ru.stqa.pft.model;

public class ContactData {

  private int id;
  public String firstname;
  public String middlename;
  public String lastname;
  public String address;
  public String mobilePhones;
  public String workPhone;
  public String allPhones;
  public String allAdress;
  public String emailOne;
  public String emailTwo;
  public String emailThree;
  public String withAdress;
  public String withEmailOne;
  public String withEmailTwo;
  public String withEmailThree;
  public String allEmails;
  public String nickname;
  public String group;
  public String homephone;
  public String mobilephone;
  public String workphone;



  public String getAllemails()
 {
   return allEmails;
 }
  public String getAllPhones(){
      return allPhones;
  }


  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public  ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;
  }

  public String getWorkPhone() {
    return workPhone;
  }






  public String getFirstname() {
    return firstname;
  }
  public String getEmailTwo() {
    return emailTwo;
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
  public String getEmailThree() {
    return emailThree;
  }

  public String getGroup() {
    return group;
  }
  public String getHomephone() {return homephone;}
  public String getMobilephone(){ return mobilephone;}
  public String getWorkphone(){ return workphone;}
  public String getEmailOne() {
    return emailOne;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withFirstname(String firstname) {
    this.firstname = firstname;
    return this;
  }
  public ContactData withEmailOne(String emailOne) {
    this.withEmailOne = emailOne;
    return this;

  }
  public ContactData withEmailTwo(String emailTwo) {
    this.withEmailTwo = emailTwo;
    return this;
  }
  public ContactData withEmailThree(String  emailThree) {

    this.withEmailThree = emailThree;
    return this;

  }
  public ContactData withAddress(String address) {
    this.withAdress = address;
  return this;}

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
  public ContactData withAlladdress(String allAdress) {
    this.address = allAdress;
    return this;


  }
  public ContactData withAllemails(String allEmails) {
    this.allEmails = allEmails;
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





