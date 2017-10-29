import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ZeitkarteTest {

	Zeitkarte ticket = new Zeitkarte();
	
	@Test
	public void parkkostenFor0Mins() {
		assertEquals(0,ticket.park_kosten());
	}

}
