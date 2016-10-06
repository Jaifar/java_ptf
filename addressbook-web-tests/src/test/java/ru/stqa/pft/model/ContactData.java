package ru.stqa.pft.model;

public class ContactData {

  private int id;
  public String firstname;
  public String middlename;
  public String lastname;
  public String address;
  public String workPhone;
  public String homephone;
  public String mobilephone;
  public String workphone;
  public String allPhones;
  public String email;
  public String email2;
  public String email3;
  public String withAddress;
  public String allEmails;
  public String nickname;
  public String group;
  public String phones;

 public String details;
  public String AllEmails;
  private String contactDetails;


  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public  ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
    return this;}

  public String getFirstname() {
    return firstname;
  }
  public String getEmailTwo() {return email2;}
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
    return email3;
  }
  public String getGroup() {
    return group;
  }
  public String getHomephone() {return homephone;}
  public String getMobilephone(){ return mobilephone;}
  public String getWorkphone(){ return workphone;}
  public String getEmailOne() {return email;}
  public String getAllAddress() {return address;}
  public String getAllPhones(){return phones;}
  public String getAddress() {return address;}
  public String getDetails() {return details;}
  public String getAllemails()
  {
    return allEmails;
  }

  public String getContactDetails() {return contactDetails;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withFirstname(String firstname) {
    this.firstname = firstname;
    return this;
  }


  public ContactData withEmail(String email) {
    this.email = email;
    return this;

  }
  public ContactData withEmail2(String email2) {
    this.email2 = email2;
    return this;
  }
  public ContactData withEmail3(String  email3) {

    this.email3 = email3;
    return this;

  }
  public ContactData withAddress(String address) {
    this.withAddress = address;
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
   return  this;}
   public ContactData withContactDetails(String contactDetails) {
     this.contactDetails = contactDetails;
     return this;
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
    public ContactData withDetails(String details) {
      this.details = details;
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
    if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
    if ( middlename != null ? ! middlename.equals(that.middlename) : that. middlename != null) return false;
    if (workPhone != null ? !workPhone.equals(that.workPhone) : that. workPhone != null) return false;
    if (allPhones != null ? !allPhones.equals(that.allPhones) : that.allPhones != null) return false;
    if ( email != null ? ! email.equals(that.email) : that.email != null) return false;
    if ( email2 != null ? ! email2.equals(that.email2) : that.email2 != null) return false;
    if ( email3 != null ? ! email3.equals(that.email3) : that.email3 != null) return false;
    if ( allEmails != null ? ! allEmails.equals(that. allEmails) : that. allEmails != null) return false;
    if ( address != null ? !  address.equals(that. address) : that. address != null) return false;
    if ( nickname != null ? ! nickname.equals(that.nickname) : that.nickname != null) return false;



    return details != null ? details.equals(that.details) : that.details == null;

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





