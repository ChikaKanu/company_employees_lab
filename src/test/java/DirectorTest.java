import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director(500000, "Orange Paine", 204376, 40000, "Board of Directors");
    }

    @Test
    public void canGetName() {
        director.setName("Jacky Chan");
        assertEquals("Jacky Chan", director.getName());
    }

    @Test
    public void cannotSetNameIfNullOrEmpty() {
        director.setName("");
        director.setName(null);
        assertEquals("Orange Paine", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        int newNiNumber = 504652;
        director.setNiNumber(newNiNumber);
        assertEquals(504652, director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        director.setSalary(50000);
        assertEquals(50000,director.getSalary(),2);
    }

    @Test
    public void canGetDepartment() {
        assertEquals("Board of Directors", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000);
        assertEquals(50000, director.getSalary(),4);
    }

    @Test
    public void cannotRaiseSalaryNegativeAmount() {
        director.raiseSalary(-50000);
        assertEquals(40000, director.getSalary(),4);
    }

    @Test
    public void canPayBonus() {
        assertEquals(800, director.payBonus(), 3);
    }
}
