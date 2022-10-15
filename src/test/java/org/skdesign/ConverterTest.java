package org.skdesign;



import org.junit.Test;

import java.io.IOException;
import java.util.Currency;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConverterTest {

    @Test
    public void converter() throws IOException, InterruptedException {
        Currency from = Currency.getInstance("USD");
        Currency to = Currency.getInstance("USD");
        double amount = 1.0;

        double testExchange = Converter.converter(from, to, amount);
        try {
            assertEquals(1.0, testExchange);
            System.out.println(from + " " + to + " " + amount);
            System.out.println(testExchange);
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}