import ie.atu.exam2025.Passenger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertations.*;
public class PassengerTest {
    @Test
    public void testGetters() {
        Passenger passenger = new Passenger("Mr", "Alex", "Murphy", 30, "123456");

        assertEquals("Mr", passenger.getTitle());
        assertEquals("Alex", passenger.getFirstName());
        assertEquals("Murphy", passenger.getLastName());
        assertEquals(30, passenger.getAge());
    }
}
