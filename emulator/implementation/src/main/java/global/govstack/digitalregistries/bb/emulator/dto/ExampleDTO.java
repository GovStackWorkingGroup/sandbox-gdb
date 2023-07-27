package global.govstack.digitalregistries.bb.emulator.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleDTO {

    @JsonProperty("Id")
    private String id = null;

    @JsonProperty("Name")
    private String name = null;

    public ExampleDTO() {}

    public ExampleDTO(String id, String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public ExampleDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ExampleDTO setName(String name) {
        this.name = name;
        return this;
    }
}
