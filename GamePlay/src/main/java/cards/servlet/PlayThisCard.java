package cards.servlet;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayThisCard {

  @JsonProperty("player_id")
  private int playerID;

  @JsonProperty("player_name")
  private String playerName;

  @JsonProperty("cards_in_hand")
  private CardJson cardsInHand;
}
