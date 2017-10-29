
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SchrankeTest {
	
	Schranke s1 = new Schranke();
	
	public void einfahrt_ticketWith0Mins() {
		Zeitkarte ticket = s1.einfahrt();
		assertEquals(0,ticket.parkzeit_in_minuten());
   }
}
