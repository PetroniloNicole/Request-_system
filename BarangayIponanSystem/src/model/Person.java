/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Person {

    protected String Lastname;
    protected String Firstname;
    protected String Middlename;
    protected String Birthdate;
    protected String address;
    protected String Email;
    protected String Contact;
    protected String CivilStatus;
    protected String Gender;
    protected String Occupation;
    protected String IDType;
   
    

    public Person(String Lastname, String Firstname,String Middlename,String Birthdate, String address, String Email, String Contact, String CivilStatus,String Gender, String Occupation, String IDType) {
        this.Lastname = Lastname;
        this.Firstname = Firstname;
        this.Middlename = Middlename;
        this.Birthdate = Birthdate;
        this.address = address;
        this.Email = Email;
        this.Contact = Contact;
        this.CivilStatus = CivilStatus;
        this.Gender = Gender;
        this.Occupation= Occupation;
        this.IDType = IDType;
        
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }
     public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }
     public String getMiddlename() {
        return Middlename;
    }

    public void setMiddlename(String Middlename) {
        this.Middlename = Middlename;
    } 
    public String getBirthdatee() {
        return Birthdate;
    }

    public void Birthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }
      public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
      public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
      public String getCivilStatus() {
        return CivilStatus;
    }

    public void setCivilStatus(String CivilStatus) {
        this.CivilStatus = CivilStatus;
    }
      public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
      public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }
      public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Abstract method
    public abstract String getInformation();
}
