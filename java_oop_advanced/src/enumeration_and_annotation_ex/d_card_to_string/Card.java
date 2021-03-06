package enumeration_and_annotation_ex.d_card_to_string;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank.name(), this.suit.name(), this.getPower());
    }

    private int getPower(){
        return this.rank.getPower() + this.suit.getPower();
    }
}
