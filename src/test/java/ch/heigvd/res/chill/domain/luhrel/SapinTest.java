package ch.heigvd.res.chill.domain.luhrel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SapinTest {
    @Test
    void thePriceAndNameForSapinShouldBeCorrect() {
        Sapin beer = new Sapin();
        assertEquals(beer.getName(), Sapin.NAME);
        assertEquals(beer.getPrice(), Sapin.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSapin() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.luhrel.Sapin";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Sapin.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
