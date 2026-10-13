/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ServiceRequest {

    // =========================
    // REQUEST INFORMATION
    // =========================
    private int requestId;
    private int residentId;

    // =========================
    // PERSONAL INFORMATION
    // =========================
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;
    private String gender;
    private String address;
    private String civilStatus;
    private String contactNumber;
    private String email;
    private String occupation;
    private String idType;
    private String idNumber;

    // =========================
    // SERVICE REQUEST DETAILS
    // =========================
    private String serviceType;
    private String purpose;
    private String additionalInfo;

    // =========================
    // DOCUMENT REQUIREMENTS
    // =========================
    private boolean validId;
    private boolean proofOfAddress;
    private boolean otherDocuments;

    // =========================
    // REQUEST STATUS
    // =========================
    private String requestDate;
    private String status;

    // =========================
    // PAYMENT INFORMATION
    // =========================
    private String paymentMethod;
    private double amountDue;
    private double amountPaid;
    private String paymentDate;
    private String referenceNumber;
    private String paymentRemarks;

    // =========================
    // CONSTRUCTOR
    // =========================
    public ServiceRequest(
            int requestId,
            int residentId,

            String firstName,
            String middleName,
            String lastName,
            String birthDate,
            String gender,
            String address,
            String civilStatus,
            String contactNumber,
            String email,
            String occupation,
            String idType,
            String idNumber,

            String serviceType,
            String purpose,
            String additionalInfo,

            boolean validId,
            boolean proofOfAddress,
            boolean otherDocuments,

            String requestDate,
            String status,

            String paymentMethod,
            double amountDue,
            double amountPaid,
            String paymentDate,
            String referenceNumber,
            String paymentRemarks) {

        this.requestId = requestId;
        this.residentId = residentId;

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.civilStatus = civilStatus;
        this.contactNumber = contactNumber;
        this.email = email;
        this.occupation = occupation;
        this.idType = idType;
        this.idNumber = idNumber;

        this.serviceType = serviceType;
        this.purpose = purpose;
        this.additionalInfo = additionalInfo;

        this.validId = validId;
        this.proofOfAddress = proofOfAddress;
        this.otherDocuments = otherDocuments;

        this.requestDate = requestDate;
        this.status = status;

        this.paymentMethod = paymentMethod;
        this.amountDue = amountDue;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.referenceNumber = referenceNumber;
        this.paymentRemarks = paymentRemarks;
    }

    // =========================
    // REQUEST GETTERS
    // =========================

    public int getRequestId() {
        return requestId;
    }

    public int getResidentId() {
        return residentId;
    }

    // =========================
    // PERSONAL INFORMATION GETTERS
    // =========================

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getIdType() {
        return idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    // =========================
    // SERVICE REQUEST GETTERS
    // =========================

    public String getServiceType() {
        return serviceType;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    // =========================
    // DOCUMENT GETTERS
    // =========================

    public boolean isValidId() {
        return validId;
    }

    public boolean isProofOfAddress() {
        return proofOfAddress;
    }

    public boolean isOtherDocuments() {
        return otherDocuments;
    }

    // =========================
    // REQUEST STATUS GETTERS
    // =========================

    public String getRequestDate() {
        return requestDate;
    }

    public String getStatus() {
        return status;
    }

    // =========================
    // PAYMENT GETTERS
    // =========================

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getPaymentRemarks() {
        return paymentRemarks;
    }

    // =========================
    // HELPER METHOD
    // =========================

    public String getFullName() {

        String name = firstName;

        if (middleName != null && !middleName.trim().isEmpty()) {
            name += " " + middleName;
        }

        name += " " + lastName;

        return name;
    }
}