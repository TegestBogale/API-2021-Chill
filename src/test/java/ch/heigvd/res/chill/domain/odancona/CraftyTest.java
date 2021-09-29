package ch.heigvd.res.chill.domain.odancona;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.odancona.Crafty;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CraftyTest {

  @Test
  void thePriceAndNameForCraftyShouldBeCorrect() {
    Crafty beer = new Crafty();
    assertEquals(beer.getName(), Crafty.NAME);
    assertEquals(beer.getPrice(), Crafty.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCrafty() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.odancona.Crafty";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Crafty.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}