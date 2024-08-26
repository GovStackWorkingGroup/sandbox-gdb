package global.govstack.digitalregistries.bb.emulator.dto.person;

public class PersonDto {
    private Integer id;
    private String  personalIdCode;
    private String  firstName;
    private String  lastName;
    private String  email;
    private String  dateOfBirth;
    private String  region;
    private String  homeAddress;
    private String  phoneNumber;
    private String  occupation;
    private String  municipality;
    private String  zipCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public PersonDto setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public PersonDto setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PersonDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getOccupation() {
        return occupation;
    }

    public PersonDto setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    public String getMunicipality() {
        return municipality;
    }

    public PersonDto setMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public PersonDto setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
}
