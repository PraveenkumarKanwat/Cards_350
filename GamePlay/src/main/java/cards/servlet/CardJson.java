package cards.servlet;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardJson {
    @JsonProperty("card_by_id")
    private int cardByID;

    @JsonProperty("card_by_string")
    private String cardByString;

    public CardJson(int cardByID, String cardByString) {
        this.cardByID = cardByID;
        this.cardByString = cardByString;
    }
}
