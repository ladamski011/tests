package tests.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeanToDeserializeTest {

    @Test
    public void testJsonCreator() throws JsonProcessingException {
        BeanToSerialize bean = new BeanToSerialize("Lukasz", 99);

        String json = new ObjectMapper().writeValueAsString(bean);

        ObjectMapper mapper = new ObjectMapper();
        BeanToDeserialize deserialize = mapper.readerFor(BeanToDeserialize.class).readValue(json);

        assertEquals(bean.name, deserialize.myName);
    }

}