package tests.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserWithRootTest {

    @Test
    public void userWithRoot() throws JsonProcessingException {
        UserWithRoot userr = new UserWithRoot(12, "Doom");

        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userr));

        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userr));
    }

}