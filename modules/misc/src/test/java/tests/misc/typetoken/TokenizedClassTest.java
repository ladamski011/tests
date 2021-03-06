package tests.misc.typetoken;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TokenizedClassTest {
    @Test
    public void erasureTest() {
        List<String> stringList = Lists.newArrayList();
        List<Integer> intList = Lists.newArrayList();

        boolean result = stringList.getClass()
                .isAssignableFrom(intList.getClass());

        assertTrue(result);
        getClass();
    }
}