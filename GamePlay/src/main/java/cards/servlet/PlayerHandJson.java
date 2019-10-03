package cards.servlet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PlayerHandJson {

  @JsonProperty("player_id")
  private int playerID;

  @JsonProperty("player_name")
  private String playerName;

  @JsonProperty("cards_in_hand")
  private List<CardJson> cardsInHand;

  public PlayerHandJson(int playerID, String playerName) {
    this.playerID = playerID;
    this.playerName = playerName;
    this.cardsInHand = new ArrayList<>();
  }

  public PlayerHandJson(int playerID, String playerName,
      List<CardJson> cardsInHand) {
    this.playerID = playerID;
    this.playerName = playerName;
    this.cardsInHand = cardsInHand;
  }

  public void addCard(CardJson cardJson){
    cardsInHand.add(cardJson);
  }
}
