package global.govstack.digitalregistries.bb.emulator.model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(nullable = false, unique = true)
    private String foundationalId;
    @Column(nullable = false)
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String dateOfBirth;

    public Person() {}

    public Person(String foundationalId, String firstName, String lastName, String email, String dateOfBirth) {
        this.foundationalId = foundationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
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
