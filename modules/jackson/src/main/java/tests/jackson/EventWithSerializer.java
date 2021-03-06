package tests.jackson;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * {@link MyDateSerializer}
 */
public class EventWithSerializer {
    public String name;

    @JsonSerialize(using = MyDateSerializer.class)
    public Date date;

    /**
     * @param name
     * @param date input to {@link MyDateSerializer} and use with {@code Jackson}
     */
    public EventWithSerializer(String name, Date date) {
        this.name = name;
        this.date = date;
    }
}
