package cards.servlet;



import cards.basic.Card;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  @RequestMapping("")
  public String homePage(){
    return "Hello World!";
  }

  @RequestMapping(value = "/api",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public String test(){
    return "{\"message\" : \"Hello World!!!\"}C";
  }

  @RequestMapping(value = "/card", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public CardJson getSameCard(@RequestBody CardJson cardJson){
    return cardJson;
  }

  @RequestMapping(value = "/player_hand", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public PlayerHandJson getPlayerDetails(@RequestHeader(value = "player_id") int id, @RequestHeader(value = "name") String name)
  {
    PlayerHandJson hand = new PlayerHandJson(id, name);
    hand.addCard(new CardJson(23, "10D"));
    hand.addCard(new CardJson(23, "JD"));
    hand.addCard(new CardJson(23, "AD"));
    hand.addCard(new CardJson(23, "3D"));
    return hand;
  }

  @RequestMapping(value = "/play_this_card", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public void played_this_card(@RequestBody PlayThisCard cardPlayed){
    CardJson cj = cardPlayed.getCardsInHand();
    Card c = Card.findCardByString(cj.getCardByString());
    System.out.println(c.getCardFullString());
  }
}
