/**
 * An individual playing card.
 * 
 * @author Chris Mayfield
 * @version 12/29/2015
 */
public class Card {
    
    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};
    
    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};
    
    private int rank;
    
    private int suit;
    
    /**
     * Constructs a card of the given rank and suit.
     * Invalid arguments are replaced with defaults.
     *
     * @param rank the card's rank (default: 1)
     * @param suit the card's suit (default: 0)
     */
    public Card(int rank, int suit) {
        if (rank >= 1 && rank < RANKS.length) {
            this.rank = rank;
        } else {
            this.rank = 1;
        }
        if (suit >= 0 && suit < SUITS.length) {
            this.suit = suit;
        } else {
            this.suit = 0;
        }
    }
    
    /**
     * Returns a negative integer if this card comes before
     * the given card, zero if the two cards are equal, or
     * a positive integer if this card comes after the card.
     */
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }
    
    /**
     * Returns true if the given card has the same
     * rank AND same suit; otherwise returns false.
     */
    public boolean equals(Card that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }
    
    /**
     * Gets the card's rank.
     */
    public int getRank() {
        return this.rank;
    }
    
    /**
     * Gets the card's suit.
     */
    public int getSuit() {
        return this.suit;
    }
    
    /**
     * Returns true if the given card has the same
     * rank OR same suit; otherwise returns false.
     */
    public boolean isLike(Card that) {
        return this.rank == that.rank
            || this.suit == that.suit;
    }
    
    /**
     * Returns the card's index in a sorted deck of 52 cards.
     */
    public int position() {
        return this.suit * 13 + this.rank - 1;
    }
    
    /**
     * Returns a string representation of the card.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
    
}
