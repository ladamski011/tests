package tests.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BeanToDeserialize {
    public String myName;
    public int identifier;

    @JsonCreator
    public BeanToDeserialize(@JsonProperty("name") String myName, @JsonProperty("id") int identifier) {
        this.myName = myName;
        this.identifier = identifier;
    }
}
