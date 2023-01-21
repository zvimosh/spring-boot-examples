package com.neo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
-import org.springframework.boot.test.context.SpringBootTest;

-@SpringBootTest
 class ApplicationIntegrationTest {

   @Test
   void contextLoads() {
     // empty test that would fail if our Spring configuration does not load correctly
   }
 }
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
