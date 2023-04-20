import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocalTest {
    @Test
    public void testPersonChecker(){

        ArrayList<Person> people = new ArrayList<Person>();

        Person p = new Person("Fred", Person.Sex.MALE, "wethekutest@hotmail.com");
        people.add(p);
        people.add(new Person("Nona", Person.Sex.FEMALE, "cutegurl96@hotmail.com"));
        people.add(new Person("Hiep", Person.Sex.FEMALE, "hiepiscool@hotmail.com"));

        String expected = p.printPerson();

        String actual = PersonService.printPersons(people, new PersonChecker());
        Assert.assertEquals(expected, actual);
    }
}
