import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@SuppressWarnings("deprecation")
	@Test
	public void TestAlter( ) {
		Student s1 = new Student ("Marco",1997,60);
		assertEquals("TestAlter",22,s1.getAlter());
	}

}
