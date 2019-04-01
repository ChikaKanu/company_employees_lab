import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("John Parker", 024356, 20000, "Training & Development");
    }

    @Test
    public void canGetName() {
        manager.setName("Malcom Blue");
        assertEquals("Malcom Blue", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        int newNiNumber = 004652;
        manager.setNiNumber(newNiNumber);
        assertEquals(004652, manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        manager.setSalary(22009);
        assertEquals(22009, manager.getSalary(),2);
    }

    @Test
    public void canGetDepartment() {
        assertEquals("Training & Development", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500);
        assertEquals(20500, manager.getSalary(),4);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, manager.payBonus(), 3);
    }
}
