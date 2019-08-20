package com.empresa;

import com.empresa.services.Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {

	@Test
	public void contextLoads() {
            Utils u = new Utils();
            System.out.println("Hola Juanito Por TEST " + u.test());
	}
        
        @Test
	public void testDos() {
            Utils u = new Utils();
            System.out.println("SEGUNDO TEST" + u.test());
	}


}
