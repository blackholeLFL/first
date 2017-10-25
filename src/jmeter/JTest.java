package jmeter;

import static org.junit.Assert.*;
import org.junit.Test;

public class JTest {

	@Test
	public void testGetName() {
		jmeter aJmeter = new jmeter();
		String result = aJmeter.getName();
		assertEquals("myName", result);
	}

	@Test
	public void testGetFriend() {
		jmeter aJmeter = new jmeter();
		String result = aJmeter.getFriend();
		assertEquals("friendName", result);
	}

}
