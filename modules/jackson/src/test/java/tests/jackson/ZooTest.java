package tests.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    public void testTypes() throws JsonProcessingException {
        Zoo.Dog dog = new Zoo.Dog(10);

        String serializedDog = new ObjectMapper().writeValueAsString(dog);

        Zoo.Cat cat = new Zoo.Cat(true, 8);

        String serializedCat = new ObjectMapper().writeValueAsString(cat);


        ObjectReader reader = new ObjectMapper().readerFor(Zoo.class);

        Zoo deserializedDog = reader.readValue(serializedDog);
        Zoo deserializedCat = reader.readValue(serializedCat);


    }
}