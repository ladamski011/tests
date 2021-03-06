package tests.testing.templates;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BiscuitTest {
    @Test
    public void testEquals() {
        Biscuit theBiscuit = new Biscuit("Ginger");
        Biscuit myBiscuit = new Biscuit("Ginger");
        assertThat(theBiscuit, equalTo(myBiscuit));
    }

    @ParameterizedTest
    @CsvSource({
            "buc, The name is buc",
            "kutas, The name is kutas"
    })
    public void testDisplayName(String input, String expectedValue) {
        assertThat(new Biscuit(input).getDisplayName(), equalTo(expectedValue));
    }

    @ParameterizedTest
    @CsvSource({
            "apple,         1",
            "banana,        2",
            "'lemon, lime', 0xF1"
    })
    void testWithCsvSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    class Biscuit {
        String name;

        public Biscuit(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return "The name is " + name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return ((Biscuit) obj).name.equals(this.name);
        }
    }
} 