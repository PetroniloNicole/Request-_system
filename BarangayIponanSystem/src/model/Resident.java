/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Resident extends Person {

    private int residentId;

    private String Firstname;
    private String Lastname;
    private String Middlename;

    private String Birthdate;
    private String Gender;
    private String CivilStatus;
    private String Contact;
    private String Email;
    private String Occupation;
    private String IDType;
    

    public Resident(String Lastname, String Firstname, String Middlename, String Birthdate, String address, String Email, String Contact, String CivilStatus, String Gender, String Occupation, String IDType) {
        super(Lastname, Firstname, Middlename, Birthdate, address, Email, Contact, CivilStatus, Gender, Occupation, IDType);
    }



    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getBirthDate() {
        return Birthdate;
    }

    public String getGender() {
        return Gender;
    }

    public String getCivilStatus() {
        return CivilStatus;
    }

    public String getContactNumber() {
        return Contact;
    }

    public String getEmail() {
        return Email;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String getIDType() {
        return IDType;
    }

   
    @Override
    public String getInformation() {
        return "Resident: "
                + Firstname + " "
                + Middlename + " "
                + Lastname
                + " - " 
                + address
                + Email + " "
                + Contact + " "
                + Birthdate + " "
                + Gender + " "
                + CivilStatus + " "
                + Occupation + " "
                + IDType + " ";
               
    }
}