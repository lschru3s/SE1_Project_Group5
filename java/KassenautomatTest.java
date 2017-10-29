import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KassenautomatTest {
	
	Kassenautomat k1 = new Kassenautomat();
	Zeitkarte ticket = new Zeitkarte();
	
	@Test
	public void bezahlen_ticketIstBezahlt() {
		k1.bezahlen(ticket);
		assertEquals(true,ticket.bezahlt());
	}

}
