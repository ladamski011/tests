package tests.jackson;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "User")
public class UserWithRoot {
    public int id;
    public String name;

    public UserWithRoot(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
