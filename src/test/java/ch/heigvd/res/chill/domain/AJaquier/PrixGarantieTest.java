package ch.heigvd.res.chill.domain.AJaquier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrixGarantieTest {
    @Test
    void thePriceAndNameForPrixGarantieShouldBeCorrect() {
        PrixGarantie beer = new PrixGarantie();
        assertEquals(beer.getName(), PrixGarantie.NAME);
        assertEquals(beer.getPrice(), PrixGarantie.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPrixGarantie() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.AJaquier.PrixGarantie";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = PrixGarantie.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
