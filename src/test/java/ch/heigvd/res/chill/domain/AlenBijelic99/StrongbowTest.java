package ch.heigvd.res.chill.domain.AlenBijelic99;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.AlenBijelic99.Strongbow;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrongbowTest {
    @Test
    void thePriceAndNameForStrongbowShouldBeCorrect() {
        Strongbow beer = new Strongbow();
        assertEquals(beer.getName(), Strongbow.NAME);
        assertEquals(beer.getPrice(), Strongbow.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForStrongbow() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.AlenBijelic99.Strongbow";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Strongbow.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
