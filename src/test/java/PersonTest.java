
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    @DataProvider(name = "ageData")
    public Object[][] createAgeData() {
        return new Object[][]{
                {13, true},
                {14, true},
                {18, true},
                {19, true},
                {12, false},
                {20, false},
                {-2, false},
                {0, false}
        };
    }

    @Test(dataProvider = "ageData")
    public void testIsTeenager(int age, boolean expected) {
        boolean result = Person.isTeenager(age);
        assertEquals(result, expected, "Age = " + age);
    }
}
