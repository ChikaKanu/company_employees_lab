import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Chika Kanu", 98675, 18000);
    }

    @Test
    public void canGetName() {
        databaseAdmin.setName("Cull Blue");
        assertEquals("Cull Blue", databaseAdmin.getName());
    }

    @Test
    public void cannotSetNameIfNullOrEmpty() {
        databaseAdmin.setName("");
        databaseAdmin.setName(null);
        assertEquals("Chika Kanu", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        int newNiNumber = 10752;
        databaseAdmin.setNiNumber(newNiNumber);
        assertEquals(10752,  databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        databaseAdmin.setSalary(19000);
        assertEquals(19000,  databaseAdmin.getSalary(),2);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(500);
        assertEquals(18500,  databaseAdmin.getSalary(),4);
    }

    @Test
    public void cannotRaiseSalaryNegativeAmount() {
        databaseAdmin.raiseSalary(-5000);
        assertEquals(18000, databaseAdmin.getSalary(),4);
    }

    @Test
    public void canPayBonus() {
        assertEquals(180,  databaseAdmin.payBonus(), 2);
    }
}
