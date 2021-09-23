package ch.heigvd.res.chill.domain.MrDaves24;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.MrDaves24.Anker;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnkerTest {

  @Test
  void thePriceAndNameForAnkerShouldBeCorrect() {
    Anker beer = new Anker();
    assertEquals(beer.getName(), Anker.NAME);
    assertEquals(beer.getPrice(), Anker.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForAnker() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MrDaves24.Anker";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Anker.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}