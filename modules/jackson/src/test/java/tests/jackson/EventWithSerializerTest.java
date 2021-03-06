package tests.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EventWithSerializerTest {
    @Test
    public void testSerialization() throws ParseException, JsonProcessingException {
        SimpleDateFormat df
                = new SimpleDateFormat("dd/MM/yyyy (hh:mm:ss)");

        String toParse = "20/12/2014 (02:30:00)";
        Date date = df.parse(toParse);

        EventWithSerializer event = new EventWithSerializer("MyName", date);

        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(event));
    }
}