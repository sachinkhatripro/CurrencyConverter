package org.skdesign;




import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestJunit {


    @Test
    public void testAdd(){
        String str = "Junit is working fine.";
try {
    assertEquals("Junit is working fine.", str, "OK");
    System.out.println("Junit is working fine.");
}catch (Exception e) {
    System.out.println(e.getMessage());
}
    }
}
