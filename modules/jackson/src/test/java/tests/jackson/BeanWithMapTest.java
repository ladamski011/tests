package tests.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class BeanWithMapTest {
    @Test
    public void testBasicSerialization() throws JsonProcessingException {
        BeanWithMap beanWithMap = new BeanWithMap("bean1");
        beanWithMap.getMap().put("key1", "val1");
        beanWithMap.getMap().put("key2", "val2");

        String result = new ObjectMapper().writeValueAsString(beanWithMap);

        assertThat(result, containsString("key1"));
        assertThat(result, containsString("val1"));
        assertThat(result, equalTo("{\"key1\":\"val1\",\"key2\":\"val2\"}"));

        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(beanWithMap));
    }

}