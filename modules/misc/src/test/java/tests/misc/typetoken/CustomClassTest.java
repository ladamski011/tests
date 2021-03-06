package tests.misc.typetoken;

import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class CustomClassTest {
    @Test
    public void invokable() throws NoSuchMethodException {
        Method method = CustomClass.class.getMethod("somePublicMethod");
        Invokable<CustomClass, ?> invokable
                = new TypeToken<CustomClass>() {}
                .method(method);

        boolean isPublicStandradJava = Modifier.isPublic(method.getModifiers());
        boolean isPublicGuava = invokable.isPublic();

        assertTrue(isPublicStandradJava);
        assertTrue(isPublicGuava);
    }
}