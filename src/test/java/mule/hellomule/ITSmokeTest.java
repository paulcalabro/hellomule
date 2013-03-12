package mule.hellomule;

import static net.sourceforge.jwebunit.junit.JWebUnit.assertResponseCode;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTextPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;

import org.junit.Test;

public class ITSmokeTest {

		@Test
		public void test1() {
			setBaseUrl("http://localhost:8081");
			beginAt("/world");
			assertResponseCode(200);
			assertTextPresent("hello world");
		}
}
