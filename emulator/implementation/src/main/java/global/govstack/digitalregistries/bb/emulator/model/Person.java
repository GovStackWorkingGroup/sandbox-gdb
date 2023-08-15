package global.govstack.digitalregistries.bb.emulator.model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(nullable = false, unique = true)
    private String personalIdCode;
    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String dateOfBirth;

    @Column
    private String region;

    @Column
    private String homeAddress;

    @Column
    private String phoneNumber;

    @Column
    private String occupation;

    @Column
    private String municipality;

    @Column
    private String zipCode;

    public Person() {}

    public Person(String personalIdCode, String firstName, String lastName, String email, String dateOfBirth, String region, String homeAddress, String phoneNumber, String occupation, String municipality, String zipCode) {
        this.personalIdCode = personalIdCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.region = region;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.occupation = occupation;
        this.municipality = municipality;
        this.zipCode = zipCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonalIdCode() {
        return personalIdCode;
    }

    public void setPersonalIdCode(String personalIdCode) {
        this.personalIdCode = personalIdCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegion() {
        return region;
    }

    public Person setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public Person setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getOccupation() {
        return occupation;
    }

    public Person setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    public String getMunicipality() {
        return municipality;
    }

    public Person setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Person setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
}
