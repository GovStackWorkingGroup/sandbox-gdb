package global.govstack.digitalregistries.bb.emulator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Example {

    @Id
    private String id;
    private String name;

    public Example() {}

    public Example(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Example setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Example setName(String name) {
        this.name = name;
        return this;
    }
}
