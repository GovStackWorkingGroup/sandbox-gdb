package global.govstack.digitalregistries.bb.emulator.dto.person;

public class PersonDto {
    private Integer id;
    private String  foundationalId;
    private String  firstName;
    private String  lastName;
    private String  email;
    private String  dateOfBirth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoundationalId() {
        return foundationalId;
    }

    public void setFoundationalId(String foundationalId) {
        this.foundationalId = foundationalId;
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

}
