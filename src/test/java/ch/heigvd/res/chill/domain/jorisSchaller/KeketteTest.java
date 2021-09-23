package ch.heigvd.res.chill.domain.jorisSchaller;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class KeketteTest {
    @Test
    void thePriceAndNameForKeketteShouldBeCorrect() {
        Kekette beer = new Kekette();
        assertEquals(beer.getName(), Kekette.NAME);
        assertEquals(beer.getPrice(), Kekette.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKekette() {
        Bartender janeWhereIsMyBeer = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.jorisSchaller.Kekette";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = janeWhereIsMyBeer.order(request);
        BigDecimal expectedTotalPrice = Kekette.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}