package cards.game;

public class TrumpTest {

    public static void main(String[] args) {
        Trump trump = new Trump();
        trump.setTrump();
        System.out.println(trump.getTrump());
        System.out.println(trump.isTrumpOpen());
        trump.openTrump();
        System.out.println(trump.isTrumpOpen());
    }
}
