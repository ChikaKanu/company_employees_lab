import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jack Bull", 10675, 19000);
    }

    @Test
    public void canGetName() {
        developer.setName("Rich Diamond");
        assertEquals("Rich Diamond", developer.getName());
    }

    public void canGetNiNumber() {
        int newNiNumber = 10752;
        developer.setNiNumber(newNiNumber);
        assertEquals(10752,  developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        developer.setSalary(19000);
        assertEquals(19000,  developer.getSalary(),2);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(500);
        assertEquals(19500,  developer.getSalary(),4);
    }

    @Test
    public void cannotRaiseSalaryNegativeAmount() {
        developer.raiseSalary(-500);
        assertEquals(19000, developer.getSalary(),4);
    }

    @Test
    public void canPayBonus() {
        assertEquals(190,  developer.payBonus(), 2);
    }

}
